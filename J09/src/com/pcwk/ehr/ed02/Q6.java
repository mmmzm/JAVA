package com.pcwk.ehr.ed02;

import java.util.Arrays;

public class Q6 {

	public static void main(String[] args) {
		int[] list = { 7, 4, 5, 1, 3 };
		
		System.out.println("Sort전 : " + Arrays.toString(list));
		Arrays.sort(list);
		System.out.println("Sort후 : " + Arrays.toString(list));
		
	}

}
//Sort전 : [7, 4, 5, 1, 3]
//Sort후 : [1, 3, 4, 5, 7]