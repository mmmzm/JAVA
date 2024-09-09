package com.pcwk.ehr.ed04;

public class R05_MathRound {

	public static void main(String[] args) {
		//Math.round() : 소수 첫째 자리에서 반올림
		float pi = 3.141592f;
		//3.141592 * 1000 -> 3141.592
		//3142.0
		double tmpDouble=Math.round(pi*1000);
		System.out.println(tmpDouble);
		
		double result = tmpDouble/1000f;
		System.out.println(result);

		System.out.println(Math.round(pi*1000)/1000f);
	}

}
//3.142