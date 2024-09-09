package com.pcwk.ehr.ed02;

public class Q01 {

	public static void main(String[] args) {
		// 총합과 평균 
		int [ ]score = {100,88,100,100,90};
		
		int sum = 0;//총합
		double avg = 0.0d;//평균
		
		//1. 총합 : 배열 전체 순회
		for(int i=0;i<score.length;i++) {
			sum = sum + score[i];
		}
		
		System.out.println("sum:"+sum);//sum:478
		
		//2.평균
		avg = sum/(score.length*1.0);//int/double
		System.out.println("avg:"+avg);

	}

}
//sum:478
//avg:95.6

