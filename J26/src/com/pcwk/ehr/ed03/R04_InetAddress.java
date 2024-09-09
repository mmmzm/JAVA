package com.pcwk.ehr.ed03;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class R04_InetAddress {

	public static void main(String[] args) {
		//
		InetAddress local = null;

		try {
			local = InetAddress.getLocalHost();

			// 호스트 명
			System.out.println("호스트 명:" + local.getHostName());

			// 호스트 주소
			System.out.println("호스트 주소:" + local.getHostAddress());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
//호스트 명:user
//호스트 주소:192.168.0.30
