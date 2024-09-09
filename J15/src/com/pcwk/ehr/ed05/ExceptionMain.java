package com.pcwk.ehr.ed05;

public class ExceptionMain {

	
	public static void main(String[] args) {
		System.out.println("A");
		System.out.println("B");
		
		try {
			System.out.println(22/0);
			System.out.println("C");
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException 발생"+e.getMessage());
			//e.printStackTrace();
			
		}catch(Exception e) {
			System.out.println("Exception 발생"+e.getMessage());
			e.printStackTrace();
		}
		
		
		System.out.println("프로그램 종료");
	}

}
//A
//B
//ArithmeticException 발생/ by zero
//프로그램 종료

