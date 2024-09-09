package com.pcwk.ehr.ed01;

public class R02_MultiCatch {

	public static void main(String[] args) {
		
		System.out.println("1");
		int [] numbers= {13,15,18};
		
		try {
			System.out.println("2");
			for(int i=0;i<=numbers.length;i++) {
				
				System.out.println(numbers[i]/0);
			}
			System.out.println("3");
		}catch(ArrayIndexOutOfBoundsException | ArithmeticException e) {
		
			if( e instanceof ArithmeticException) {
				System.out.println("A*");
				System.out.println("ArithmeticException:"+e.getMessage());
			}else if( e instanceof ArrayIndexOutOfBoundsException) {
				System.out.println("B@");
				System.out.println("ArrayIndexOutOfBoundsException:"+e.getMessage());
			}
			
		}
		
		System.out.println("──────────────────────────────────");
		System.out.println("─프로그램 종료─");
		System.out.println("──────────────────────────────────");

	}

}
//1
//2
//13
//15
//18
//B@
//ArrayIndexOutOfBoundsException:3
//──────────────────────────────────
//─프로그램 종료─
//──────────────────────────────────