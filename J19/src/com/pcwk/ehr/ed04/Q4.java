package com.pcwk.ehr.ed04;

public class Q4 {
	public static void main(String[] args) {
//		1 + (-2) + 3 +(-4) + … 몇까지 더해야 총합이 100이상이 될까요?
//				-양수, 음수, 양수,….
		
		int sum = 0;//합계
		
		
		for(int i=1,j=1;true;i++,j*=-1) {//for(;;){} == while(true){}
			//-양수, 음수, 양수,….
			//1   , -1 , 1,...
			int k = i * j;
			System.out.printf("k=%4d, j=%d\n",k,j);
			sum +=k;
			if(sum>=100) {
				System.out.println("──────────────────────────────────────────");
				System.out.printf("i=%d \t sum=%d%n",i,sum);
				break;//반복문 1개를 벋어 난다.
			}
		}

	}

}
//k= 199, j=1
//k=-200, j=-1
//k= 201, j=1
//──────────────────────────────────────────
//i=201 	 sum=101
