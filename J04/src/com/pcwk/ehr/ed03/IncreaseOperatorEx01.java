package com.pcwk.ehr.ed03;

public class IncreaseOperatorEx01 {

	public static void main(String[] args) {
		/*
		 * 증가 연산자(++) : 피연산자의 값을 1 증가 시킨다.
		 * 감소 연산자(- -) : 피연산자의 값을 1 감 시킨다.
		 */
		
		int i =13;
		i++; //i = i + 1

		System.out.println("i++ :"+i);
		
		System.out.println("──────────────────────────────────────");
		
		i = 13;
		++i;
		System.out.println("++i :"+i);
	}

}
//i++ :14
//──────────────────────────────────────
//++i :14