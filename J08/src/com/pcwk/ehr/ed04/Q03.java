package com.pcwk.ehr.ed04;

public class Q03 {

	public static void main(String[] args) {
		//for문을 while문으로
		for(int i=0;i<=10;i++) {
			
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("──────────────────────────────────────────────────");
		
		int i =0;
		while(i<=10) {
			
			int j=0;
			while(j<=i) {
				System.out.print("* ");
				
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
//* 
//* * 
//* * * 
//* * * * 
//* * * * * 
//* * * * * * 
//* * * * * * * 
//* * * * * * * * 
//* * * * * * * * * 
//* * * * * * * * * * 
//* * * * * * * * * * * 