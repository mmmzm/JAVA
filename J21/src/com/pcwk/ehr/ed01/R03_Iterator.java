package com.pcwk.ehr.ed01;

import java.util.ArrayList;//class
import java.util.Iterator;//interface
import java.util.List;

public class R03_Iterator {

	public static void main(String[] args) {
		String []names = {"Alice","이상무","김수환무","Bob","Charlie"};

		List<String> nameList=new ArrayList<String>();
		
		
		//요소추가
		for(String name :names) {
			nameList.add(name);
		}
		
		//nameList:[Alice, 이상무, 김수환무, Bob, Charlie]
		System.out.println("nameList:"+nameList.toString());
		
		//iterator
		Iterator<String> iter=nameList.iterator();
		
		//Iterator를 이용해 List에 데이터를 순차적으로 추출
		while(iter.hasNext()) {
			String name = iter.next();//데이터 추출
			System.out.println(name);
		}
//		Alice
//		이상무
//		김수환무
//		Bob
//		Charlie		
		
		
	}

}
