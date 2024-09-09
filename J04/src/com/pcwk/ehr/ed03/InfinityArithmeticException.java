package com.pcwk.ehr.ed03;

public class InfinityArithmeticException {

	public static void main(String[] args) {

		//int/double
		System.out.println(13/0.0);//Infinity
		System.out.println(-13/0.0);//-Infinity

		//java.lang.ArithmeticException: / by zero
		System.out.println(13/0);//int/0
				
	}

}
//Infinity
//-Infinity
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at com.pcwk.ehr.ed03.InfinityArithmeticException.main(InfinityArithmeticException.java:12)
