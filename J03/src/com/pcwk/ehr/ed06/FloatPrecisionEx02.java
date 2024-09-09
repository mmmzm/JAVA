/**
 * 파일   : FloatPrecisionEx02.java
 * 작성자 : acorn
 * 작성일 : 2024-03-13
 */
package com.pcwk.ehr.ed06;

/**
 * @author acorn
 *
 */
public class FloatPrecisionEx02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 정밀도(precision)란 부동소수점에서 표현할 수 있는 유효 숫자의 개수를 의미합니다. 
		 * 부동소수점은 실수를 근사적으로 표현하는 방식으로 작동하기 때문에, 특정한 정밀도를 가지게 됩니다.
		 */
		
		float f01  = 9.12345678901234567890f;
		double d01 = 9.12345678901234567890d;
		
		System.out.printf("       12345678901234567890%n");
		System.out.printf("f01 :%f%n",f01);//7자리에서 반올림 처리
		System.out.printf("f01 :%24.20f%n",f01);//24.20 : 전체 자리수 24, 소숫점 이하는 20
		System.out.println("--------------------------------------------------");
		System.out.printf("d01 :%24.20f%n",d01);//24.20 : 전체 자리수 24, 소숫점 이하는 20
	}

}
