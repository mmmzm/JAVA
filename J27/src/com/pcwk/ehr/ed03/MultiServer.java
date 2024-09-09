package com.pcwk.ehr.ed03;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

import com.pcwk.ehr.cmn.PLog;

public class MultiServer implements PLog {

	// client 정보: Thread safe
	HashMap<String, DataOutputStream> clients;
	static final int PORT = 9999;

	public MultiServer() {
		// System.out.println("default 생성자");
		clients = new HashMap<String, DataOutputStream>();

		// map Thread safe하게 처리
		Collections.synchronizedMap(clients);

	}

	// Server Socket생성
	// ServerReceiver 생성 : run()호출
	public void start() {
		// 서버socket생성
		ServerSocket serverSocket = null;

		// Socket
		Socket socket = null;

		try {
			serverSocket = new ServerSocket(PORT);
			System.out.println("Server start ...");

			while (true) {
				socket = serverSocket.accept();
				LOG.debug("[" + socket.getInetAddress() + "]에서 접속 했습니다.");

				// ServerReceiver 생성
				ServerReceiver serverReceiver = new ServerReceiver(socket);
				serverReceiver.start();

			} // while end

		} catch (IOException e) {

		}
	}

	class ServerReceiver extends Thread {
		Socket socket;
		DataInputStream in;
		DataOutputStream out;

		ServerReceiver(Socket socket) {
			this.socket = socket;

			try {
				in = new DataInputStream(socket.getInputStream());
				out = new DataOutputStream(socket.getOutputStream());

			} catch (IOException e) {
				System.out.println("IOException:" + e.getMessage());
			}

		}// ServerReceiver

		// 접속된 모든 사용자 에게 메시지 전달
		public void sendToAll(String message) {
			// 모든 client
			Iterator<String> namesIter = clients.keySet().iterator();

			while (namesIter.hasNext() == true) {
				DataOutputStream out = clients.get(namesIter.next());

				try {
					out.writeUTF(message);
				} catch (IOException e) {
					System.out.println("sendToAll()-IOException :" + e.getMessage());
				}
			} // --while

		}// --sendToAll

		@Override
		public void run() {
			// 접속자 이름
			String name = "";

			try {
				name = in.readUTF();// client 이름

				// 접속된 모든 사용자에게 전달: 접속자
				String firstMsg = "*" + name + "님이 접속 했습니다.";
				sendToAll(firstMsg);

				// clients추가
				clients.put(name, out);
				LOG.debug("현재 접속자 수 " + clients.size() + "명 입니다.");

				// 채팅:
				while (null != in) {

					String clientMsg = in.readUTF();
					LOG.debug("client 메시지: " + clientMsg);
					sendToAll(clientMsg);

				} // --while end

			} catch (IOException e) {

			} finally {
				// 자원 반납: 접속종료
				sendToAll("#" + name + "님이 퇴장 하셨습니다.");

				clients.remove(name);
				LOG.debug("현재 접속자 수 " + clients.size() + "명 입니다.");
				LOG.debug("#" + name + "님이 퇴장 하셨습니다.\n[" + socket.getInetAddress() + "]");
			}

		}

	}

	public static void main(String[] args) {
		new MultiServer().start();

	}

}
