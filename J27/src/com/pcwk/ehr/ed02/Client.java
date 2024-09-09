package com.pcwk.ehr.ed02;

import java.io.*;
import java.net.*;

import static com.pcwk.ehr.ed02.Server.PORT;
import static com.pcwk.ehr.ed02.Server.USER;
public class Client {
	static final String SERVER_IP = "192.168.0.53";
	
	public static void main(String[] args) {
		
		try {
			//client socket생성
			Socket socket=new Socket(SERVER_IP, PORT);
			System.out.println("서버 접속...");
			
			// 송신/수신 용 객체 생성
			Sender sender = new Sender(socket, USER);
			Receiver receiver = new Receiver(socket);

			// thread에 run메서드 실행
			sender.start();
			receiver.start();			
			
		}catch(IOException e) {
			
		}

	}

}
