package com.pcwk.ehr.ed09;

public class Main {

	public static void main(String[] args) {
		Child child=new Child();
		
		child.disp();
		child.regularAbstractMethod();
		
		//default 메서드 접근
		child.pcwkDefaultMethod();
		
		//static 메서드 접근
		PCWKInter.staticMethod();
	}

}
//Parent disp()...
//Child regularAbstractMethod()
//PCWKInter default메서드
//Child pcwkDefaultMethod
//PCWKInter staticMethod