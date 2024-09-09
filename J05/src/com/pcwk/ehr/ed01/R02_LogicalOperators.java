package com.pcwk.ehr.ed01;

import java.util.Scanner;


public class R02_LogicalOperators {

	public static void main(String[] args) {
		// 문자, 혹은 숫자를 입력 받아, 숫자인지, 영문자인지 판단
		
		Scanner scanner=new Scanner(System.in);
		char ch = ' ';//문자 저장 변수
		
		System.out.printf("문자를 하나 입력 하세요.>");
		String input = scanner.nextLine();
		
		System.out.println("input:"+input);
		
		ch = input.charAt(0);//첫 번째 글자 읽기
		System.out.println("ch:"+ch);
		
		//숫자 여부 
		if('0'<=ch && ch <='9') {
			System.out.printf("입력하신 문자는 %c 숫자 입니다.%n",ch);
		}
		
		//영문자 여부 (대문자 와 소문자)
		if( ('a'<=ch && ch <='z') || ('A'<=ch && ch <='Z')   ) {
			System.out.printf("입력하신 문자는 %c 영문자 입니다.%n",ch);
		}
		
		
	}

}
//문자를 하나 입력 하세요.>Hello
//input:Hello
//ch:H
//입력하신 문자는 H 영문자 입니다.
