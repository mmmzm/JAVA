package com.pcwk.ehr.ed07;

public class R07_Main {

	public static void main(String[] args) {
		Runnable r=new MyRunnable();
		
		new Thread(r).start();
		new Thread(r).start();
	}

}
//balance:900
//balance:900
//balance:300
//balance:300
//balance:0
//balance:-200