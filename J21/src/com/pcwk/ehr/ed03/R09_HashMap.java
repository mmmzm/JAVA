package com.pcwk.ehr.ed03;
import java.util.*;

public class R09_HashMap {

	public static void main(String[] args) {
		Map<String, Integer>  map=new HashMap<String, Integer>();
		
		//추가(key, value)
		map.put("one", new Integer(1));
		map.put("two", 2);
		map.put("three", 3);
		map.put("four", 4);
		map.put("five", 5);
		
		
		map.put("three", 99);
		//toString(): 순서 유지 않됨, 
		//{four=4, one=1, two=2, three=99, five=5}
		System.out.println(map.toString());
		
		
		//key로 값을 추출
		//key로 값을 추출:99
		System.out.println("key로 값을 추출:"+map.get("three"));
		
		
		//모든 요소에 접근:	keySet()
		//
		Set<String> keys = map.keySet();
		Iterator iter =keys.iterator();//모든 key값
		//Iterator iter = map.keySet().iterator();
		
		while(iter.hasNext()) {
			//key
			String key = (String) iter.next();
			
			//value
			Integer value =map.get(key);
			System.out.printf("key=%s, value=%d\n",key,value);
		}
//		key로 값을 추출:99
//		key=four, value=4
//		key=one, value=1
//		key=two, value=2
//		key=three, value=99
//		key=five, value=5		

	}

}
