package com.pcwk.ehr.ed01;

import java.util.Scanner;

public class R07_ForStart {

	public static void main(String[] args) {
		// 역 삼각형 별출력
		Scanner scanner=new Scanner(System.in);
		System.out.print("*을 출력할 라인수를 입력 하세요.>");
		
		int rows = scanner.nextInt();//삼각형의 높이
		
		for(int i=rows;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
//*을 출력할 라인수를 입력 하세요.>5
//* * * * * 
//* * * * 
//* * * 
//* * 
//* 
