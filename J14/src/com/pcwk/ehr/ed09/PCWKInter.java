package com.pcwk.ehr.ed09;

public interface PCWKInter {
	//추상 메서드
	//void regularAbstractMethod99();
	
	
	//추상 메서드
	void regularAbstractMethod();
	
	//default메서드
	default void pcwkDefaultMethod() {
		System.out.println("PCWKInter default메서드");
	}
	
	static void staticMethod() {
		System.out.println("PCWKInter staticMethod");
	}
	
}
