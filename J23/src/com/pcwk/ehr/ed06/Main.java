package com.pcwk.ehr.ed06;

public class Main {

	public static void main(String[] args) {
		TrafficalSignal signal=TrafficalSignal.GREEN;
		
		System.out.println("signal:"+signal);
		System.out.println("getAction:"+signal.getAction());
	}

}
//signal:GREEN
//getAction:Go