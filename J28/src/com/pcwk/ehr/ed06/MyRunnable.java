package com.pcwk.ehr.ed06;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		
		while(true) {
			System.out.println(Thread.currentThread().getName());
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}

	}

}
