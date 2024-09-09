package com.pcwk.ehr.ed01;

import java.util.ArrayList;

import com.pcwk.ehr.cmn.PLog;

public class R02_AutoBoxing implements PLog {

	public static void main(String[] args) {
		int i =1;
		
		Integer obj=new Integer(22);
		
		//unboxing
		int sum = i+obj;//컴파일러가 obj.intValue();
		LOG.debug("sum:"+sum);

		//Autoboxing
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);//10 -> new Integer(10)
		
		
		int iValue = list.get(0);//unboxing new Integer(10) -> 10
	}

}
