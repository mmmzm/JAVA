package com.pcwk.ehr.ed03;

import java.util.Scanner;

public class R01_DoWhile {

	public static void main(String[] args) {
		//1~100사이에 임의의 난수 발생, 이 수를 맞추기.
		
		int input = 0;//입력
		int answer= 0;//임의 난수
		//0.0<=?<1.0
		//0.0<=?<100.0 -> *100
		//0<=?<100     -> (int)
		//1<=?<101     -> +1

		answer = (int)(Math.random()*100)+1;
		Scanner scanner=new Scanner(System.in);
		
		System.out.printf("answer=%d%n",answer);
		do {
			System.out.print("1과 100사이 숫자를 입력 하세요>");
			input=scanner.nextInt();
			
			if(input > answer) {
				System.out.println("더 작은 수를 입력 하세요.");
			}else if(input < answer) {
				System.out.println("더 큰 수를 입력 하세요.");
			}
			
		}while(answer != input);//answer!=입력수
		
		System.out.println("정답 입니다.");

		
	}

}
//answer=97
//1과 100사이 숫자를 입력 하세요>50
//더 큰 수를 입력 하세요.
//1과 100사이 숫자를 입력 하세요>75
//더 큰 수를 입력 하세요.
//1과 100사이 숫자를 입력 하세요>90
//더 큰 수를 입력 하세요.
//1과 100사이 숫자를 입력 하세요>95
//더 큰 수를 입력 하세요.
//1과 100사이 숫자를 입력 하세요>97
//정답 입니다.
