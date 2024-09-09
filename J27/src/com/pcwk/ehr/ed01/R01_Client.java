package com.pcwk.ehr.ed01;

import java.io.*;
import java.net.*;


public class R01_Client {
	//Server IP
	static final String SERVER_IP = "192.168.0.53";
	
	//Server PORT
	static final int PORT = 8888;
	
	public static void main(String[] args) {
		System.out.println("서버에 연결 중 : "+SERVER_IP +" "+PORT);
		
		Socket  socket = null;
		
		try {
			socket = new Socket(SERVER_IP, PORT);
			
			//소켓을 통한 InputStream생성: 서버데이터 수신
			InputStream  in = socket.getInputStream();
			DataInputStream  dis=new DataInputStream(in);
			
			//서버 메시지 받기
			String message = dis.readUTF();
			System.out.println("서버 수신 메시지: "+message);
			System.out.println("Client연결 종료");
			
			//스트림 종료
			dis.close();
			socket.close();
			
		}catch(IOException e) {
			System.out.println("-------------------");
			System.out.println("-IOException-" + e.getMessage());
			System.out.println("-------------------");			
		}
		
		System.out.println("------------------");
		System.out.println("-Client 프로그램 종료-");
		System.out.println("------------------");		

	}

}
