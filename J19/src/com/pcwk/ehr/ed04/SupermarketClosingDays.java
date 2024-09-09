package com.pcwk.ehr.ed04;

import java.util.Calendar;

import com.pcwk.ehr.cmn.DateUtil;

public class SupermarketClosingDays {
	/**
	 * Cal util -> 2024년04월03일
	 * @param cal
	 * @return 년월일 ex)2024년 8월 29일
	 */
	public static String toDateFormatString(Calendar  cal) {
		String result = "";
		//printf 사용방법이 동일
		result = result.format("%d년%02d월%02d일" ,cal.get(Calendar.YEAR)
				                                ,cal.get(Calendar.MONTH)+1
				                                ,cal.get(Calendar.DAY_OF_MONTH));
		return result;
	}
	/**
	 * 2024년도 1월 12월까지 2째주 일요일 구하기 
	 * @param cal
	 * @param startDay
	 * @param endDay
	 * @param firstOfDayOfWeek
	 */
	public static void superClosingDays(Calendar cal,int startDay, int endDay,int firstOfDayOfWeek) {
		int count = 0;//요일 변수
		
		for(int k=startDay;k<=endDay;k++) {	
			if(firstOfDayOfWeek % 7 ==0) {
				cal.set(Calendar.DATE,k+1);
				
				count++;
				if(count==2) {
					System.out.println(toDateFormatString(cal));
					break;
				}
				
			}
			//System.out.println(k+","+firstOfDayOfWeek);
			firstOfDayOfWeek++;
			
		}
	}
	
	public static void main(String[] args) {
		//2024년도 1월 12월까지 2째주 일요일 구하기
		
		//매달 2째주 일요일
		Calendar cal = Calendar.getInstance();
		System.out.println("현재날짜:"+toDateFormatString(cal));
		
		
		cal.set(Calendar.YEAR, 2024);
		
		
		//System.out.println(toDateFormatString(cal));
		for(int i=0;i<=Calendar.MAY;i++) {
			cal.set(Calendar.MONTH, i);
			cal.set(Calendar.DATE, 1);
			//System.out.println(toDateFormatString(cal));
			
			//1/1일의 요일
			int firstOfDayOfWeek = cal.get(Calendar.DAY_OF_WEEK);//1일요일
			
			//그 달의 마지막 날
			int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
			
			//System.out.println(1+"~"+lastDay+"("+firstOfDayOfWeek+")");
			
			superClosingDays(cal,1,lastDay,firstOfDayOfWeek);
			
			
		}

	}

}
