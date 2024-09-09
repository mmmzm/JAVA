/**
 * 파일   : InputEx01.java
 * 작성자 : acorn
 * 작성일 : 2024-03-13
 */
package com.pcwk.ehr.ed03;

import java.util.*;//Scanner사용하기 위해 추가

public class InputEx01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Scanner객체 생성
		Scanner scanner=new Scanner(System.in);
		
		//사용자에게 메시지 출력
		System.out.print("정수를 입력 하세요.>");
		
		//사용자에게 숫자 입력 받음
		int number = scanner.nextInt();

		//입력받은 숫자 출력	
		System.out.printf("입력한 숫자는 : %d\n",number);
		
		//Scanner 객체 닫기
		scanner.close();
	}

}
