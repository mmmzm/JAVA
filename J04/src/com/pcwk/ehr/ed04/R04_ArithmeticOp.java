package com.pcwk.ehr.ed04;

public class R04_ArithmeticOp {

	public static void main(String[] args) {
		float pi = 3.141592f;
		float shortPI = (int)(pi*1000+0.5)/1000f;
		
		System.out.println("shortPI:"+shortPI);//shortPI:3.142

	}

}
//shortPI:3.142