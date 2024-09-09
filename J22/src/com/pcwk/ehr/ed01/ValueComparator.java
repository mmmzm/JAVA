package com.pcwk.ehr.ed01;

import java.util.Comparator;
import java.util.Map;

public class ValueComparator implements Comparator {

	
	//- : 현행 유지
	//+ : 자리 교환
	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Map.Entry && o2 instanceof Map.Entry ) {
			Map.Entry e1 = (Map.Entry)o1;
			Map.Entry e2 = (Map.Entry)o2;
			
			int v1 = ((Integer)e1.getValue()).intValue();
			int v2 = ((Integer)e2.getValue()).intValue();
			
			System.out.println(v2+"-"+v1);
			//return v1-v2;//ASC
			return v2-v1;//DESC
		}
		
		
		return -1;
	}

}
