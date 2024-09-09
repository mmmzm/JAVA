package com.pcwk.ehr.ed07;

public class Main {

	public static void main(String[] args) {
		Box<String> box=new Box<String>();
		
		
		box.setItem("Hello");
		
		//box.setItem(new Object());//String type만 지정 가능
		
		//casting생략
		String item = box.getItem();

	}

}
