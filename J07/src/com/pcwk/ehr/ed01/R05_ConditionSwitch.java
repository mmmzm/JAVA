package com.pcwk.ehr.ed01;
import java.util.Scanner;

public class R05_ConditionSwitch {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("주민번호를 입력 하세요.(011231-1111222)>");
		String regNo = scanner.nextLine();
		
		System.out.printf("regNo:%s \t, 문자열 길이:%d %n",regNo,regNo.length());
		
		char gender = regNo.charAt(7);
		System.out.printf("gender:%c%n",gender);
		
		switch (gender) {
		case '1':
		case '3':
			System.out.println("남자 입니다.");
			break;
			
		case '2': case '4':
			System.out.println("여자 입니다.");
			break;

		default:
			System.out.println("유효하지 않은 주민 번호 입니다.");
			break;
		}
		
		
		scanner.close();
	}

}
//주민번호를 입력 하세요.(011231-1111222)>011231-1111222
//regNo:011231-1111222 	, 문자열 길이:14 
//gender:1
//남자 입니다.