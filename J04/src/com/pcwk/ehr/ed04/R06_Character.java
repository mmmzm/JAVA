package com.pcwk.ehr.ed04;

public class R06_Character {

	public static void main(String[] args) {
		char ch = 'a';//ascii 97
		
		char ch02 = ' ';
		
		ch02 = (char)(ch + 1);
		System.out.printf("ch02=%c\n",ch02);
		ch02++;
		
		System.out.printf("ch02=%c\n",ch02);
		System.out.printf("──────────────────────\n");
		
		ch = 'a';
		//리터럴 간의 연산에서는 값이 예상이 되무로 아래와 같은 연산이 가능
		//
		char result = 'a' + 1;//컴파일러가 연산을 예상 할수 있음
		System.out.printf("result="+result);
	}

}
//ch02=b
//ch02=c
//──────────────────────
//result=b