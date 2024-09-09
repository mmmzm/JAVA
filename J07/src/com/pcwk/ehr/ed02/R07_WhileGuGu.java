package com.pcwk.ehr.ed02;

public class R07_WhileGuGu {

	public static void main(String[] args) {
		// 구구단 출력(2단 ~ 9단)
		
		int dan   = 2;//시작 단
		int limit = 9;//종료 단
		
		while(dan <=limit ) {
			int num = 1;//곱해지는 숫자 
			
			System.out.println(dan +"단");
			
			while(num <=9) {
				
				System.out.printf("%d * %d = %2d%n",dan,num,(dan*num));
				num++;
			}
			System.out.println();//한 단 출력 후 줄 바꿈 
			
			dan++;
		}

	}

}
//2단
//2 * 1 =  2
//2 * 2 =  4
//2 * 3 =  6
//2 * 4 =  8
//2 * 5 = 10
//2 * 6 = 12
//2 * 7 = 14
//2 * 8 = 16
//2 * 9 = 18
//
//3단
//3 * 1 =  3