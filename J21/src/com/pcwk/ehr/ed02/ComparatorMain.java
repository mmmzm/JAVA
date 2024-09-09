package com.pcwk.ehr.ed02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ComparatorMain {
	
	public static void dispMap(Map<String, Person> map) {
		Iterator iter=map.keySet().iterator();
		while(iter.hasNext()) {
			String key = (String) iter.next();
			
			Person value = map.get(key);
			System.out.println(key+","+value.getAge()+","+value.getName());
		}
	}
	

	public static void main(String[] args) {
        // Person 객체 생성
        Person p1 = new Person("John", 30);
        Person p2 = new Person("Alice", 25);
        Person p3 = new Person("Bob", 35);


        AgeComparator  comparator=new AgeComparator();
        
        System.out.println("Comparing p1 and p2: " + comparator.compare(p1, p2));
        System.out.println("Comparing p2 and p3: " + comparator.compare(p2, p3));
        System.out.println("Comparing p1 and p3: " + comparator.compare(p1, p3));
        //compare(T o1, T o2): 두 개의 객체를 비교합니다. 첫 번째 인자가 두 번째 인자보다 작으면 음수를 반환하고, 같으면 0을 반환하고, 크면 양수를 반환합니다.
        
        Map<String,Person>  map=new HashMap<String, Person>();
        map.put("p1", p1);
        map.put("p2", p2);
        map.put("p3", p3);
        
        System.out.println(map);
        
        Set keys = map.entrySet();
        List list =new ArrayList(keys);
        
        Collections.sort(list, new AgeComparator());
        System.out.println("Sort====");
        System.out.println(list);
	}

}

//Comparing p1 and p2: -1
//Comparing p2 and p3: -1
//Comparing p1 and p3: -1
//{p1=Person [name=John, age=30], p2=Person [name=Alice, age=25], p3=Person [name=Bob, age=35]}
//25,30
//35,25
//35,25
//35,30
//Sort====
//[p3=Person [name=Bob, age=35], p1=Person [name=John, age=30], p2=Person [name=Alice, age=25]]

