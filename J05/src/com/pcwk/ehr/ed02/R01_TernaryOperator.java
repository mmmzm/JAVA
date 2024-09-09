package com.pcwk.ehr.ed02;

public class R01_TernaryOperator {

	public static void main(String[] args) {
		
		//나이에 따라 미성년 여부 판단.
		
		int age = 20;
		//if ~ else 간략형
		String message = (age >=19)?"성년":"미성년";
		System.out.printf("나이 = %d살, 성인 여부:%s%n",age,message);
	}

}
//나이 = 20살, 성인 여부:성년