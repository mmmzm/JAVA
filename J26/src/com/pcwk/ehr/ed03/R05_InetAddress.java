package com.pcwk.ehr.ed03;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class R05_InetAddress {

	public static void main(String[] args) {
		String naverHost = "www.naver.com";

		try {
			InetAddress address = InetAddress.getByName(naverHost);

			// 호스트 이름
			System.out.println("호스트 이름:" + address.getHostName());

			// IP주소
			System.out.println("IP주소:" + address.getHostAddress());

			// 모든 IP주소
			InetAddress[] ipArray = InetAddress.getAllByName(naverHost);

			for (InetAddress ia : ipArray) {
				System.out.println(ia.toString());
			}

		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
//호스트 이름:www.naver.com
//IP주소:223.130.200.219
//www.naver.com/223.130.200.219
//www.naver.com/223.130.200.236
//www.naver.com/223.130.192.247
//www.naver.com/223.130.192.248