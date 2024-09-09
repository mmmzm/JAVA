/**
 * 파일   : PrintfEx01.java
 * 작성자 : acorn
 * 작성일 : 2024-03-13
 */
package com.pcwk.ehr.ed02;

/**
 * @author acorn
 *
 */
public class PrintfEx01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int age = 15;
		System.out.printf("정수 : %d살\n",age);//정수 출력
		
		double value = 3.145;
		System.out.printf("실수 : %.2f\n",value);//소숫점 이하 두 자리까지 출력(3째 자리에서 반올림)
		
		String name = "Alice";
		System.out.printf("문자열: %s\n",name);//문자열 출력
		System.out.println("-------------------------------------");
		
		int num01 =13;
		int num02 =15;
		
		System.out.printf("첫 번째 숫자 : %d, 두 번째 숫자 : %d\n",num01, num02);
		System.out.println("-------------------------------------");
		
	}

}
