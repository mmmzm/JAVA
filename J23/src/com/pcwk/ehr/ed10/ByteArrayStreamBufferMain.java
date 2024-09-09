package com.pcwk.ehr.ed10;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayStreamBufferMain {

	public static void main(String[] args) {
		// 데이터를 저장할 바이트 배열 생성
		byte[] data = "Hello, World!".getBytes();

		// ByteArrayOutputStream을 사용하여 데이터를 바이트 배열에 쓰기
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		try {
			byteArrayOutputStream.write(data);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// ByteArrayOutputStream에 저장된 데이터를 바이트 배열로 가져오기
		byte[] byteArray = byteArrayOutputStream.toByteArray();

		// ByteArrayInputStream을 사용하여 바이트 배열에서 데이터 읽기
		ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);

		// 바이트 배열에서 읽은 데이터 출력
		int byteRead;
		while ((byteRead = byteArrayInputStream.read()) != -1) {
			System.out.print((char) byteRead);
		}

		// 스트림 닫기
		try {
			byteArrayInputStream.close();
			byteArrayOutputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
//Hello, World!