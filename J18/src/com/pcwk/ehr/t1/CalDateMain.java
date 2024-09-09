package com.pcwk.ehr.t1;

import java.util.Calendar;
import java.util.Date;

public class CalDateMain {
	public static void main(String[] args) {
        // Calendar 객체 생성
        Calendar calendar = Calendar.getInstance();
        
        // Date 객체 생성
        Date date = new Date();
        
        
        
        // 현재 날짜와 시간 출력
        System.out.println("Current Date and Time (using Calendar): " + calendar.getTime());
        System.out.println("Current Date and Time (using Date): " + date);
    }
}
