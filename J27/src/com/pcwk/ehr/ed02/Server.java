package com.pcwk.ehr.ed02;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	static final int PORT = 9000;
	static final String USER = "hykim22]";

	public static void main(String[] args) {

		// client 최초 접속 용청시 사용
		ServerSocket serverSocket = null;

		// client 통신용
		Socket socket = null;

		try {
			serverSocket = new ServerSocket(PORT);
			System.out.println("Server ready ...");

			socket = serverSocket.accept();

			// 송신/수신 용 객체 생성
			Sender sender = new Sender(socket, USER);
			Receiver receiver = new Receiver(socket);

			// thread에 run메서드 실행
			sender.start();
			receiver.start();

		} catch (IOException e) {

		}

	}

}
