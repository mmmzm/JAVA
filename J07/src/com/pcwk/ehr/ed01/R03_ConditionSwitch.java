package com.pcwk.ehr.ed01;

import java.util.Scanner;

public class R03_ConditionSwitch {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("가위(1),바위(2),보(3) 중 하나를 입력 하세요>");
		int user = scanner.nextInt();
		System.out.printf("user:%d%n",user);
		
		int com=(int)(Math.random()*3)+1;
		//0.0<=Math.random()<1.0
		//0.0<=Math.random()*3<3.0        -> 양변에 3을 곱한다.
		//0<=(int)(Math.random()*3)<3     -> (int) 캐스팅
		//1<=(int)(Math.random()*3)+1<3+1 -> 양변에 1을 더한다.
		System.out.printf("com:%d%n",com);
		
		String message = "";//승,패, 무승부
		
		switch(user-com) {
		case 1:		case -2:
			message = "user 승";
			break;
		case -1:    case 2:
			message = "computer 승";
			break;
		case 0 :
			message = "무승부";
			break;
		}
		
		System.out.printf("%s%n",message);
		
		scanner.close();
		
	}

}
//가위(1),바위(2),보(3) 중 하나를 입력 하세요>3
//user:3
//com:2
//user 승
