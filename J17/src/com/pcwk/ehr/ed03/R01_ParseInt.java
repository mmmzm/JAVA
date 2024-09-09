package com.pcwk.ehr.ed03;

import com.pcwk.ehr.cmn.PLog;

public class R01_ParseInt implements PLog {

	public static void main(String[] args) {
		int age = 22;
		
		//int 문자열로 변환
		String strAge = String.valueOf(age);
		//String strAge = age + "";
		System.out.printf("age= %d%n",age);
		System.out.printf("strAge= %s%n",strAge);

		System.out.println("-----------------------");
		
		double dValue = 220.0d;
		String strDoubleValue = String.valueOf(dValue);
		System.out.printf("strDoubleValue= %s%n",strDoubleValue);
		
		//정수 숫자형 문자열 -> 정수 숫자 변환
		int parseAge = Integer.parseInt(strAge);
		System.out.printf("parseAge= %d%n",parseAge);
		
		//실수 숫자형 문자열 -> 실수 숫자 변환
		double parseDouble = Double.parseDouble(strDoubleValue);
		System.out.printf("%.2f%n",parseDouble);
		
		String newAge = " 22 ";
		newAge = newAge.trim();//trim() : 앞뒤 공백 제거
		System.out.println(Integer.parseInt(newAge));
	}

}
//age= 22
//strAge= 22
//-----------------------
//strDoubleValue= 220.0
//parseAge= 22
//220.00