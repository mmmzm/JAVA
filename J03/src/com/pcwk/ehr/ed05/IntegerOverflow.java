/**
 * 파일   : IntegerOverflow.java
 * 작성자 : acorn
 * 작성일 : 2024-03-13
 */
package com.pcwk.ehr.ed05;

/**
 * @author acorn
 *
 */
public class IntegerOverflow {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		byte  over = 127;//-128 ~ 127
		//byte 크기 범위내에 있으므로 표현 가능
		System.out.printf("overflow=%d%n",over);//overflow=127
		
		over++;//127+1
		//over = over + 1;
		
		//byte의 표현 범위를 넘어 감.
		System.out.printf("overflow=%d%n",over);//쓰레기값
	}

}
