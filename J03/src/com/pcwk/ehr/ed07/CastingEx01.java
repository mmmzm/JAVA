/**
 * 파일   : CastingEx01.java
 * 작성자 : acorn
 * 작성일 : 2024-03-13
 */
package com.pcwk.ehr.ed07;

/**
 * @author acorn
 *
 */
public class CastingEx01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//묵시적 형변환
		byte bNum = 13;
		int  iNum = 15;
		
		int result = bNum + iNum; //byte + int -> int + int
		System.out.printf("%d + %d=%d\n",bNum,iNum,result);

		//정수와 실수간 연산
		int iNum02 = 18;
		float fNum = 22.0f;
		
		double dResult = iNum02 + fNum;//float + flot
		System.out.printf("dResult=%f",dResult);
		
	}

}
