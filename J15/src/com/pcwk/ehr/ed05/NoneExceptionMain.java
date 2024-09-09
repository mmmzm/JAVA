package com.pcwk.ehr.ed05;

public class NoneExceptionMain {

	
	public static void main(String[] args) {
		System.out.println("A");
		System.out.println("B");
		
		System.out.println(22/0);
		System.out.println("C");
		
		System.out.println("프로그램 종료");
	}

}
//A
//B
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at com.pcwk.ehr.ed05.NoneExceptionMain.main(NoneExceptionMain.java:10)
