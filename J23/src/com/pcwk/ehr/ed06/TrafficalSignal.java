package com.pcwk.ehr.ed06;

public enum TrafficalSignal {
	RED("Stop"),GREEN("Go"),YELLOW("Slow down");
	
	private String action;
	
	TrafficalSignal(String action){
		this.action = action;
	}

	public String getAction() {
		return action;
	}
	
	
	
}
