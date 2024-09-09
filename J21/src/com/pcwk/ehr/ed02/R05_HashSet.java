package com.pcwk.ehr.ed02;

import java.util.*;

public class R05_HashSet {

	public static void main(String[] args) {
		String []names = {"Alice","이상무","김수환무","Bob","Charlie","Alice","Bob"};

		Set<String>  set=new HashSet<String>();
		
		//요소 추가
		for(String str  :names) {
			//성공적 추가 : true, 그렇치 않으면 false
			
			System.out.println(set.add(str));
		}
		//[이상무, Bob, Alice, Charlie, 김수환무]
		System.out.println(set.toString());
		
		
		//요소 삭제
		System.out.println(set.remove("김수환무"));
		System.out.println(set.toString());//[이상무, Bob, Alice, Charlie]
		
		//요소 사이즈: 
		int size = set.size();
		System.out.println("size: "+size);
		
		
		Iterator<String> iter = set.iterator();
		while(iter.hasNext() == true) {
			System.out.println(iter.next());
		}
		
		
	}

}
