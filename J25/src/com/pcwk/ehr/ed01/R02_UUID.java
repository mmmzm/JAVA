package com.pcwk.ehr.ed01;

import java.util.UUID;

public class R02_UUID {

	public static void main(String[] args) {
		// UUID 128bit숫자
		// 32자리 16진수
		// 8-4-4-4-12
		
		String resultUUID = "";
		UUID uuidTemp = UUID.randomUUID();
		
		System.out.println(uuidTemp);
		System.out.println(uuidTemp.toString().replaceAll("-", "").length());

	}

}
