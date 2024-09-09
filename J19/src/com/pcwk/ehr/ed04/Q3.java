package com.pcwk.ehr.ed04;

public class Q3 {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		int sum = 0;
		for(int i =1; i<11;i++) {
			num1+=i;
			for(int j=1; j<i; j++) {
				num2+=j;
			}
			
		}
		sum=num1+num2;
		System.out.println(sum);

	}

}
