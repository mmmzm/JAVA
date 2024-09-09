package com.pcwk.ehr.ed01;
import java.util.Date;


public class R02_Date {

	public static void main(String[] args) {
		Date currentDate =new Date();
		
		//년,월,일
		int year = currentDate.getYear()+1900;//1900년을 기준으로 더해줘야 실제 연도를 얻을수 있다.
		int month= currentDate.getMonth()+1;
		int day  = currentDate.getDate();
		
		//시,분,초
		int hour = currentDate.getHours();
		int minute = currentDate.getMinutes();
		int second = currentDate.getSeconds();
		
		System.out.println("year:"+year);
		System.out.println("month:"+month);
		System.out.println("day:"+day);
		System.out.println("--------------------------");
		System.out.println("hour:"+hour);
		System.out.println("minute:"+minute);
		System.out.println("second:"+second);
	}

}
