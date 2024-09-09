package com.pcwk.ehr.ed01;
import java.util.*;
import java.util.Map.Entry;



public class R02_TreeMapMain {

	//함수 이름printList
	//param:Iterator
	//return:void
	
	public static void printList(Iterator<Entry<String, Integer>> iter) {
		while(iter.hasNext()) {
			Entry<String, Integer> entry = iter.next();
			
			int value = entry.getValue().intValue();
			System.out.println(entry.getKey()+":"+value);
		}		
	}
	
	public static void main(String[] args) {
		String [] data ={"A","K","A","K","D","K","A","K","K","K","Z","D"};

		TreeMap<String, Integer>  map=new TreeMap<String, Integer>();
		
		
		for(int i=0;i<data.length;i++) {
			//key가 있는 경우
			if(map.containsKey(data[i])) {
				Integer value = map.get(data[i]);
				map.put(data[i], new Integer(value.intValue()+1));
			}else {//최초 추가 되는 경우
				map.put(data[i], new Integer(1));
			}
		}
		
		//iterator()
		Iterator<Entry<String, Integer>>  iter=map.entrySet().iterator();
		
		System.out.println("ASC\n--------------------------------------");
		printList(iter);
//		while(iter.hasNext()) {
//			Entry<String, Integer> entry = iter.next();
//			
//			int value = entry.getValue().intValue();
//			System.out.println(entry.getKey()+":"+value);
//		}
		
		
		System.out.println("DESC\n--------------------------------------");
		//map -> Set -> List
		Set<Entry<String, Integer>> set= map.entrySet();
		
		List list =new ArrayList(set);
		
		//정렬
		Collections.sort(list, new ValueComparator());
		printList(list.iterator());
		
	}

}
