package com.pcwk.ehr.t02;

public class Main {

	public static void main(String[] args) {
        // 각 요일에 대한 상수 사용 예제
		
        System.out.println("Monday: " + Day.MONDAY.getDisplayName()+","+Day.MONDAY.getDisplayValue());
        System.out.println("Tuesday: " + Day.TUESDAY.name());
        System.out.println("Wednesday: " + Day.WEDNESDAY.getDisplayName());
        System.out.println("Thursday: " + Day.THURSDAY.getDisplayName());
        System.out.println("Friday: " + Day.FRIDAY.getDisplayName());
        System.out.println("Saturday: " + Day.SATURDAY.getDisplayName());
        System.out.println("Sunday: " + Day.SUNDAY.getDisplayName()+","+Day.SUNDAY.getDisplayValue());

	}

}
