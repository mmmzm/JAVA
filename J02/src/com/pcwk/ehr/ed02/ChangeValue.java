package com.pcwk.ehr.ed02;

public class ChangeValue {
	
	public static void main(String []args) {
		//두 변수에 값을 교환
		//run : ctrl+F11
		int x = 13;
		int y = 15;
		int tmp = 0;
		//sysout + ctrl+space
		System.out.println("x="+x+", y="+y);
		
		tmp = x;
		x   = y;
		y   = tmp;
		System.out.println("x="+x+", y="+y);
	}
}
