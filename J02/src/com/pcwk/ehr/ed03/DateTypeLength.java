package com.pcwk.ehr.ed03;

public class DateTypeLength {
    /**
     * 변수 데이터 크기의 의미
     * int의 최대 최소 크기는 +- 21억
     * @param args
     */
	public static void main(String[] args) {
		int maxInt =  2_147_483_647;//천단위 구분 기호 "_"
		
		System.out.println("maxInt:"+maxInt);
		
		maxInt = maxInt +1;//오버플로우 발생
		System.out.println("maxInt+1:"+maxInt);
	}

}
