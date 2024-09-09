package com.pcwk.ehr.ed04;

public class R07_CharaterAscii {

	public static void main(String[] args) {
		char c = 'A';//65 : 알파벳 개수 :26
		//아스키 코드 : 대문자
		for(int i=0;i<26;i++) {
			System.out.print(c++);//ABCDEFGHIJKLMNOPQRSTUVWXYZ
		}
		
		System.out.println("");//line skip
		
		c = 'a';
		//아스키 코드 : 소문자
		for(int i=0;i<26;i++) {
			System.out.print(c++);
		}
		
		System.out.println("");//line skip
		
		c = '0';
		//아스키 코드 : 숫자
		for(int i=0;i<10;i++) {
			System.out.print(c++);
		}

	}

}
//ABCDEFGHIJKLMNOPQRSTUVWXYZ
//abcdefghijklmnopqrstuvwxyz
//0123456789