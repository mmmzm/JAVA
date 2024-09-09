package com.pcwk.ehr.ed01;

import java.io.*;

public class R03_Finally {

	public static void main(String[] args) {
		FileInputStream fis= null;
		
		System.out.println("A");
		//D:\JAP_20249311\01_JAVA\WORKSPACE\J16\src\com\pcwk\ehr\ed01\R03_Finally.java
		//String fileName = "D:\\JAP_20249311\\01_JAVA\\WORKSPACE\\J16\\src\\com\\pcwk\\ehr\\ed01\\R03_Finally.java99";
		String fileName = "D:\\JAP_20249311\\01_JAVA\\WORKSPACE\\J16\\src\\com\\pcwk\\ehr\\ed01\\R03_Finally.java";

		try {
			System.out.println("B");
			fis = new FileInputStream(fileName);
			System.out.println("C");
		} catch (FileNotFoundException e) {
			System.out.println("D "+e.getMessage());
			//e.printStackTrace();
		} finally {
			System.out.println("finally ---E");
			
			if(null !=fis) {	
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		System.out.println("┌─────────────────────────────────┐");
		System.out.println("│프로그램 종료                                            │");
		System.out.println("└─────────────────────────────────┘");
		
	}

}
//A
//B
//C
//finally ---E
//┌─────────────────────────────────┐
//│프로그램 종료                                            │
//└─────────────────────────────────┘
