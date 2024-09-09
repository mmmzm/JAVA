package com.pcwk.ehr.ed04;

public class MyMathMain {

	public static void main(String[] args) {
		MyMath mm=new MyMath();
		
		long result01 = mm.add(13L, 15L);
		long result02 = mm.substract(13L, 15L);
		long result03 = mm.multiply(13L, 10L);
		double result04 = mm.divide(13L, 10L);
		
		System.out.printf("mm.add(13L, 15L):%d%n",      result01);
		System.out.printf("mm.substract(13L, 15L):%d%n",result02);
		System.out.printf("mm.multiply(13L, 10L):%d%n" ,result03);
		System.out.printf("mm.divide(13L, 10L):%5.2f%n" ,result04);

	}

}
//mm.add(13L, 15L):28
//mm.substract(13L, 15L):-2
//mm.multiply(13L, 10L):130
//mm.divide(13L, 10L): 1.30