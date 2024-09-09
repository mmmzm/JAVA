package com.pcwk.ehr.ed02;

public class R06_While {

	public static void main(String[] args) {
		// 1부터 몇까지 더하면 누적 합계가 99을 넘지 않는 제일 큰 수가 되는지 알아내기.
		
		int sum = 0;//합계
		int i   = 0;//증가
		
		while((sum =sum + ++i)<=99) {
			System.out.printf("sum=%3d \t i=%2d%n",sum,i);
		}
	}
}
//sum=  1 	 i= 1
//sum=  3 	 i= 2
//sum=  6 	 i= 3
//sum= 10 	 i= 4
//sum= 15 	 i= 5
//sum= 21 	 i= 6
//sum= 28 	 i= 7
//sum= 36 	 i= 8
//sum= 45 	 i= 9
//sum= 55 	 i=10
//sum= 66 	 i=11
//sum= 78 	 i=12
//sum= 91 	 i=13