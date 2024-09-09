package com.pcwk.ehr.ed01;
import java.util.Scanner;

public class R06_NestedSwitch {

	public static void main(String[] args) {
//		- 요일을 입력(월요일~일요일),
//		월요일 입력(운동,공부,놀기)
//		화요일 입력(운동,공부,놀기)
		Scanner scanner=new Scanner(System.in);
		System.out.print("요일을 입력 하세요.(월요일~일요일)>");
		String dayOfWeek = scanner.nextLine();
		
		System.out.printf("입력한 요일은 : %s%n",dayOfWeek);
		
		String activity = "";//운동,공부,놀기
		
		switch(dayOfWeek) {
		case "월요일":
			System.out.printf("%s의 활동을 입력 하세요.(운동,공부,놀기)>",dayOfWeek);
			String mondayActivity = scanner.nextLine();
			
			switch(mondayActivity) {
			case "운동":
				activity = "운동하기";
				break;
			case "공부":
				activity = "공부하기";
				break;	
			case "놀기":
				activity = "놀기";
				break;		
			default:
				activity = "활동을 잘못 입력 했습니다.";
				break;
			}
			
			break;
			
		case "화요일":
			break;
			
		case "수요일":
			break;
			
		case "목요일":
			break;
			
		case "금요일":
			break;
			
		case "토요일":
			break;
		case "일요일":
			break;
			
		default:
			activity = "잘못 입력 했습니다.";
			break;
		}
		
		System.out.printf("당신이 입력한 활동은 \"%s\" 입니다.%n",activity);

		scanner.close();
	}

}
//요일을 입력 하세요.(월요일~일요일)>월요일
//입력한 요일은 : 월요일
//월요일의 활동을 입력 하세요.(운동,공부,놀기)>운동
//당신이 입력한 활동은 "운동하기" 입니다.
