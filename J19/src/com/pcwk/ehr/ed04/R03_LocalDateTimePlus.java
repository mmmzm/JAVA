package com.pcwk.ehr.ed04;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class R03_LocalDateTimePlus {

	public static void main(String[] args) {
//		: 날짜와 시간에서 특정 필드 값을 변경 할수 있음.
//		withXXX(), plusXXX(), minusXXX();
		//withXXX() : 특정 필드를 지정한 값으로 변경한 새로운 객체를 반환
		//plusXXX() : 지정된 시간 양만큼 날짜 또는 시간을 증가 ex)plusDay(long daysToAdd)
		//minusXXX(): 지정된 시간 양만큼 날짜 또는 시간을 감소 ex)minusMonth(long monthsToSubtract)
		
		//현재 날짜
		LocalDate currentDate = LocalDate.now();
		System.out.println("현재 날짜:"+currentDate);
		
		//현재 날짜에서 1년 더하기
		LocalDate nextYearDate=currentDate.plusYears(1);
		System.out.println("1년 후:"+nextYearDate.toString());
		
		//현재 날짜에서 3개월을 더하고, 그중 일을 10일로 변경
		LocalDate futureDate=currentDate.plusMonths(3).withDayOfMonth(10);
		System.out.println("3개월 후:"+futureDate);
		
		//현재 날짜에서 2주빼기, 그중 요일을 월요일로 변경.
		LocalDate previouDate = currentDate.minusWeeks(2).with(ChronoField.DAY_OF_WEEK, 1);
		System.out.println("현재 날짜에서 2주빼기:"+previouDate);
	}
}
//현재 날짜:2024-04-04
//1년 후:2025-04-04
//3개월 후:2024-07-10
//현재 날짜에서 2주빼기:2024-03-18
