package com.pcwk.ehr.ed04;

import java.util.StringTokenizer;

public class Qt5 {
	public static void main(String[] args) {

		int sum =0;
		
		for(int i=1,j=1;;i++,j*=-1) {
			
			int k = i*j;
			//System.out.printf("k=%4d,j=%d%n",k,j);
		
			sum +=k;
			if(sum>=100) {
			System.out.printf("i=%d\t sum=%d%n",i,sum);
			break;
		
			}
		
		}
			
	}
	
}
