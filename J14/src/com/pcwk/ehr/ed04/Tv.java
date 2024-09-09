package com.pcwk.ehr.ed04;

public class Tv {

	protected boolean power;//Tv 전원
	protected int channel;//채널
	protected int volumne;
	
	
	public Tv() {
		
	}
	
	public void volumeUp() {
		volumne++;
	}
	
	public void volumeDown() {
		volumne--;
	}
	
	public void power() {
		power = !power;
	}
	
	public void channelUp() {
		channel++;
	}
	
	
	public void channelDown() {
		channel--;
	}
	
}
