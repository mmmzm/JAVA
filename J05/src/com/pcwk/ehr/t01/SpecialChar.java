package com.pcwk.ehr.t01;

public class SpecialChar {

	public static void main(String[] args) {

		System.out.println("Hello,\b world!");
		
		long regNo = 1234567890123L;
		
		//anytype + 문자열   -> 문자열 + 문자열
		//문자열+ anytype   -> 문자열 + 문자열
		
		System.out.println("1"+"2");//12
		System.out.println(true+"");//true
		System.out.println('A'+'B');//131
		System.out.println('1'+2);//51
		System.out.println('1'+'2');//99
		System.out.println('J' + "ava");//Java
		//System.out.println(true + null);//오류
		
		//1. 영문자, 숫자, 특수기호($,_)
		//2. 예약어 사용 금지
		//3. 숫자로 시작하면 사용 할수 없다.
		
		int 자바 =28;
		String If;
		//int 7eleven;
		int  $ystem;
		//int  hello@com;
		
		int x = 5;
		int y = 2;
		
		
		x *= 10+y;
		//x = x*(10+y)
		
		float floatValue   = 123033.1f;
		double doubleValue = 123033.1;
		
		//총 자리수는 19자리
		//소수점 이하 자리수는 17자리
		System.out.printf("floatValue=%019.3f%n",floatValue);
		System.out.printf("doubleValue=%10.3f%n",doubleValue);		
		
		String strLeng = "123033.10000000000000000";
		
		System.out.println(strLeng.length());
		strLeng = ".10000000000000000";
		System.out.println(strLeng.length());
		
		
		
		
	}

}
