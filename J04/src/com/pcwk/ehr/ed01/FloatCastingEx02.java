package com.pcwk.ehr.ed01;

public class FloatCastingEx02 {

	public static void main(String[] args) {
		//실수형간의 형변환
		double bigDouble = 123.456789;
		
		float smallFloat = 0.0f;
		
		//큰 정밀도의 실수형에서 작은 정밀도의 실수형으로 명시적 형변환
		//smallFloat:123.45679 소숫점 이하 6번째 자리에서 반올림 
		smallFloat = (float)bigDouble;
		System.out.println("smallFloat:"+smallFloat);
		
		//작은 정밀도의 실수형에서 큰 정밀도의 실수형으로 자동 형변환
		bigDouble = smallFloat;
		System.out.println("bigDouble:"+bigDouble);
		

	}

}
//ctrl + / : 한줄 comment 
//smallFloat:123.45679
//bigDouble:123.456787109375
