package com.pcwk.ehr.ed01;

public class MyMath2 {
	long x;//인스턴스 변수
	long y;
	

	
	long add() {
		return x+y;
	}
	
	long substract() {
		return x-y;
	}	
	
	long multiply() {
		return x*y;
	}
	
	double divide() {
		return x/(y*1.0);
	}
	
	//클래스 메서드
	static long add(long x, long y) {
		return x + y;
	}
	
	static long substract(long x, long y) {
		return x - y;
	}	
	
	static long multiply(long x, long y) {
		return x * y;
	}	
	
	static double divide(double x, double y) {
		return x/y;
	}
}
