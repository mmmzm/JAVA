package com.pcwk.ehr.ed01;

import java.util.Scanner;

public class R02_ConditionIfElse {

	public static void main(String[] args) {
		// 문자를 하나 입력 받아서 소문자 인지/아닌지 판단
		// 1.console 문자를 입력 받는다.
		// 2.입력 받은 문자를 소문자 인지 판단 한다.

		Scanner scanner = new Scanner(System.in);
		char ch = ' ';// char 저장 변수
		System.out.print("문자를 입력 하세요.>");
		String input = scanner.nextLine();

		System.out.printf("input: %s%n", input);

		// 문자열 중 첫 번째 위치에 char 잘라내기
		ch = input.charAt(0);
		System.out.printf("ch=%c%n", ch);

		if ('a' <= ch && ch <= 'z') {// 소문자
			System.out.printf("입력한 \'%c\'는  소문자 입니다.%n", ch);
		} else {
			System.out.printf("입력한 \'%c\'는  소문자가 아닙니다.%n", ch);
		}

		System.out.println("프로그램 종료!");

		scanner.close();// 자원 반납,stream종료
	}

}
//문자를 입력 하세요.>abc
//input: abc
//ch=a
//입력한 'a'는  소문자 입니다.
//프로그램 종료!