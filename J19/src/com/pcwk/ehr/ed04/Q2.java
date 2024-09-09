package com.pcwk.ehr.ed04;

import java.util.Arrays;

public class Q2 {
	public static void main(String[] args) {
		int [] arr = new int[6];
		int num2=0;
		for(int i =0; i<arr.length;i++) {
			arr[i]=(int)(Math.random()*50)+1;
			for(int j=0; j<i;j++) {
				if(arr[j]==arr[i]) {
					i--;
				}
			}
		}
		for(int i =0; i<arr.length-1;i++) {
			for(int j =0; j<arr.length-i-1;j++) {
				if(arr[j]<arr[j+1]) {
					int tem=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tem;
					
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
