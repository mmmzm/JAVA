package com.pcwk.ehr.ed02;

public class MyMath3Main {

	public static void main(String[] args) {
		MyMath3 mm=new MyMath3();
		System.out.println(mm.add(13, 15));
		System.out.println(mm.add(13L, 15));
		System.out.println(mm.add(13L, 15L));
		
		int []a = {13,15,18};
		System.out.println(mm.add(a));

	}

}
//int add(int a, int b)
//28
//long add(long a, int b) 
//28
//long add(long a, long b) 
//28
//int add(int[] a)
//46