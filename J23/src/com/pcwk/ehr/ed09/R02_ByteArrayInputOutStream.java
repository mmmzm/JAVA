package com.pcwk.ehr.ed09;
import java.io.*;
import java.util.Arrays;

public class R02_ByteArrayInputOutStream {

	public static void main(String[] args) {
		
		ByteArrayInputStream   bais = null;//읽기
		ByteArrayOutputStream  baos = null;//쓰기
		
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;//기록
		byte[] temp   = new byte[4];//buffer
		
		
		bais = new ByteArrayInputStream(inSrc);
		baos = new ByteArrayOutputStream();
		
		try {
		
			while(bais.available()>0) {//읽을 수 있는 byte수
				//readBytCnt : 읽어 들인 수
				int readBytCnt = bais.read(temp);
				//0~4
				//0~4
				//0~2
				baos.write(temp,0,readBytCnt);
				
				outSrc = baos.toByteArray();
				
				//System.out.println("cnt:"+readBytCnt+" temp:"+Arrays.toString(temp));
				System.out.println("cnt:"+readBytCnt+" outSrc:"+Arrays.toString(outSrc));
				
			}
		}catch(IOException e) {
			System.out.println("IOException:"+e.getMessage());
		}
		
		
		//스트림의 내용을 byte배열로 변환
		
		outSrc = baos.toByteArray();
		System.out.println("inSrc:"+Arrays.toString(inSrc));
		System.out.println("outSrc:"+Arrays.toString(outSrc));
		
	}

}
//cnt:4 outSrc:[0, 1, 2, 3]
//cnt:4 outSrc:[0, 1, 2, 3, 4, 5, 6, 7]
//cnt:2 outSrc:[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
//inSrc:[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
//outSrc:[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
