package com.pcwk.ehr.ed03;

public class IncreaseOperatorEx02 {

	public static void main(String[] args) {
		/*
		 * 증가 연산자(++) : 피연산자의 값을 1 증가 시킨다.
		 * 감소 연산자(- -) : 피연산자의 값을 1 감 시킨다.
		 */
		int i = 15;
		int j = 0;
		
		
		j = i++;//후위 연산자 -> j에 i를 할당하고 증가
		System.out.printf("i++=%d, j=%d%n",i,j);
		
		i = 15;
		j = 0;
		
		j = ++i;//전위 연산자 -> j에 i를 증가한 이후 할당
		System.out.printf("++i=%d, j=%d%n",i,j);
		
		
	}

}
//i++=16, j=15
//++i=16, j=16