package com.pcwk.ehr.ed01;

import java.util.Calendar;

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
	 * 2째주 일요일 날짜 구하기
	 * @param cal
	 * @param startDay
	 * @param endDay
	 * @param firstOfDayOfWeek
	 * @return 2024-04-14
	 */
	public static String superClosingDays(Calendar cal, int startDay, int endDay, int firstOfDayOfWeek ) {
		int count = 0;
		for(int i=startDay;i<=endDay;i++) {
			
			//시작요일 : 1이면 : 일요일 이므로 1을 증가 시킨다.
			if(firstOfDayOfWeek==1)count++;
			
			if(firstOfDayOfWeek % 7 ==0) {//토요일
				cal.set(Calendar.DATE, i+1);//토요일 +1 일요일
				
				count++;
				if(count ==2) {
					//System.out.println(toDateFormatString(cal));
					break;
				}
			}
			
			firstOfDayOfWeek++;
		}
		
		return toDateFormatString(cal);
	}
	
	public static void main(String[] args) {
		//2024년도 1월 12월까지 2째주 일요일 날짜 구하기
		//1. 1월 ~ 12월까지 2째주 일요일 날짜구하기
		//2. 4월 2째 일요일
		//3. 4월1일 -> 2째주 일요일
		
		Calendar cal = Calendar.getInstance();
		//System.out.println(toDateFormatString(cal));
		
		//매달 1일: 2024.4.1
		cal.set(Calendar.YEAR, 2024);
		//for(int i=0;i<=Calendar.DECEMBER;i++) {
		for(int i=Calendar.JANUARY;i<=Calendar.DECEMBER;i++) {
			cal.set(Calendar.MONTH, i);
			cal.set(Calendar.DATE, 1);
			
			
			//그 달의 마지막날
			int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
			
			//시작요일
			int firstOfDayOfWeek = cal.get(Calendar.DAY_OF_WEEK); //1(Sunday)
			
			//System.out.println(toDateFormatString(cal)+"~"+lastDay+","+firstOfDayOfWeek);
			
			System.out.println(superClosingDays(cal,1,lastDay,firstOfDayOfWeek));
			
		}
		

	}

}
//2024년01월14일
//2024년02월11일
//2024년03월10일
//2024년04월14일
//2024년05월12일
//2024년06월09일
//2024년07월14일
//2024년08월11일
//2024년09월15일
//2024년10월13일
//2024년11월10일
//2024년12월15일
