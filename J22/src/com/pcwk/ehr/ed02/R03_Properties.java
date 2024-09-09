package com.pcwk.ehr.ed02;

import java.util.Properties;
import java.util.Enumeration;

public class R03_Properties {

	//printProperties
	//void
	//Properties  prop
	
	static void printProperties(Properties  prop) {
		Enumeration  enumeration = prop.propertyNames();
		
		while(enumeration.hasMoreElements()) {
			String key = (String) enumeration.nextElement();
			
			//key로 value조회
			String value =prop.getProperty(key);
			
			System.out.println(key+":"+value);
		}		
	}
	
	public static void main(String[] args) {
		//Properties객체 생성
		Properties  prop=new Properties();
		
		//key,value저장
		prop.setProperty("apple", "3000");
		prop.setProperty("language", "kr");
		prop.setProperty("banana", "1000");
		prop.setProperty("orange", "1500");
		
		
		//properties의 모든 요소 출력
//		Enumeration  enumeration = prop.propertyNames();
//		
//		while(enumeration.hasMoreElements()) {
//			String key = (String) enumeration.nextElement();
//			
//			//key로 value조회
//			String value =prop.getProperty(key);
//			
//			System.out.println(key+":"+value);
//		}
		
		//사용자 정의 properties
		printProperties(prop);
		
		//값 변경
		prop.setProperty("apple", "3500");
		System.out.println(prop.getProperty("apple"));
		
		System.out.println("------------------------------------------------");
		
		//시스템 속성
		Properties  sysProp =  System.getProperties();
		System.out.println("java.version:"+sysProp.getProperty("java.version"));
		
		printProperties(sysProp);
		System.out.println("=================================================");
		
		sysProp.list(System.out);
		
		
		
		
	}

}
