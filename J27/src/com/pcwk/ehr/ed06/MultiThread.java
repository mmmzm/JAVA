package com.pcwk.ehr.ed06;

public class MultiThread extends Thread {


	@Override
	public void run() {
		for(int i=10;i>0;i--) {
			System.out.printf("%d%n",i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}//1초 동안 대기
			
		}		
	}
	

}
