package com.pcwk.ehr.ed02;

import java.util.*;
public class R06_HashSetLotto {

	public static void main(String[] args) {
		// 숫자 6개
		// sort
		// 순차적인 접근
		
		Set<Integer> set=new HashSet<Integer>();
		
		//0.0<=x<1.0
		
		//1<=x<46
		for(int i=0;set.size()<6;i++) {
			int num=(int)(Math.random()*45)+1;
			System.out.println(set.add(new Integer(num))+" :"+num);
		}
		//Set -> List
		List<Integer> list=new LinkedList<Integer>(set);
		
		//Sort
		Collections.sort(list);
		
		Iterator<Integer> iter = list.iterator();
		int i =1;
		String delim = ",";
		while(iter.hasNext() == true) {
			if(i==6) {
				delim = "";
			}
			System.out.print(iter.next()+delim);
			i++;
		}

	}

}
//true :40
//true :19
//true :22
//true :5
//true :3
//true :12
//3,5,12,19,22,40



