package com.pcwk.ehr.ed02;

import java.util.Calendar;

import com.pcwk.ehr.cmn.PLog;
//ctrl+shift+o
public class R03_CalendarSet implements PLog {

	//반환값은 : String(2024년 8월 29일)
	//toDateFormatString
	//전달 인자 : Calendar  cal
	public static String toDateFormatString(Calendar  cal) {
		String result = "";
		//printf 사용방법이 동일
		result = result.format("%d년%02d월%02d일" ,cal.get(Calendar.YEAR)
				                                ,cal.get(Calendar.MONTH)+1
				                                ,cal.get(Calendar.DAY_OF_MONTH));
		return result;
	}
	
	public static void main(String[] args) {
		//Calendar객체 생성
		Calendar  cal= Calendar.getInstance();
		System.out.println(toDateFormatString(cal));
		int lastDayOfMonth =cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("lastDayOfMonth:"+lastDayOfMonth);
		
		System.out.println("--------------------------------------------------");
		//2024년 8월 29일
		cal.set(Calendar.YEAR, 2024);
		cal.set(Calendar.MONTH, 7);
		cal.set(Calendar.DAY_OF_MONTH,29);	
		System.out.println(toDateFormatString(cal));
		
		//8월 마지막 일
		lastDayOfMonth =cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("lastDayOfMonth:"+lastDayOfMonth);
	}

}
//2024년04월03일
//lastDayOfMonth:30
//--------------------------------------------------
//2024년08월29일
//lastDayOfMonth:31
