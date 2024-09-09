package com.pcwk.ehr.ed01;

import java.util.ArrayList;//class
import java.util.Enumeration;
import java.util.Iterator;//interface
import java.util.List;
import java.util.Vector;

public class R04_Enumeration {

	public static void main(String[] args) {
		String []names = {"Alice","이상무","김수환무","Bob","Charlie"};

		Vector<String> nameList=new Vector<String>();
		
		
		//요소추가
		for(String name :names) {
			nameList.add(name);
		}
		
		//nameList:[Alice, 이상무, 김수환무, Bob, Charlie]
		System.out.println("nameList:"+nameList.toString());
		
		//iterator
		Enumeration<String> enume=nameList.elements();
		
		//Enumeration를 이용해 Vector에 데이터를 순차적으로 추출
		while(enume.hasMoreElements()) {
			String name = enume.nextElement();//데이터 추출
			System.out.println(name);
		}
//		Alice
//		이상무
//		김수환무
//		Bob
//		Charlie		
		
		
	}

}
