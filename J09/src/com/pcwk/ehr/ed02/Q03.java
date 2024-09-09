package com.pcwk.ehr.ed02;

import java.util.Arrays;

public class Q03 {

	public static void main(String[] args) {
		// 섞기(shuffle) : 배열의 요소의 순선를 반복해서 변경한다.(로또번호 생성기)
        //1~45 :숫자를 담는 배열 생성, 값 할당
		//ball
		
		//1
		int []ball=new int[45];
		System.out.println(Arrays.toString(ball));
		
		
		for(int i=0;i<ball.length;i++) {
			ball[i] = i+1;
		}
		//1~45까지 값 할당
		System.out.println(Arrays.toString(ball));
		
		
		//2.
		for(int i=0;i<=100;i++) {
			int num =(int)(Math.random() * 45);//0<=num<45
			//System.out.println("num:"+num);
			int emptyVar = ball[0];
			ball[0]      = ball[num];
			ball[num]    = emptyVar;
		}
		
		System.out.println("──────────────────────────────────────────────────");
		//3. shuffle이후 ball
		for(int i=0;i<6;i++) {
			System.out.print(ball[i]+",");
		}
		//23,5,1,14,20,43,30,42,37,10,2,17,9,13,16,19,26,25,35,39,32,24,40,6,33,22,21,28,45,11,4,31,7,44,29,36,8,27,12,3,41,15,38,34,18,
		
		
		
	}

}
