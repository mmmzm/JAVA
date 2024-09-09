package com.pcwk.ehr.ed02;

public class R04_While {

	public static void main(String[] args) {
		// 1~20까지 정수중 2또는 3의 배수의 총합을 구하세요.
		
		int i =1;
		int totalSum = 0;
		
		while(i<=20) {
			
			if( i%2==0 || i%3==0) {
				System.out.println(i);
				totalSum +=i;
			}
			i++;
		}
		
		System.out.println("1~20까지 정수중 2또는 3의 배수의 총합="+totalSum);

	}

}
//2
//3
//4
//6
//8
//9
//10
//12
//14
//15
//16
//18
//20
//1~20까지 정수중 2또는 3의 배수의 총합=137