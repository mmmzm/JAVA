package com.pcwk.ehr.ed01;

import java.util.Arrays;

public class R02_ArrayInit {

	public static void main(String[] args) {
		//배열의 선언과 생성
		int []score = new int[5];
		
		//배열 요소 출력: int default값이 0으로 초기화
		for(int i=0;i<score.length;i++) {
			System.out.printf("score[%d]=%d%n",i,score[i]);
		}
		
		//배열 선언, 생성과 초기화
		int []iArray02 = new int[] {77,88,79,95,99};
		//배열 선언, 생성과 초기화 'new int[]' 생략
		int []iArray03 = {77,88,79,95,99};
		
		//배열의 길이
		System.out.println("iArray03길이:"+iArray03.length);//iArray03길이:5
		
		//전체 데이터 출력: 향상된 for문을 통한 배열 접근
		for(int num  :iArray03) {
			System.out.println(num);
		}
		
		//API통한 접근: 데이터 출력: Arrays.toString(iArray03):[77, 88, 79, 95, 99]
		System.out.println("Arrays.toString(iArray03):"+ Arrays.toString(iArray03));
		
		char[] chArray= {'a','b','c','d'};
		System.out.println("chArray:"+chArray);//C@4aa298b7
		System.out.println("Arrays.toString(chArray):"+Arrays.toString(chArray));//[a, b, c, d]
		
		System.out.println("──────────────────────────────────────────────────");
		//iArray02: 합계, 평균
		int    sum = 0;
		double avg = 0.0D;//실수의 default double
		
		for(int i=0;i<iArray02.length;i++) {
			sum += iArray02[i];
			System.out.printf("iArray02[%d]=%d,sum=%d%n",i,iArray02[i],sum);
		}
		
		System.out.println("sum="+sum);//sum=438
		
		avg=sum/(iArray02.length*1.0);//int/(int*double)
		
		System.out.println("avg="+avg);//avg=87.6
	}

}
//score[0]=0
//score[1]=0
//score[2]=0
//score[3]=0
//score[4]=0
//iArray03길이:5
//77
//88
//79
//95
//99
//Arrays.toString(iArray03):[77, 88, 79, 95, 99]
//chArray:[C@4aa298b7
//Arrays.toString(chArray):[a, b, c, d]
//──────────────────────────────────────────────────
//iArray02[0]=77,sum=77
//iArray02[1]=88,sum=165
//iArray02[2]=79,sum=244
//iArray02[3]=95,sum=339
//iArray02[4]=99,sum=438
//sum=438
//avg=87.6











