package com.pcwk.ehr.ed03;

public class ArithmeticOperatorEx05 {

	public static void main(String[] args) {
		byte a = 13;
		byte b = 15;
		
		byte c = (byte)(a + b);//byte + byte -> int + int
		
		System.out.println("c="+c);//c=28
	}

}
