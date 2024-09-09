package com.pcwk.ehr.ed04;

public class Qt4 {
	public static void main(String[] args) {
		 
		int sum = 0;
		              
		for (int i = 1, j=1;i<=10000; i++,j*=-1) {
			int n = i*j;
			System.out.printf("%4d ,%d%n  ", n, j);
			sum = sum + n;
			if (sum > 100) {                 //sum>=100 경우 100까지                    
				System.out.printf("i=%3d , sum=%d%n  ", i, sum);
				break;
				
			}

		}
		 //System.out.println(sum);
	}

}
