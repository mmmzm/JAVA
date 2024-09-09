/**
 * 파일   : CharStringEx01.java
 * 작성자 : acorn
 * 작성일 : 2024-03-13
 */
package com.pcwk.ehr.ed01;

/**
 * @author acorn
 *
 */
public class CharStringEx01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//문자와 문자열 초기값
		String str = "";
		//char ch =''; 에러 발생, 
		char ch =' ';//공백문자로 변수 ch 초기화
		
		//뎃셈 연산자를 사용한 문자열 결합
		String name   = "acon" + " pcwk";//acon pcwk 
		String str01  = name + 8.0;//acon pcwk8.0
		
		System.out.println("name:"+name);
		System.out.println("str01:"+str01);
		
		//문자열 + any type = 문자열 + 문자열 -> 문자열
		//any type + 문자열 = 문자열 + 문자열 -> 문자열
		
		//연산 우선 순서가 좌에서 우로
		// 7 + 7 + "" ->14
		// ""+ 7 + 7  ->77
		
		System.out.println(7 + 7 + "");
		System.out.println(""+ 7 + 7);
	}

}
