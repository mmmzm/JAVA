package com.pcwk.ehr.ed04;

public class MyClass extends Thread {

	@Override
	public void run() {
		
		for(int i=1;i<=5;i++) {
			System.out.println(i+"."+this.getName());
		}
		
		
	}
	
}
