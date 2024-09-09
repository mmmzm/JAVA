package com.pcwk.ehr.ed01;
import java.util.Scanner;
public class R01_ConditionSwitch {

	public static void main(String[] args) {
//		- 월을 입력 받아 분기를 출력
//		1,2,3 - 1/4분기
//		4,5,6 - 2/4분기
//		7,8,9 - 3/4분기
//		10,11,12 - 4/4분기
		
		//ctrl+shift+f : 소스 정렬
		//ctrl+shift+o : import정리
		Scanner scanner=new Scanner(System.in);
		System.out.print("월을 입력 하세요(1부터 12까지)>");
		int month = scanner.nextInt();
		
		System.out.printf("month:%d%n",month);
		
		String quarter = "";//분기(1분기,2분기,..)
		
		switch(month) {
		case 1:case 2:case 3:
			quarter = "1분기";
			break;
			
		case 4:
		case 5:
		case 6:
			quarter = "2분기";
			break;	
			
		case 7:
		case 8:
		case 9:
			quarter = "3분기";
			break;		
			
		case 10:
		case 11:
		case 12:
			quarter = "4분기";
			break;		
			
		default:
			quarter = "유효하지 않은 월 입니다.";
			break;
			
		}
		
		System.out.printf("%d 월은 %s 입니다.",month,quarter);
		
		scanner.close();
		
	}

}
