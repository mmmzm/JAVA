package com.pcwk.ehr.ed01;

public class R05_Throws {

	public static void main(String[] args) {
		
		try {
			checkAge(17);
		}catch(IllegalArgumentException e) {
			System.out.println("IllegalArgumentException:"+e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException:"+e.getMessage());
		}
		
		System.out.println("┌─────────────────────────────────┐");
		System.out.println("│프로그램 종료                                            │");
		System.out.println("└─────────────────────────────────┘");		
	}

	
	public static void checkAge(int age)throws IllegalArgumentException,ArrayIndexOutOfBoundsException {
		
		if(age<18) {
			throw new IllegalArgumentException("18이상 Acesse가능 합니다.");
		}else {
			System.out.println("사이트 Acesse가능 합니다.");
		}
		
		
	}
	
}

//IllegalArgumentException:18이상 Acesse가능 합니다.
//┌─────────────────────────────────┐
//│프로그램 종료                                            │
//└─────────────────────────────────┘

