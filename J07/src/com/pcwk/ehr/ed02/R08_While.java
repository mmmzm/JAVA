package com.pcwk.ehr.ed02;

public class R08_While {

	public static void main(String[] args) {
		// 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10) while문으로 구하세요.
		
		int n        = 1;
		int sum      = 0;//(1+2)
		int totalSum = 0;//1+(1+2)+...    누적 합계
		
		while(n<=10) {
			
			sum = 0;//각 순환에서 합을 초기화
			int i =1;
			
			while(i <= n) {//1... n까지 합
				System.out.print(i+",");
				sum +=i;
				
				i++;
			}
			System.out.print(" :"+sum);
			System.out.println();
			totalSum = totalSum + sum;
			n++;
		}//while n

		System.out.println("최종 합:"+totalSum);
		
	}//--main

}
//1, :1
//1,2, :3
//1,2,3, :6
//1,2,3,4, :10
//1,2,3,4,5, :15
//1,2,3,4,5,6, :21
//1,2,3,4,5,6,7, :28
//1,2,3,4,5,6,7,8, :36
//1,2,3,4,5,6,7,8,9, :45
//1,2,3,4,5,6,7,8,9,10, :55
//최종 합:220