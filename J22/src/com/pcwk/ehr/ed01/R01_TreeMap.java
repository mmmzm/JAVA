package com.pcwk.ehr.ed01;

import java.util.*;

public class R01_TreeMap {

	public static void main(String[] args) {
		//TreeMap객체 생성
		TreeMap<String, Integer> treeMap=new TreeMap<String, Integer>();
		
		//요소추가
		treeMap.put("orange", 2000);
		treeMap.put("banana", 3000);
		treeMap.put("apple", 3500);
		
		//요소접근
		//treeMap:{apple=3500, banana=3000, orange=2000}
		System.out.println("treeMap:"+treeMap.toString());
		
		//요소 조회
		System.out.println("요소 조회:"+treeMap.get("apple"));
		
		//요소 수정
		System.out.println("요소 수정:"+treeMap.put("apple", 4000));
		System.out.println("요소 조회:"+treeMap.get("apple"));
		
		//요소 삭제
		treeMap.remove("apple");
		System.out.println("treeMap:"+treeMap.toString());
		
		//전체 요소 조회
		
		for( Map.Entry<String, Integer> entry  :treeMap.entrySet()) {
			System.out.println("Key:"+entry.getKey()+",Value:"+entry.getValue());
		}
	}

}
//treeMap:{apple=3500, banana=3000, orange=2000}
//요소 조회:3500
//요소 수정:3500
//요소 조회:4000
//treeMap:{banana=3000, orange=2000}
//Key:banana,Value:3000
//Key:orange,Value:2000