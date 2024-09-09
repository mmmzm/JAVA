package com.pcwk.ehr.ed03;

import java.util.*;

public class R02_ArrayListLinkedList {

	/**
	 * 순차적인 추가
	 * @param list
	 * @return
	 */
	public static long sequentialAdd(List list) {
		long start = System.currentTimeMillis();
		
		for(int i=0;i<5_000_000;i++) {
			list.add(new Integer(i));//List에 끝에 추가
			//list.add(i);
		}
		
		long end  = System.currentTimeMillis();
		return end-start;
	}
	
	/**
	 * 중가에 추가 
	 * @param list
	 * @return 경과시간 long
	 */
	public static long middleAdd(List list) {
		long start = System.currentTimeMillis();
		
		for(int i=0;i<10_000;i++) {
			list.add(22, new Integer(i));
		}
		long end = System.currentTimeMillis();
		
		return end-start;
	}
	
	
	public static void main(String[] args) {
		//순차적인 추가 삭제: ArrayList 우수
		//중간 추가 삭제 : LinkedList우수

		//경과시간 측정
		//method드 시작에 
		//long start = System.currentTimeMillis();
		//메소드 끝
		//long end = System.currentTimeMillis();
		
		ArrayList   arrayList=new ArrayList();
		LinkedList  linkeList=new LinkedList();
		System.out.println("순차적인 추가");
		System.out.println("arrayList:"+sequentialAdd(arrayList));//arrayList:164
		System.out.println("linkeList:"+sequentialAdd(linkeList));//linkeList:3037
		
		
		System.out.println("중간에 추가");
		System.out.println("arrayList:"+middleAdd(arrayList));//arrayList:164
		System.out.println("linkeList:"+middleAdd(linkeList));//linkeList:3037
						
	}
}
//순차적인 추가
//arrayList:280
//linkeList:3148
//중간에 추가
//arrayList:77860
//linkeList:2



