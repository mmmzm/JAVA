package com.pcwk.ehr.ed02;
import java.util.Scanner;

public class R05_While {

	public static void main(String[] args) {
		// 숫자(12345)를 입력 받아 각 자리수에 숫자의 합을 구하시오.(1+2+3+4+5)15
		int sum = 0;//합계
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("숫자를 입력 하세요.(12345)>");
		
		//마지막 자리 : 1/10 -> 0
		//System.out.println(1/10);//0
		
		int num = scanner.nextInt();
		System.out.printf("입력 숫자는 %d%n",num);
		
		while(num !=0) {
			sum = sum + ( num % 10);
			
			System.out.printf("sum=%3d \t num=%d%n",sum,num);
			
			num = num/10;//num/=10
		}
		System.out.printf("각 자리수 총 합은 %d%n",sum);
		scanner.close();
	}

}
//숫자를 입력 하세요.(12345)>12345
//입력 숫자는 12345
//sum=  5 	 num=12345
//sum=  9 	 num=1234
//sum= 12 	 num=123
//sum= 14 	 num=12
//sum= 15 	 num=1
//각 자리수 총 합은 15