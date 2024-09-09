package com.pcwk.ehr.t1;

import java.util.Date;

import com.pcwk.ehr.cmn.PLog;

public class DateMain implements PLog {

	public static void main(String[] args) {
        // 현재 날짜와 시간을 가져오기 위해 Date 객체 생성: 대부분 @Deprecated되어 있음!
        Date currentDate = new Date();
        
        // 년, 월, 일, 시, 분, 초 가져오기
        int year = currentDate.getYear() + 1900; // 1900년을 기준으로 더해줘야 실제 연도를 얻을 수 있습니다.
        int month = currentDate.getMonth() + 1; // 월은 0부터 시작하기 때문에 1을 더해줘야 합니다.
        int day = currentDate.getDate();
        int hour = currentDate.getHours();
        int minute = currentDate.getMinutes();
        int second = currentDate.getSeconds();
        
        // 출력
        System.out.println("Current Date and Time: " + currentDate);
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        System.out.println("Hour: " + hour);
        System.out.println("Minute: " + minute);
        System.out.println("Second: " + second);
    }
}
