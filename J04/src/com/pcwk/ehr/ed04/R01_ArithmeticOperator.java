package com.pcwk.ehr.ed04;

public class R01_ArithmeticOperator {

	public static void main(String[] args) {
		//char + int -> int + int 
		
		char ch = 'A';//A의 ascii 코드 65
		int  i  = 1;
		
		int result = ch + 1;//65+1
		
		System.out.println("result:"+result);

		//a의 ascii 코드 65
		//A소문자로 변환
		char resultChar = (char)(ch + 32);
		System.out.println("resultChar:"+resultChar);
		
	}

}
//result:66
//resultChar:a