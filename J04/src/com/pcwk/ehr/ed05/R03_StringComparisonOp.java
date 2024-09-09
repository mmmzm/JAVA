package com.pcwk.ehr.ed05;

public class R03_StringComparisonOp {

	public static void main(String[] args) {
//		String str01 = "abc";
//		String str02 = new String("abc");
//
//		"abc" == "abc" => true
//		str01 == "abc" => true
//		"abc" == str01 => false
//
//		-------------------------------------------------
//		str02.equals("abc") => true  (문자열 비교에 사용)
//		str01.equals("abc") => true  (문자열 비교에 사용)		
		
		String str01 = "abc";
		String str02 = new String("abc");
		
		System.out.printf(" \"abc\" == \"abc\"? %b%n ",("abc"=="abc"));
		System.out.printf(" str01 == \"abc\"? %b%n ",(str01=="abc"));
		System.out.printf(" str02 == \"abc\"? %b%n ",(str02=="abc"));//false
		System.out.println("--------------------------------------------------");
		
		//문자열 비교 : str02.equals("abc") 사용
		System.out.printf(" str01.equals(\"abc\")? %b%n ",(str01.equals("abc")));//true
		System.out.printf(" str02.equals(\"abc\")? %b%n ",(str02.equals("abc")));//true

	}

}
