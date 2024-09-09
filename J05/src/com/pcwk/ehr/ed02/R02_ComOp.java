package com.pcwk.ehr.ed02;

public class R02_ComOp {

	public static void main(String[] args) {
		int x = 5;
		int y = 2;
		
		System.out.println("x="+x);
		
		//x +=3;
		x = x + 3;
		System.out.println("x="+x);
		
		x = 5;
		x *=3;
		System.out.println("x="+x);
		
		x = 5;
		
		x *= 10 + y;//x * (10+y)
		System.out.println("x="+x);
	}

}
//x=5
//x=8
//x=15
//x=60
