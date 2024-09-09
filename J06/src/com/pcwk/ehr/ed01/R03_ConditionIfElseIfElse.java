package com.pcwk.ehr.ed01;

import java.util.Scanner;

public class R03_ConditionIfElseIfElse {

	public static void main(String[] args) {
//		- 성적을 입력 받아 학점을 출력하는 프로그램을 작성 하세요.
//		90점 이상 → A
//		80점 이상 → B
//		70점 이상 → C
//		60점 이상 → D
//		60점 미만 → F

		Scanner scanner=new Scanner(System.in);
		
		int score  = 0;  //성적
		char grade = ' ';//학점
		
		System.out.print("성적을 입력 하세요.>");
		score = scanner.nextInt();
		
		System.out.printf("입력 점수는 %d입니다. %n",score);
		
		if(score>=90) {
			grade = 'A';
		}else if(score>=80) {//else if(80<=score && score<=89)
			grade = 'B';
		}else if(score>=70) {
			grade = 'C';
		}else if(score>=60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		
		System.out.printf("학점은 %c 입니다.%n",grade);
		System.out.println("프로그램 종료!");
		scanner.close();

	}

}
//성적을 입력 하세요.>79
//입력 점수는 79입니다. 
//학점은 C 입니다.
//프로그램 종료!




