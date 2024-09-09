package com.pcwk.ehr.ed04;

public class ThreadInteruped extends Thread {

	@Override
	public void run() {
		int i =10;
		
		while(i !=0 && !isInterrupted()) {
			System.out.println(i--);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("InterruptedException:"+e.getMessage());
			}
		}
		
		
		System.out.println("카운트 다운 종료");
		
	}

	
	
}
