package com.pcwk.ehr.ed04;

public class Q1 {
	public static void main(String[] args) {
		// 1. 방정식 2x+4y=10의 모든 해를 구하시오. 단, x와 y는 정수이고 각각의 범위는 0<=x<=10, 0<=y<=10 이다.
		for (int i = 0; i <= 10; i++) {

			for (int j = 0; j <= 10; j++) {
				int result = 2 * i + 4 * j;
				if (result == 10) {
					System.out.println("(" + i + ", " + j + ")");

				}

			}
		}
	}
}
