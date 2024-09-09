/**
 * 파일   : PrintfEx02.java
 * 작성자 : acorn
 * 작성일 : 2024-03-13
 */
package com.pcwk.ehr.ed02;

/**
 * @author acorn
 *
 */
public class PrintfEx02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int octNum = 010;  //8진수 10 , 10진수 8
		int hexNum = 0x10; //16진수 10 ,10진수 16
		int binNum = 0b10; //8진수 10 , 10진수 2		

		//%#o : 8진수표현 
		System.out.printf("octNum 10진수:%d, 8진수:%#o\n",octNum,octNum);
		System.out.printf("hexNum 10진수:%d, 16진수:%#x\n",hexNum,hexNum);
		System.out.printf("binNum 10진수:%d, 2진수:0b%s\n",binNum, Integer.toBinaryString(binNum));
		
		System.out.println("--------------------------------------------------");
		
		int alignNum = 10;
		//출력 정렬
		//%n과 \n은 동일한 의미로 라인스킵
		System.out.printf("alignNum:오른쪽 정렬 [%5d]%n",alignNum);//alignNum:[   10]
		System.out.printf("alignNum:왼쪽정렬 [%-5d]%n",alignNum); //alignNum:[10   ]
		System.out.printf("alignNum:왼쪽정렬 [%05d]%n",alignNum); //alignNum:왼쪽정렬 [00010]
		
		System.out.println("--------------------------------------------------");
		
		char ch = 'B';
		System.out.printf("ch:%c, 아스키 코드:%d %n",ch,(int)ch);
		
	}

}




