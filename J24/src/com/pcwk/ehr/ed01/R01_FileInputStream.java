package com.pcwk.ehr.ed01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class R01_FileInputStream {

	public static void main(String[] args) {

		FileInputStream fis = null;
		try {
			if(args.length !=1) {
				System.out.println("parameter를 입력 하세요.");
				System.exit(0);
			}
			
			fis = new FileInputStream(args[0]);

			int data = 0;
			//D:\JAP_20249311\01_JAVA\WORKSPACE\J24\src\com\pcwk\ehr\ed01\R01_FileInputStream.java
			while ((data = fis.read()) != -1) {
				System.out.print((char) data);//
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (null != fis) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		System.out.println("-----------------------");
		System.out.println("-프로그램 종료-");
		System.out.println("-----------------------");

	}

}
