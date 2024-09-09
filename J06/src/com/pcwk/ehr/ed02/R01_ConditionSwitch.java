
package com.pcwk.ehr.ed02;


/**
 * 파일 이름 : R01_ConditionSwitch.java <br/>
 * 내       용 : switch 구문 구현 <br/>
 * 작 성 일   : 2024-03-18
 */
import java.util.Scanner;

/**
 * 클래스 도움말 입니다.
 * @author acorn
 *
 */
public class R01_ConditionSwitch {
	/**
	 * Main 메서드
	 *
	 * @param args
	 */
	public static void main(String[] args) {

		int score = 0; // 점수
		char grade = ' ';// 학점

		System.out.print("성적을 입력 하세요>");
		Scanner scanner = new Scanner(System.in);

		score = scanner.nextInt();
		// int/int -> int
		System.out.printf("socre/10=%d%n", (score / 10));

		switch (score / 10) {
		case 10://break생략: break문을 만날때 까지 수행 된다.
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
		}

		System.out.printf("학점은 %c점 입니다.%n",grade);
		System.out.println("프로그램 종료!");
	}

}
//성적을 입력 하세요>86
//socre/10=8
//학점은 B점 입니다.
//프로그램 종료!
