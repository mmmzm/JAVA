package com.pcwk.ehr.ed01;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class R01_TCPServer {

	static final int PORT = 8888;

	/**
	 * 현재 시간을 : yyyy-MM-dd HH:mm:ss 형식으로 돌려 준다.
	 * 
	 * @return
	 */
	public static String currDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(new Date());
	}

	public static void main(String[] args) {

		// ServerSocket
		ServerSocket serverSocket = null;// 서버소켓

		// Socket
		Socket clientSocket = null;// 소켓:client

		OutputStream out = null;
		DataOutputStream dos = null;

		try {

			// 8888 소버 소캣 생성
			serverSocket = new ServerSocket(PORT);
			System.out.println(currDate() + " Waiting for clients to connect...");

			// 무한 loop
			while (true) {
				// 서버소캣은 클라이언트 연결요청이 올 때까지 계속 대기한다.
				// 클라이언트의 연결요청이 들어 오면 클라이언트와 통신할 새로운 소캣을 생성한다.
				clientSocket = serverSocket.accept();

				// PS C:\Users\acorn> telnet 192.168.0.53 8888
				System.out.println(currDate() + " client IP: " + clientSocket.getInetAddress() + " Client connected");

				// 출력 스트림 생성
				out = clientSocket.getOutputStream();
				dos = new DataOutputStream(out);

				// client로 메시지 전송
				// This message if from server.
				// PS C:\Users\acorn> telnet 192.168.0.53 8888

				dos.writeUTF("This message if from server.\n 오늘은 즐거운 목요일 전날 입니다.");

				dos.close();
				clientSocket.close();

			} // while end

		} catch (IOException e) {
			System.out.println("-------------------");
			System.out.println("-IOException-" + e.getMessage());
			System.out.println("-------------------");
		}

	}

}
