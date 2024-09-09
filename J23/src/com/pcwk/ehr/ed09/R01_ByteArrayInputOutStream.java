package com.pcwk.ehr.ed09;
import java.io.*;
import java.util.Arrays;

public class R01_ByteArrayInputOutStream {

	public static void main(String[] args) {
		
		ByteArrayInputStream   bais = null;//읽기
		ByteArrayOutputStream  baos = null;//쓰기
		
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;//기록
		
		
		bais = new ByteArrayInputStream(inSrc);
		baos = new ByteArrayOutputStream();
		
		int data = 0;
		while( (data=bais.read()) !=-1) { //읽기
			System.out.println("data:"+data);
			//쓰기
			baos.write(data);
		}
		
		//스트림의 내용을 byte배열로 변환
		
		outSrc = baos.toByteArray();
		System.out.println("inSrc:"+Arrays.toString(inSrc));
		System.out.println("outSrc:"+Arrays.toString(outSrc));
		
	}

}
//data:0
//data:1
//data:2
//data:3
//data:4
//data:5
//data:6
//data:7
//data:8
//data:9
//inSrc:[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
//outSrc:[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
