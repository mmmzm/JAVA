package com.pcwk.ehr.ed07;

public class WeakCoupling {

	public static void main(String[] args) {
		A a = new A();
		I i = new B();
		
		a.methodA(i);

	}

}
