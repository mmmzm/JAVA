package com.pcwk.ehr.ed07;

public class CaptionTv extends Tv {
	boolean caption;//캡션
	
	public CaptionTv() {
		
	}
	
	void display(String text) {
		if(caption == true) {
			System.out.println(text);
		}
	}
}
