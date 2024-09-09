package com.pcwk.ehr.ed01;

public class R05_BitwizedOp {

	public static void main(String[] args) {
		int operand01 = 0b101010;//이진수: 101010, 10진수: 42
		int operand02 = 0b110011;//이진수: 110011, 10진수: 51
		// &              100010
		// |              111011
		// ^              011001
		System.out.printf("operand01:%d%n",operand01);
		System.out.printf("operand02:%d%n",operand02);
		
		System.out.println("--------------------------------------------------");
		
		//비트 AND(&)
		//Integer.toBinaryString(int) : 십진수를 2진수로 변환
		int resultAND = operand01 & operand02;
		System.out.println("비트 AND 결과 10진수"+resultAND);
		System.out.println("비트 AND 결과 2진수"+Integer.toBinaryString(resultAND));
		
		//비트 OR(|)
		int resultOR = operand01 | operand02;
		System.out.println("비트 OR 결과 10진수 : "+resultOR);
		System.out.println("비트 OR 결과  2진수 : "+Integer.toBinaryString(resultOR));
		
		//비트 XOR(^)
		int resultXOR = operand01 ^ operand02;
		System.out.println("비트 XOR 결과 10진수 :"+resultXOR);
		System.out.println("비트 XOR 결과  2진수 :"+Integer.toBinaryString(resultXOR));
	}

}
//operand01:42
//operand02:51
//--------------------------------------------------
//비트 AND 결과 10진수34
//비트 AND 결과 2진수100010
//비트 OR 결과 10진수 : 59
//비트 OR 결과  2진수 : 111011
//비트 XOR 결과 10진수 :25
//비트 XOR 결과  2진수 :11001

