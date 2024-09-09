package com.pcwk.ehr.ed02;

public class R05_CalendarMonth {

	public static void main(String[] args) {
		// 0. 년도 월 입력 : 2024 4
		// 1. 요일 : 시작요일
		// 2. 시작일 : 1, 그 달의 마지막 일 : ?

		if(args.length !=2) {
			System.out.println("년도와 월을 입력 하세요.ex)2024 2");
			System.exit(0);
		}
		
		int year  = 0;//년도
		int month = 0;//월
		
		String yearStr  = args[0];
		String monthStr = args[1];
		System.out.println("yearStr:"+yearStr);
		System.out.println("monthStr:"+monthStr);

	}

}
