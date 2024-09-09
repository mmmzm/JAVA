package com.pcwk.ehr.ed02;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 * 1:1 체팅에서 메시지 전송!
 * 
 * @author acorn
 *
 */
public class Sender extends Thread {

	Socket socket;
	DataOutputStream out;
	String name;

	public Sender(Socket socket,String name) {
		this.socket = socket;

		try {
			out = new DataOutputStream(socket.getOutputStream());

			// ip port
			//name = "[" + socket.getInetAddress() + ":" + socket.getPort() + "]";
			this.name = name;
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void run() {
		// console입력, 상대방에 전달.
		Scanner scanner = new Scanner(System.in);
		while (null != out) {
			try {
				out.writeUTF(name + scanner.nextLine());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
