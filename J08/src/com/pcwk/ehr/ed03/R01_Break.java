package com.pcwk.ehr.ed03;

public class R01_Break {

	public static void main(String[] args) {
		// 1부터 10까지 숫자중 5를 찾고, 반복문 벗어 나기!
		
		for(int i=1;i<=10;i++) {
			if(i==5) {
				System.out.printf("%d 찾았습니다.%n",i);
				break;
			}
			System.out.printf("i=%d%n",i);
		}
		
		System.out.println("프로그램 종료!");

	}

}
//i=1
//i=2
//i=3
//i=4
//5 찾았습니다.
//프로그램 종료!