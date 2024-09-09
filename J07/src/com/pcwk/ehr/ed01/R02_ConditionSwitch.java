package com.pcwk.ehr.ed01;
import java.util.Scanner;
public class R02_ConditionSwitch {

	public static void main(String[] args) {
		//case의 값: 정수,문자,문자열,상수
		String quarter = "";//분기(1분기,2분기,..)
		final int TWO = 2;
		int month = 3;
		switch(month) {

		//case 7.0://실수 사용 불가	
		//case quarter://변수 사용 불가	
		case TWO://상수는 가능
		case '1':
		//case "봄입니다.":
		case 6:
			quarter = "2분기";
			break;	
			
			
		}
		
	}

}
