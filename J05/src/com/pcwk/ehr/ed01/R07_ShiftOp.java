package com.pcwk.ehr.ed01;

public class R07_ShiftOp {

	public static void main(String[] args) {
		
		int num01 = 8;// 2진수 : 00001000
		//ctrl + f : 찾기+바꾸기
		int resultLShift = num01 << 2;
		System.out.println("원본: "+num01);
		System.out.println("num01 << 2: "+resultLShift);
		
		// >>
		int resultRShift = num01 >> 2;
		System.out.println("num01 >> 2: "+resultRShift);
		
	}

}
//원본: 8
//num01 << 2: 32
//num01 >> 2: 2