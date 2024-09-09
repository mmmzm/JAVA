package com.pcwk.ehr.q;

public class Q01_Main {

	public static void main(String[] args) {
		SutdaCard  c1=new SutdaCard(3,true);
		SutdaCard  c2=new SutdaCard(3,true);
		
		
		System.out.println("c1:"+c1);
		System.out.println("c2:"+c2);
		System.out.println("c1.equals(c2):"+c1.equals(c2));

	}

}
//c1:3K
//c2:3K
//c1.equals(c2):true