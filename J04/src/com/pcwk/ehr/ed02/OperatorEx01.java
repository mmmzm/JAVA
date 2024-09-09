package com.pcwk.ehr.ed02;

public class OperatorEx01 {

	public static void main(String[] args) {
		int x = 10;// '=' 대입 연산자 
		int y = 3;

		System.out.printf("x=%d, y=%d%n",x,y);
		System.out.println("──────────────────────────────────────────────────");
		
		//사칙 연산
		System.out.printf("x+y=%d%n",(x+y) );
		System.out.printf("x-y=%d%n",(x-y) );
		System.out.printf("x*y=%d%n",(x*y) );
		
		//int/int -> int : 3
		System.out.printf("x/y=%d%n",(x/y) );
		System.out.printf("x/y=%f%n",(x/(y*1.0)) );//형변환
		
		//나머지 연산자: %% 
		System.out.printf("x%%y=%d%n",(x%y));
		
	}

}
//x=10, y=3
//──────────────────────────────────────────────────
//x+y=13
//x-y=7
//x*y=30
//x/y=3
//x/y=3.333333
//x%y=1