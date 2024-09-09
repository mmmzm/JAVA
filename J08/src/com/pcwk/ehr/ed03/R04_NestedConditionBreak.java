package com.pcwk.ehr.ed03;

public class R04_NestedConditionBreak {

	public static void main(String[] args) {

		// break는 가장 가까운 break문을 벚어난다.

		// 이름 붙은 반복문

		LoopI: for (int i = 2; i <= 9; i++) {
					System.out.printf("%d단%n", i);
					for (int j = 1; j <= 9; j++) {
						if (j == 5) {
							break   LoopI;
						}
						System.out.printf("%d * %d = %2d%n", i, j, (i * j));
					}
					System.out.println();

		        }
		System.out.println("프로그램 종료!");

	}

}
//2단
//2 * 1 =  2
//2 * 2 =  4
//2 * 3 =  6
//2 * 4 =  8
//프로그램 종료!



//2단
//2 * 1 =  2
//2 * 2 =  4
//2 * 3 =  6
//2 * 4 =  8
//
//3단
//3 * 1 =  3
//3 * 2 =  6
//3 * 3 =  9
//3 * 4 = 12
//
//4단
//4 * 1 =  4
//
//...
//9단
//9 * 1 =  9
//9 * 2 = 18
//9 * 3 = 27
//9 * 4 = 36
//
//프로그램 종료!
