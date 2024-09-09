/**
 * 파일   : CharacterEx01.java
 * 작성자 : acorn
 * 작성일 : 2024-03-13
 */
package com.pcwk.ehr.ed04;

/**
 * @author acorn
 *
 */
public class CharacterEx01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char ch = 'B';//문자 'B'를 char 타입 변수 ch에 저장
		char ch02 = 66;
		
		System.out.printf("ch:%c, ch:%d\n",ch,(int)ch);		
		System.out.printf("ch02:%c, ch02:%d\n",ch02,(int)ch02);
		
		char hch = '가';
		System.out.printf("hch:%c, %#x%n",hch,(int)hch);

		char nhch = '\uac00';// u 유니코드
		System.out.printf("nhch:%c\n",nhch);
		
	}

}
