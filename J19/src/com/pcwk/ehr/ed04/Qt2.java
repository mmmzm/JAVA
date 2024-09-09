package com.pcwk.ehr.ed04;

import java.util.Arrays;
import java.util.Random;

public class Qt2 {
	public static void main(String[] args) {
		// 방정식 2x+4y=10의 모든 해를 구하시오. 단, x와 y는 정수이고 각각의 범위는 0<=x<=10, 0<=y<=10 이다.
		int MaxNum = 10;
		int x = 0;
		
		for (int i = 0; i < MaxNum; i++) {
			int y = 0;
			for (int j = 0; j < MaxNum; j++) {				
				if((2*x) + (4*y) == 10) {
					System.out.println("x = " + x + ", " + "y = " + y);
					System.out.println((2*x) + " + " + (4*y) + " = " + "10");
					System.out.println("──────────");
				} // if
				y ++;
			} // innerFor
			x ++;
		} // outFor
		System.out.println("모든 해를 구하였습니다");
	} // main
} // class
