package com.pcwk.ehr.ed09;

public class Child extends Parent implements PCWKInter {

	@Override
	public void regularAbstractMethod() {
		System.out.println("Child regularAbstractMethod()");
	}

	//default메서드 Override도 가능
	@Override
	public void pcwkDefaultMethod() {
		// TODO Auto-generated method stub
		PCWKInter.super.pcwkDefaultMethod();
		System.out.println("Child pcwkDefaultMethod");
	}
	
	
}
