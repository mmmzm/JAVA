package com.pcwk.ehr.q;

import com.pcwk.ehr.cmn.PLog;

public class Q3 implements PLog {
	public static void main(String[] args) {
		int sum =0;
		int count =0;
		
		for(int i=1,j=1;true;i++,j*=-1) {
			int k = i * j;
			System.out.printf("k=%4d, j=%d%n", k,j);
			sum +=k;
			count++;
			
			if(sum>=101) {
				System.out.println("-----------------------");
				System.out.printf("i=%d \t sum=%d%n", count,sum);
				break;
			}
		}
	}

}
