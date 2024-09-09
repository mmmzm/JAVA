package com.pcwk.ehr.ed10;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteArrayStreamMain {

	public static void main(String[] args) throws IOException {
		// 데이터를 저장할 바이트 배열 생성
		byte[] data = "Hello, World!".getBytes();
		byte[] temp = new byte[4];
		
		
		// ByteArrayOutputStream을 사용하여 데이터를 바이트 배열에 쓰기
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();


		// ByteArrayInputStream을 사용하여 바이트 배열에서 데이터 읽기
		ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(data);

		// 바이트 배열에서 읽은 데이터 출력

		while (byteArrayInputStream.available()>0) {
			int readByte = byteArrayInputStream.read(temp);
			
			byteArrayOutputStream.write(temp,0,readByte);
			//System.out.println(readByte+","+Arrays.toString(temp));
			
		}

		// ByteArrayOutputStream에 저장된 데이터를 바이트 배열로 가져오기
		byte[] byteArray = byteArrayOutputStream.toByteArray();
		System.out.println("byteArray:"+Arrays.toString(byteArray));
		



        // ByteArrayInputStream을 사용하여 바이트 배열에서 데이터 읽기
        ByteArrayInputStream byteArrayInputStreamNew = new ByteArrayInputStream(byteArray);

        // 바이트 배열에서 읽은 데이터 출력
        int byteRead;
        while ((byteRead = byteArrayInputStreamNew.read()) != -1) {
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
//byteArray:[72, 101, 108, 108, 111, 44, 32, 87, 111, 114, 108, 100, 33]
//Hello, World!