package com.pcwk.ehr.ed01;

import java.util.Scanner;

public class R04_ConditionIfElseIfElse {

	public static void main(String[] args) {
//		- 성적을 입력 받아 학점을 출력하는 프로그램을 작성 하세요.
//		90점 이상 → A, 95점 이상이면 A+
//		80점 이상 → B, 85점 이상이면 B+
//		70점 이상 → C, 75점 이상이면 C+
//		60점 이상 → D, 65점 이상이면 D+
//		60점 미만 → F

		Scanner scanner=new Scanner(System.in);
		
		int score  = 0;  //성적
		char grade = ' ';//학점
		char opt   = ' ';//
		
		System.out.print("성적을 입력 하세요.>");
		score = scanner.nextInt();
		
		System.out.printf("입력 점수는 %d입니다. %n",score);
		
		if(score>=90) {
			grade = 'A';
			if(score>=95) {
				opt = '+';
			}
			
		}else if(score>=80) {//else if(80<=score && score<=89)
			grade = 'B';
			if(score>=85) {
				opt = '+';
			}
			
		}else if(score>=70) {
			grade = 'C';
			if(score>=75) {
				opt = '+';
			}			
		}else if(score>=60) {
			grade = 'D';
			if(score>=65) {
				opt = '+';
			}			
		}else {
			grade = 'F';
		}
		
		System.out.printf("학점은 %c%c 입니다.%n",grade,opt);
		System.out.println("프로그램 종료!");
		scanner.close();

	}

}
//성적을 입력 하세요.>96
//입력 점수는 96입니다. 
//학점은 A+ 입니다.
//프로그램 종료!
