package com.pcwk.ehr.ed03;

import static com.pcwk.ehr.ed03.MultiServer.PORT;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

import com.pcwk.ehr.cmn.PLog;

public class Client implements PLog {

	// Server IP
	static final String SERVER_IP = "192.168.0.30";

	static class ClientSender extends Thread {
		Socket socket;
		String name;
		DataOutputStream out;

		ClientSender(Socket socket, String name) {
			this.socket = socket;
			this.name = name;

			try {
				out = new DataOutputStream(socket.getOutputStream());

			} catch (IOException e) {
				LOG.debug("ClientSender():" + e.getMessage());
			}
		}

		@Override
		public void run() {
			Scanner scanner = new Scanner(System.in);

			if (null != out) {
				try {
					// Server로 전송할 이름
					out.writeUTF(name);

					// Server로 채팅 메시지 전송
					while (null != out) {
						String message = "[" + name + "]" + scanner.nextLine();
						out.writeUTF(message);
					}

				} catch (IOException e) {
					LOG.debug("ClientSender run():" + e.getMessage());
				}

			} // --if end

		}
	}// ClientSender end

	static class ClientReceiver extends Thread {
		Socket socket;
		DataInputStream in;

		ClientReceiver(Socket socket) {
			this.socket = socket;

			try {
				in = new DataInputStream(socket.getInputStream());
			} catch (IOException e) {
				LOG.debug("ClientReceiver():" + e.getMessage());
			}
		}

		@Override
		public void run() {
			while (null != in) {
				try {
					System.out.println(in.readUTF());
				} catch (IOException e) {
					LOG.debug("ClientReceiver run():" + e.getMessage());
				}
			}

		}

	}// ClientReceiver end

	public static void main(String[] args) {

		// 대화명
		if (args.length != 1) {
			LOG.debug("대화명을 입력 하세요.");
			System.exit(0);
		}

		String chatId = args[0];

		try {
			// Socket생성
			Socket socket = new Socket(SERVER_IP, PORT);
			System.out.println("[" + SERVER_IP + ":" + PORT + "] 서버에 접속 되었습니다.");

			// ClientSender생성
			Thread sender = new Thread(new ClientSender(socket, chatId));
			sender.start();

			// ClientReceiver생성
			Thread receiver = new Thread(new ClientReceiver(socket));
			receiver.start();

		} catch (IOException e) {

		}

	}

}
