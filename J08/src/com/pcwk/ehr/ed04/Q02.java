package com.pcwk.ehr.ed04;

public class Q02 {

	public static void main(String[] args) {
		// 1부터 20까지의 정수 중에서 2또는 3의 배수가 아닌 수의 총합을 구하세요.
		int sum = 0;
		for(int i=1;i<=20;i++) {
			
			if(i%2!=0 && i%3!=0){
				sum+=i;
				System.out.println(i);
				
			}
		}
		
		System.out.println("sum="+sum);

	}

}
//1
//5
//7
//11
//13
//17
//19
//sum=73