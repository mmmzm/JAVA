package com.pcwk.ehr.ed02;

import java.util.Comparator;
import java.util.Map;

public class AgeComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		
		
		if(o1 instanceof Map.Entry && o2 instanceof Map.Entry) {
			
			Map.Entry e1 = (Map.Entry)o1;
			Map.Entry e2 = (Map.Entry)o2;
		
			int v1 = ((Person)e1.getValue()).getAge();
			int v2 = ((Person)e2.getValue()).getAge();
		
			System.out.println(v1+","+v2);
			return v2-v1;
		}
		return -1; 
	}



}
