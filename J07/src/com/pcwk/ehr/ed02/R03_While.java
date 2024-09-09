package com.pcwk.ehr.ed02;

public class R03_While {

	public static void main(String[] args) {
		// 1~10까지의 합!
		
		int i =1;
		int totalSum = 0;
		
		while(i<=10) {
			totalSum = totalSum +i;//totalSum +=i;
			
			i++;
			//System.out.printf("totalSum=%d%n",totalSum);
		}
		
		System.out.printf("총합은 : %d%n",totalSum);

	}

}
//총합은 : 55