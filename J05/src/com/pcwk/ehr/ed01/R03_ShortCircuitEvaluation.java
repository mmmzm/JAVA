package com.pcwk.ehr.ed01;

public class R03_ShortCircuitEvaluation {

	public static void main(String[] args) {
		
		int num01 = 10;
		int i     = 2;
		
		System.out.println("before i="+i);
		//               false                      &&  true
		boolean flag = ( (num01 = num01 + 10) < 10) && ( (i=i+2)<10 );
		System.out.println("flag: "+flag);
		System.out.println("num01: "+num01);// num01 + 10 연산이 수행되어 20으로 증가
		System.out.println("i: "+i);//i+2 연산이 수행되지 않음 
	}

}
//before i=2
//flag: false
//num01: 20
//i: 2