package com.pcwk.ehr.ed01;

public class R06_BitwizedOp {

	public static void main(String[] args) {
//		비트 전환 연산자: ~
//		비트전환 연산자(1의 보수 연산자): 0은 1로, 1은 0으로
		
		int num = 42;            //0b101010
		//~                          010101
		//~11111111111111111111111111010101
		//비트 전환 연산
		int result = ~num;
		
		System.out.println("초기 값: "+num);
		System.out.println("비트 전환 결과 10진수: "+result);
		System.out.println("비트 전환 결과   2진수: "+Integer.toBinaryString(result));
		
		//양수를 음수로 전환
		int naResult = ~num + 1;
		System.out.println("양수를 음수로 전환: "+naResult);
		
		int num02 = 8;
		int resert02 = ~num02; 
	}

}
//초기 값: 42
//비트 전환 결과 10진수: -43
//비트 전환 결과   2진수: 11111111111111111111111111010101
//양수를 음수로 전환: -42