package com.pcwk.ehr.ed01;

public class IntegerToFloatEx03 {

	public static void main(String[] args) {
		// 정수와 실수간에 형변환
		
		int intValue = 13;
		
		double doubleValue = 3.14D;
		
		//정수형을 실수로 형변환
		double result01 = intValue;
		System.out.println("result01:"+result01);
		
		//실수형을 정수형으로 명시적 형변환
		int result02 = (int)doubleValue;//3.14
		System.out.println("result02:"+result02);

	}

}
//자음 + 한자 키(or 한자 키가 없다면 우측 Ctrl 키)

//result01:13.0
//result02:3
