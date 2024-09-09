/**
 * 파일   : IntegerToFloat.java
 * 작성자 : acorn
 * 작성일 : 2024-03-13
 */
package com.pcwk.ehr.t01;

/**
 * @author acorn
 *
 */
public class IntegerToFloat {

	public static void main(String[] args) {
		// 정수형 변수 선언
		int intValue = 10;

		// 실수형 변수 선언
		double doubleValue = 3.14;

		// 정수형을 실수형으로 자동 형변환
		double result1 = intValue;
		System.out.println("result1: " + result1);

		// 실수형을 정수형으로 명시적 형변환
		int result2 = (int) doubleValue;
		System.out.println("result2: " + result2);
	}
}
