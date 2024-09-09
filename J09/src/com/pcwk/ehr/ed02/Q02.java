package com.pcwk.ehr.ed02;

public class Q02 {
//	1. 최대값, 최소값 변수 선언
//	2. 최대값에,최소값에 score에 배열요소 첫번째 값을 할당한다.
//	3. score 모든 요소를 순회한다.
//	4. 최대값변수와 score 배열 요소의 값을 비교한다. 
//	-최대값변수>score[i] 그러면 최대값변수=score[i]
//
//	5. 최소값 변수 와 score 배열 요소의 값을 비교한다. 
//	-최소값 변수<score[i] 그러면 최소값 변수=score[i]
	public static void main(String[] args) {
		// 최대값과 최소값, int[] score = {79,88,91,33,100,55,95}
		int[] score = { 79, 88, 91, 33, 100, 55, 95 };

		int max = score[0];
		int min = score[0];

		for (int i = 0; i < score.length; i++) {
			// System.out.println(score[i]);
			if (max < score[i]) {// 최대값
				max = score[i];
				// System.out.println(max);
			}

			if (min > score[i]) {
				min = score[i];
			}
		}

		System.out.printf("최대값:%d%n",max);
		System.out.printf("최소값:%d%n",min);
		
		
	}

}
//최대값:100
//최소값:33
