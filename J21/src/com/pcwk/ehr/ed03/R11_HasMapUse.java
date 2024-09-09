package com.pcwk.ehr.ed03;

import java.util.HashMap;
import java.util.Iterator;

public class R11_HasMapUse {
	
	public static void dispMap(HashMap<String, Integer> map) {
		Iterator iter=map.keySet().iterator();
		while(iter.hasNext()) {
			String key = (String) iter.next();
			
			Integer value = map.get(key);
			System.out.println(key+","+value);
		}
	}
	
	
	public static void printShap(HashMap<String, Integer> map) {
		Iterator iter=map.keySet().iterator();
		while(iter.hasNext()) {
			String key = (String) iter.next();
			int value  = map.get(key);
			
			System.out.print(key+":");
			for(int i=1;i<=value;i++) {
				System.out.print("#");
			}
			System.out.print(" "+value+"\n");
		}
		
	}
	
	public static void main(String[] args) {
		String [] data ={"A","K","A","K","D","K","A","K","K","K","Z","D"};
		//1.Map : 데이터를 KEY로 추가
		//2.Map data추가 한다.
		//2.1 Map에 추가할 KEY있는지 확인한다.
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		
		for(int i=0;i<data.length;i++ ) {
			//System.out.print(data[i]+", ");
			
			//key존재 유부 check:값을 조회후 증가
			if(map.containsKey(data[i])) {
				
				//key값을 조회 ++
				int value = map.get(data[i]);
				map.put(data[i], value+1);
				
			}else {//value = 1
				map.put(data[i], 1);
				
			}
			
		}
		
		//데이터 출력
		//dispMap(map);
		
		//3.함수
		//A:### 3
		//D:####### 6
		//z: #1
		//D:##2
		printShap(map);
	}

}
