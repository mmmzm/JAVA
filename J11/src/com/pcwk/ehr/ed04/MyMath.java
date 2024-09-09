package com.pcwk.ehr.ed04;

public class MyMath {

	long max(long x, long y) {
		return (x>y)?x:y;
	}
	
	
//	long max(long x, long y) {
//		if(x>y) {
//			return x;
//		}else {
//			return y;
//		}
//	}
	
	//같은 클래스에 메서드는 클래스 메서드만 호출 가능
	static void classMethod(long x, long y) {
		//add(x,y);
	}
	
	//같은 클래스에 메서드 서로 호출 가능
	void callMethod(long x, long y) {
		long result = add(x,y);
		classMethod(x,y);//호출가능
	}
	/**
	 * 더하기 
	 * @param x
	 * @param y
	 * @return x+y
	 */
	long add(long x, long y) {
		long result = x + y;
		
		return result;
	}
	
	/**
	 * 빼기
	 * @param x
	 * @param y
	 * @return x - y
	 */
	long substract(long x, long y) {
		long result = x - y;
		
		
		return result;
	}
	
	/**
	 * 곱하기
	 * @param x
	 * @param y
	 * @return x * y
	 */
	long multiply(long x, long y) {
		long result = x * y;
		
		return result;
	}
	
	double divide(double x, double y) {
		return x/y;
	}
	
	
	
	
}
