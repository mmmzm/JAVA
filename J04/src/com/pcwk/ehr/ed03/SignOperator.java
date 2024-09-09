package com.pcwk.ehr.ed03;

public class SignOperator {

	public static void main(String[] args) {
		// 부호 연산자는 ‘-’는 피연산자의 부호를 반대로 변경한 결과를 반영한다.
		int x = -18;
		x = +x;
		System.out.println("x="+x);

		x = -13;
		x = -x;
		System.out.println("x="+x);
	}

}
//x=-18
//x=13