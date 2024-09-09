package com.pcwk.ehr.q;

import com.pcwk.ehr.cmn.PLog;

public class Q1 implements PLog {
	public static double round(double d, int n) {
		double num=Math.pow(10, n);
		//System.out.println(num);
		double result =Math.round(d * (int)num)/num;
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(round(3.1415,1));
		System.out.println(round(3.1415,2));
		System.out.println(round(3.1415,3));
		System.out.println(round(3.1415,4));
		System.out.println(round(3.1415,5));
		
	}

}
