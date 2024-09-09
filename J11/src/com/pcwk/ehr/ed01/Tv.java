package com.pcwk.ehr.ed01;

public class Tv {

	//속성: 멤버변수
	boolean power;//전원상태(on/off)
	String  color;//색상
	int     channel;//채널
	
	//기능: 함수
	/**
	 * Tv전원을 켜거나 끄는 기능
	 */
	void power() {
		power = !power;
	}
	
	/**
	 * Tv 채널을 증가 시키는 기능
	 */
	void channelUp() {
		channel++;
	}
	
	
	void channelDown() {
		channel--;
	}
	
	
}
