package com.pcwk.ehr.ed05;

public class ThreadInteruped extends Thread {

	@Override
	public void run() {
		int i =10;
		
		while(i !=0 && !isInterrupted()) {
			System.out.println(i--);
			
			//시간지연
			for(long x=0;x<2_500_000_000L;x++);
		}
		
		
		System.out.println("카운트 다운 종료");
		
	}

	
	
}
