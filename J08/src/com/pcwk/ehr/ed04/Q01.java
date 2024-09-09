package com.pcwk.ehr.ed04;

public class Q01 {

	public static void main(String[] args) {
//		[4-1] 다음의 문장들을 조건식으로 표현하라.
//		1. int x형 변수 가 10보다 크고 20보다 작을 때 true인 조건식
//		2. char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
//		3. char형 변수 ch가 ‘x'가 또는 'X' 일 때 true인 조건식
//		4. char형 변수 ch가 숫자('0'~'9')일 때 true인 조건식 
//		5. char형 변수 ch가 영문자 (대문자 또는 소문자) 일 때 true인 조건식
//		6. int형 변수 year가 400으로 나누떨어지거나 또는 4로 나눠떨어지고 100으로
//		나눠떨어지지 않을 때 true인 조건식
//		7. boolean형 변수 powerOn가 false일 때 true인 조건식
//		8. 문자열 참조변수 str이 “yes” ㅌ일 때 인true 조건식
		int x = 13;
		//1. int x형 변수 가 10보다 크고 20보다 작을 때 true인 조건식
		System.out.printf("1.%b%n",(10<x && x<20));
		
		//2. char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
		char ch = 'a';
		System.out.printf("2.%b%n",!(ch==' ' && ch =='\t'));//ch!='' || ch !='\t'
		
		//3. char형 변수 ch가 ‘x'가 또는 'X' 일 때 true인 조건식
		ch ='X';
		System.out.printf("3.%b%n",(ch == 'x' || ch =='X'));
		
		//4. char형 변수 ch가 숫자('0'~'9')일 때 true인 조건식
		ch ='2';
		System.out.printf("4.%b%n",('0'<=ch && ch <='9'));		
		
		//5. char형 변수 ch가 영문자 (대문자 또는 소문자) 일 때 true인 조건식
		ch ='B';
		System.out.printf("5.%b%n",('a'<=ch && ch <='z') || ('A'<=ch && ch <='Z'));	
		
//		6. int형 변수 year가 400으로 나누떨어지거나 또는 4로 나눠떨어지고 100으로
//		나눠떨어지지 않을 때 true인 조건식
		int year = 2024;
		System.out.printf("6.%b%n",(year%400==0 || year%4==0  && 	year%100 !=0) );
//		7. boolean형 변수 powerOn가 false일 때 true인 조건식
		boolean powerOn=false;
		System.out.printf("7.%b%n",(!powerOn) );//!powerOn
//		8. 문자열 참조변수 str이 “yes” ㅌ일 때 인true 조건식	
		String str = "yes";
		System.out.printf("8.%b%n",(str.equals("yes")) );//("yes".equals(str))
				
	}

}














