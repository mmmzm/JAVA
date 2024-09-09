package com.pcwk.ehr.ed04;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
//ctrl+shift+O
public class R02_LocalDateLocalTimeGet {

	public static void main(String[] args) {
//		ChronoField.YEAR	연도를 나타내는 필드, 날짜와 시간 객체에서 연도를 읽거나 설정할 때 사용
//		ChronoField.MONTH_OF_YEAR	월을 나타내는 필드, 1부터 12까지
//		ChronoField.DAY_OF_MONT	한 달의 일을 나타내는 필드, 1부터 31까지
//		ChronoField.HOUR_OF_DAY	하루의 시간을 나타내는 필드, 0~23까지
//		ChronoField.MINUTE_OF_HOUR	시간의 분을 나타내는 필드, 0~59까지
//		ChronoField.SECOND_OF_MINUTE	분의 초를 나타내는 필드, 0~59까지
//		ChronoField.NANO_OF_SECOND	초의 나노초를  나타내는 필드, 0~999,999,999까지
//		ChronoField.DAY_OF_WEEK	주의 요일을 나타내는 필드로 월요일부터 일요일까지 값을 가집니다.
//		ChronoField.DAY_OF_YEAR	연중 일 수를 나타내는 필드로 1~365까지
//		ChronoField.EAR	연대(기원저, 후)를 나타내는 필드 음수, 양수
		
		//현재 날짜
		LocalDate  currentDate = LocalDate.now();

		//getter
		int year = currentDate.getYear();
		int month = currentDate.getMonthValue();
		int day   = currentDate.getDayOfMonth();
		
		System.out.println("year:"+year);
		System.out.println("month:"+month);
		System.out.println("day:"+day);
		System.out.println("--------------------------------------------------");
		
		//get(ChronoField)
		int chronoYear = currentDate.get(ChronoField.YEAR);
		int chronoMonth = currentDate.get(ChronoField.MONTH_OF_YEAR);
		int chronoWeek  = currentDate.get(ChronoField.DAY_OF_WEEK);
		
		System.out.println("chronoYear:"+chronoYear);
		System.out.println("chronoMonth:"+chronoMonth);
		System.out.println("chronoWeek:"+chronoWeek);//목(4): 월요일(1), 일요일(7)
		System.out.println("--------------------------------------------------");
		
		LocalTime currentTime = LocalTime.now();
		//getter
		int hour  = currentTime.getHour();
		int minute  = currentTime.getMinute();
		int second  = currentTime.getSecond();
		
		System.out.println("hour:"+hour);
		System.out.println("minute:"+minute);
		System.out.println("second:"+second);
		
		//get(ChronoField)
		int chronoHour   = currentTime.get(ChronoField.HOUR_OF_DAY);
		int chronoMinute = currentTime.get(ChronoField.MINUTE_OF_HOUR);
		int chronoSecond = currentTime.get(ChronoField.SECOND_OF_MINUTE);
		System.out.println("chronoHour:"+chronoHour);
		System.out.println("chronoMinute:"+chronoMinute);
		System.out.println("chronoSecond:"+chronoSecond);
	}

}
//year:2024
//month:4
//day:4
//--------------------------------------------------
//chronoYear:2024
//chronoMonth:4
//chronoWeek:4
//--------------------------------------------------
//hour:12
//minute:45
//second:52
//chronoHour:12
//chronoMinute:45
//chronoSecond:52
