package com.pcwk.ehr.ed04;

import java.time.LocalDateTime;

public class R04_LocalDateTime {

	public static void main(String[] args) {
		//현재 날짜와 시간
		LocalDateTime currentDateTime=LocalDateTime.now();
		System.out.println("현재 날짜와 시간:"+currentDateTime);
		
		//특정 날짜와 시간
		LocalDateTime customeDateTime = LocalDateTime.of(2024, 8, 29, 17, 50, 1);
		System.out.println("특정 날짜와 시간:"+customeDateTime);
		
		//특정 날짜시간 문자열을 LocalDateTime
		String dateTimeStr = "2024-08-29T17:50:01";
		
		//문자열을 LocalDateTime객체로 변경
		LocalDateTime parsedDateTime = LocalDateTime.parse(dateTimeStr);
		System.out.println("문자열을 LocalDateTime객체로 변경:"+parsedDateTime);
		
		//3일 2시간 이후
		LocalDateTime futureDateTime = currentDateTime.plusDays(3).plusHours(2);
		System.out.println("3일 2시간 이후:"+futureDateTime);
		
	}

}
//현재 날짜와 시간:2024-04-04T14:31:44.846
//특정 날짜와 시간:2024-08-29T17:50:01
//문자열을 LocalDateTime객체로 변경:2024-08-29T17:50:01
//3일 2시간 이후:2024-04-07T16:31:44.846