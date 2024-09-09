/**
 * 파일    : LiteralPrefixMain.java
 * 작성자 : acorn
 * 작성일 : 2024-03-12
 */
package com.pcwk.ehr.ed05;

/**
 * @author acorn
 *
 */
public class LiteralPrefixMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 리터럴 prefix
		
		int octNum = 010; // 8진수   10
		int hexNum = 0x10;// 16진수 10
		int binNum = 0b10;// 2진수   10
		
		//각진수 들이 10진수로 변환 출력
		System.out.println("octNum : "+octNum);
		System.out.println("hexNum : "+hexNum);
		System.out.println("binNum : "+binNum);
		System.out.println("-------------------------------------");
				
		int 한글변수 = 99;
		System.out.println("한글변수:"+한글변수);
		
		System.out.println("-------------------------------------");
		//천단위 구분 기호
		long bigLong = 100_000_000_000L;
		
		System.out.println("bigLong:"+bigLong);
		
		long hexLong = 0x100_000_000_000L;
		System.out.println("hexLong:"+hexLong);
		
		
		

	}

}
