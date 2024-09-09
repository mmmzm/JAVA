package com.pcwk.ehr.ed01;

public class R08_Gugu {

	public static void main(String[] args) {

		//바깥for : 단(2~9)
		//안쪽for : (1~9)
		
		for(int i=2;i<=9;i++){
			System.out.printf("%d단%n",i);
			
			for(int j=1;j<=9;j++) {
				System.out.printf("%d * %d = %2d%n",i,j,(i*j));
			}
			System.out.println();
			
		}
		System.out.println("프로그램 종료");
	}

}
//2단
//2 * 1 =  2
//2 * 2 =  4
//2 * 3 =  6
//2 * 4 =  8
//2 * 5 = 10
//2 * 6 = 12
//2 * 7 = 14
//2 * 8 = 16
//2 * 9 = 18
//
//3단
//3 * 1 =  3
//3 * 2 =  6