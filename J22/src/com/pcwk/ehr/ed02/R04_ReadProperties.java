package com.pcwk.ehr.ed02;

import java.util.*;
import java.io.*;


public class R04_ReadProperties {

	public static void main(String[] args) {
		//properties객체 생성
		Properties  properties=new Properties();
		//D:\JAP_20249311\01_JAVA\WORKSPACE\J22\src\com\pcwk\ehr\ed02\db_config.properties
		String filePath = "D:\\JAP_20249311\\01_JAVA\\WORKSPACE\\J22\\src\\com\\pcwk\\ehr\\ed02\\db_config.properties";
		
		FileInputStream  fileInputStream = null;
		
		
		try {
			fileInputStream = new FileInputStream(filePath);
			
			properties.load(fileInputStream);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("FileNotFoundException:"+e.getMessage());
		} catch (IOException e) {
			System.out.println("IOException:"+e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("IOException:"+e.getMessage());
			e.printStackTrace();			
		}finally {
			if(null != fileInputStream) {
				try {
					fileInputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		String url =properties.getProperty("db.url");
		String username =properties.getProperty("db.username");
		String password =properties.getProperty("db.password");
		
		String retrieve =properties.getProperty("retrieve");
		System.out.println("url:"+url);
		System.out.println("username:"+username);
		System.out.println("password:"+password);
		System.out.println("retrieve:"+retrieve);
		System.out.println("-----------------------");
		System.out.println("-프로그램 종료-");
		System.out.println("-----------------------");
		
		
	}

}
//url:jdbc:oracle:thine:@192.168.0.30:1521:XE
//username:pcwk
//password:p4321
//retrieve:조회
//-----------------------
//-프로그램 종료-
//-----------------------
