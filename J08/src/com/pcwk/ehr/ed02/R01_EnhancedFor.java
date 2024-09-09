package com.pcwk.ehr.ed02;

public class R01_EnhancedFor {

	public static void main(String[] args) {
		//향상된 for
		int []numbers = {13,15,18,52,48};
		
		for(int number  :numbers) {
			System.out.println(number);
		}
		
		System.out.println("──────────────────────────────────────────────────");
		
		//numbers.length : 5
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
	}

}
//13
//15
//18
//52
//48
//──────────────────────────────────────────────────
//13
//15
//18
//52
//48