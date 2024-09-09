package com.pcwk.ehr.ed04;

public class R03_ArithmeticOperator {

	public static void main(String[] args) {
		//3.141592-> 3.141 소수 세째 자리에서 버리
		float pi =3.141592f;
		//(pi*1000):3141.592
		//(int)(pi*1000) :3141
		//(int)(pi*1000)/1000f : 3.141f
		
		float shortResult =(int)(pi*1000)/1000f;
		System.out.println("shortResult:"+shortResult);
		

	}

}
//shortResult:3.141