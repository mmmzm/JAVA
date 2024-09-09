package com.pcwk.ehr.ed01;

import java.util.Calendar;

public class R01_CalendarMonth {

	public static String toDateFormatString(Calendar  cal) {
		String result = "";
		//printf 사용방법이 동일
		result = result.format("%d년%02d월%02d일" ,cal.get(Calendar.YEAR)
				                                ,cal.get(Calendar.MONTH)+1
				                                ,cal.get(Calendar.DAY_OF_MONTH));
		return result;
	}
	
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
		//System.out.println("yearStr:"+yearStr);
		//System.out.println("monthStr:"+monthStr);
		
		//문자 년도 숫자로 변환
		year = Integer.parseInt(yearStr);
		
		//문자 월을 숫자로 변환
		month = Integer.parseInt(monthStr)	;	
		
		
		//입력 년 월 일 : 2024 4 1 : 당일 시작일 set, 시작 요일 찾기
		
		//Calendar객체 생성 : 추상 클래스 이므로 메서드 통해서 객체 생성
		Calendar cal = Calendar.getInstance();
		
		//입력 년 월 일 : 2024 4 1
		cal.set(Calendar.YEAR,year);
		cal.set(Calendar.MONTH, month-1);//Calendar의 1월은 0
		cal.set(Calendar.DAY_OF_MONTH, 1);
		
		System.out.println(toDateFormatString(cal));
		
		//시작요일 : 
//		SUNDAY : 1
//		MONDAY : 2
//		TUESDAY
//		WEDNESDAY
//		THURSDAY
//		FRIDAY
//		SATURDAY : 7		
		int firstDayOfWeek=cal.get(Calendar.DAY_OF_WEEK);
		//System.out.println("firstDayOfWeek:"+firstDayOfWeek);
		
		String[] dayOfWeek = {"일","월","화","수","목","금","토"};
		
		//요일 출력
		for(String week  :dayOfWeek) {
			System.out.print(week+"\t");
		}
		System.out.println();
		
		//첫 주 시작요일 까지 
		for(int i=1;i<firstDayOfWeek;i++) {
			System.out.print("\t");
		}
		
		//그 달의 마지막날 
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		//System.out.println("lastDay:"+lastDay);
		for(int i=1;i<=lastDay;i++) {
			System.out.print(i+"\t");
			
			if(firstDayOfWeek % 7 == 0) {
				System.out.println();
			}
			firstDayOfWeek++;
		}
				
	}

}





