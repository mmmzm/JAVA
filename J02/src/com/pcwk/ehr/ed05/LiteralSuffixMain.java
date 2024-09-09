/**
 * 파일    : LiteralSuffixMain.java
 * 작성자 : acorn
 * 작성일 : 2024-03-12
 */
package com.pcwk.ehr.ed05;

/**
 * @author acorn
 *
 */
public class LiteralSuffixMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 소스 정리 :ctrl +shift+f

		// Type mismatch: cannot convert from long to int
		// int maxNum = 15L;

		// 정수형
		int maxNum = 15;

		// 실수형:
		// Type mismatch: cannot convert from double to float
		// float pi = 3.14;

		float pi = 3.14f;// suffix는 대소문자 모두 가능F(f)
		double rate = 1.414d;// 실수의 default는 double

		System.out.println("pi:" + pi);
		System.out.println("rate:" + rate);

	}

}
