package com.pcwk.ehr.ed04;

public class R02_ArithmeticOperator {

	public static void main(String[] args) {
		// 단항 연산자,대입 연산자를 제외한 모든 연산의 진행방향은 왼쪽에서 오른쪽
		int x = 1_000_000;
		int result01 = x * x / x;
		
		
		System.out.printf("x * x / x =%d%n",result01);// 쓰레기 값
		int result02 = x / x * x;
		System.out.printf("x / x * x =%d%n",result02);//x / x * x =1000000
	}

}
//x * x / x =-727
//x / x * x =1000000