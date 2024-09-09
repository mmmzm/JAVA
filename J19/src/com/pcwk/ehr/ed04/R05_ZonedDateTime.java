package com.pcwk.ehr.ed04;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
//ctrl+shift+o

public class R05_ZonedDateTime {

	public static void main(String[] args) {
		//현재 날짜와 시간대
		ZonedDateTime  currentZonedDateTime = ZonedDateTime.now();
		System.out.println("현재 날짜와 시간대: "+currentZonedDateTime);

		
		//특정 시간대 설정
		ZoneId  newYorkZone= ZoneId.of("America/New_York");
		
		ZonedDateTime customeZoneDateTime = ZonedDateTime.now(newYorkZone);
		System.out.println("특정 시간대 설정(New_York):"+customeZoneDateTime);
		
		
		//Asia/Seoul
		ZonedDateTime seoulZoneDateTime=ZonedDateTime.of(LocalDate.now()
				                                       , LocalTime.now()
				                                       , ZoneId.of("Asia/Seoul"));
		
		System.out.println("특정 시간대 설정(Seoul):"+seoulZoneDateTime);
		
		//날짜 및 시간 형식 : yyyy/MM/dd HH:mm:ss Z
		DateTimeFormatter  formater=DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss Z");
		String formattedDateTimeZone = seoulZoneDateTime.format(formater);
		System.out.println("날짜 및 시간 형식 : yyyy/MM/dd HH:mm:ss Z =>"+formattedDateTimeZone);
		
	}

}
//현재 날짜와 시간대: 2024-04-04T14:48:16.938+09:00[GMT+09:00]
//특정 시간대 설정(New_York):2024-04-04T01:48:16.951-04:00[America/New_York]
//특정 시간대 설정(Seoul):2024-04-04T14:48:16.983+09:00[Asia/Seoul]
//날짜 및 시간 형식 : yyyy/MM/dd HH:mm:ss Z =>2024/04/04 14:48:16 +0900
