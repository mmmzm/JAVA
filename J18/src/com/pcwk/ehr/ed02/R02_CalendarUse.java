package com.pcwk.ehr.ed02;

import com.pcwk.ehr.cmn.PLog;
import java.util.Calendar;

public class R02_CalendarUse implements PLog {
	//반환 값은 : String
	//함수이름 : getWeekName
	//파람     : int week
	public static String getWeekName(int week) {
		
		String [] dayOfWeekArr = {"일","월","화","수","목","금","토"};
		
		return dayOfWeekArr[week-1];
	}
	
	
	public static void main(String[] args) {
		// 2024년 4월 3일
		// 요일: 수
		Calendar  cal=Calendar.getInstance();
		
		
		int year  =cal.get(Calendar.YEAR) ;
		int month =cal.get(Calendar.MONTH)+1 ;//1월 =0부터, 시작+1
		int day   =cal.get(Calendar.DAY_OF_MONTH);
		
		System.out.printf("%d년 %02d월 %02d일%n",year,month,day);
		
		//일,월,화,수,목,금,토
		//1 2 3 4 5 6 7
		System.out.println(getWeekName(cal.get(Calendar.DAY_OF_WEEK)));
		
	}

}
//2024년 04월 03일
//수
