package com.pcwk.ehr.ed04;
import java.time.*;


public class R01_LocalDateLocalTime {

	public static void main(String[] args) {
//		LocalDate	날짜(연도, 월, 일)을 나타낸다.
//		LocalTime	시간(시,분,초)을 나타낸다.
//
//		객체 생성
//		now(): 현재 날짜와 시간
//		of(): 특정 날짜와 시간
		
		LocalDate   currentDate = LocalDate.now();
		System.out.println("현재 날짜:"+currentDate.toString());//현재 날짜:2024-04-04
		
		LocalDate   userDate   = LocalDate.of(2024, 8, 29);//수료 날짜:2024-08-29
		System.out.println("수료 날짜:"+userDate);// userDate 변수를 출력하면 내부적으로 toString()
		
		System.out.println("-------------------------------------------------");
		
		LocalTime  currentTime = LocalTime.now();
		System.out.println("현재 시간:"+currentTime.toString());
		
		LocalTime  userTime = LocalTime.of(18, 50, 1);
		System.out.println("퇴근 시간:"+userTime);
		
	}

}
//현재 날짜:2024-04-04
//수료 날짜:2024-08-29
//-------------------------------------------------
//현재 시간:12:20:00.670
//퇴근 시간:18:50:01