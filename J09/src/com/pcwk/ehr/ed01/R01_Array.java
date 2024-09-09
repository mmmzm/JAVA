package com.pcwk.ehr.ed01;

public class R01_Array {

	public static void main(String[] args) {
//		타입[ ] 변수이름;       //배열선언
//		변수이름 = new 타입[길이];//배열을 생성(메모리에 할당)

		int []score;       //배열선언
		score = new int[5];//배열을 생성(메모리에 할당)
		
		//int의 default인 0으로 초기화
		System.out.println("score[3]="+score[3]);
		
		//배열 요소 접근에 변수 사용
		int i =1;
		
		final int j = 0;
		score[j] = 77;
		score[i] = 88;
		score[i+1] = 89;
		score[i+2] = 92;
		score[4]   = 95;
		
		//배열에 할당된 요소값
		int tmpScore = score[0];
		System.out.printf("tempScore=%d%n",tmpScore);
		
		//배열 요소간 연산
		tmpScore = score[1] + score[2];
		System.out.printf("tempScore=%d%n",tmpScore);
		
		//배열의 길이: 배열이름.length
		System.out.printf("배열이름.length:%d%n",score.length);
		
		//반복문으로 배열 접근
		//i<=score.length : '=' 포함하면 예외 발생( java.lang.ArrayIndexOutOfBoundsException)
		for(i=0;i<score.length;i++) {
			System.out.printf("i=%d,score[%d]=%d  %n",i,i,score[i]);
		}
		
	}

}
//score[3]=0
//tempScore=77
//tempScore=177
//배열이름.length:5
//i=0,score[0]=77  
//i=1,score[1]=88  
//i=2,score[2]=89  
//i=3,score[3]=92  
//i=4,score[4]=95  
