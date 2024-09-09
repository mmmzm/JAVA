package com.pcwk.ehr.ed02;
import java.io.*;
public class R05_DataInputStream {

	public static void main(String[] args) {
		//데이터를 저장할 파일 경로
		String filePath = "pcwk20240412.txt";
		
		//데이터 쓰기: try-with-resource
		try(DataOutputStream  dos=new DataOutputStream(new FileOutputStream(filePath))){
			dos.writeInt(23);//정수 기록
			dos.writeDouble(99_999_999_999.0d);//실수 기록
			dos.writeUTF("Hello, world!");//문자열 쓰기
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		//데이터 읽기: 기록 순서대로 다시 읽어야 함.
		
		try(DataInputStream  dis=new DataInputStream(new FileInputStream(filePath))){
			
			int intValue = dis.readInt();//정수 읽기
			double doubleValue = dis.readDouble();//실수 읽기
			String stringValue = dis.readUTF();//문자열 읽기
			
			
			//읽어온 데이터 출력
			System.out.println("intValue:"+intValue);
			System.out.println("doubleValue:"+doubleValue);
			System.out.println("stringValue:"+stringValue);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("---------------------");
		System.out.println("-프로그램 종료-");
		System.out.println("---------------------");
	}

}
//intValue:23
//doubleValue:9.9999999999E10
//stringValue:Hello, world!
//---------------------
//-프로그램 종료-
//---------------------