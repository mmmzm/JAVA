package com.pcwk.ehr.ed03;

public class R03_Continue {

	public static void main(String[] args) {
		
		//1~10사이에 홀수만 출력 하기.(짝수면 건너 뛰기)
		
		for(int i=1;i<=10;i++) {
			
			if(i%2==0) {//짝수
				continue;
			}
			
			System.out.println(i);
		}

	}

}
//1
//3
//5
//7
//9