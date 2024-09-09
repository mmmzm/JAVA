package com.pcwk.ehr.ed02;

public class TimeMain {

	public static void main(String[] args) {
		Time t=new Time();
		
		//private int hour : 멤버 변수를 볼수가 없음!
		t.setHour(17);
		t.setMinute(15);
		t.setSecond(30.0f);
		
		System.out.println(t.getHour()+":"+t.getMinute()+":"+t.getSecond());

	}

}
//17:15:30.0