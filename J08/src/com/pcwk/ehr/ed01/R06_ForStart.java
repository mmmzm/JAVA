package com.pcwk.ehr.ed01;
import java.util.Scanner;

public class R06_ForStart {

	public static void main(String[] args) {
		// 삼각형 모양의 별을 출력.
		
		int startNum = 0;
		Scanner scanner=new Scanner(System.in);
		System.out.print("*을 출력할 라인수를 입력 하세요.>");
		startNum = scanner.nextInt();
		
		
		
		for(int i=1;i<=startNum;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
//*을 출력할 라인수를 입력 하세요.>7
//*
//**
//***
//****
//*****
//******
//*******