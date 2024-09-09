package com.pcwk.ehr.ed03;

import java.util.LinkedList;
import java.util.List;


public class R01_LinkedList {

	public static void dispList(List<String> list) {
		for( String subject :list) {
			System.out.print(subject+",");
		}
		
		System.out.println("\n================================");
	}
	
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		
		//요소추가
		linkedList.add("Java");
		linkedList.add("Oracle SQL");
		linkedList.add("Html");
		linkedList.add("CSS");
		linkedList.add("Javascript");
		linkedList.add("Spring");
		linkedList.add("Python");
		linkedList.add("Flask");
		linkedList.add("Python데이터 분석");
		
		dispList(linkedList);
		
		//요소의 개수 출력!
		System.out.println("요소의 개수: "+linkedList.size());
		
		//특정요소
		System.out.println("첫 번째 요소:"+linkedList.get(1));
		System.out.println("6 번째 요소:"+linkedList.get(5));
		
		//요소수정
		linkedList.set(5, "Spring Boot");
		System.out.println("6 번째 요소:"+linkedList.get(5));
		dispList(linkedList);

		//요소삭제
		linkedList.remove(3);
		System.out.println("요소삭제");
		dispList(linkedList);
	}

}
//Java,Oracle SQL,Html,CSS,Javascript,Spring,Python,Flask,Python데이터 분석,
//================================
//요소의 개수: 9
//첫 번째 요소:Oracle SQL
//6 번째 요소:Spring
//6 번째 요소:Spring Boot
//Java,Oracle SQL,Html,CSS,Javascript,Spring Boot,Python,Flask,Python데이터 분석,
//================================
//요소삭제
//Java,Oracle SQL,Html,Javascript,Spring Boot,Python,Flask,Python데이터 분석,
//================================
