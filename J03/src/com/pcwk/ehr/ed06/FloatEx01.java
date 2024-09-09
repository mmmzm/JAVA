/**
 * 파일   : FloatEx01.java
 * 작성자 : acorn
 * 작성일 : 2024-03-13
 */
package com.pcwk.ehr.ed06;

/**
 * @author acorn
 *
 */
public class FloatEx01 {


	public static void main(String[] args) {
		// 1.7976931348623157e+308, 소숫점 포함 18
		double num = Double.MAX_VALUE;
		//String str = "1.7976931348623157";
		//System.out.println(str.length());
		
		System.out.printf("이전 값:%f%n",num);
		num =num * 2;
		System.out.printf("이후 값:%f%n",num);//무한대 출력

	}

}
