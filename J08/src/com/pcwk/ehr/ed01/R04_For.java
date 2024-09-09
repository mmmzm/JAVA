package com.pcwk.ehr.ed01;

public class R04_For {

	public static void main(String[] args) {
		// 1~10까지 홀수의 합 구하기.

		int sum = 0;
		for (int i = 1; i <= 10; i++) {

			if (i % 2 != 0) {
				sum += i;
				System.out.println(i);
			}
		}

		System.out.printf("sum=%d%n", sum);
		System.out.println("──────────────────────────────────────────────────");
		sum = 0;
		for (int i = 1; i <= 10; i+=2) {

				sum += i;
				System.out.println(i);
			
		}
		System.out.printf("sum=%d%n", sum);
	}

}
