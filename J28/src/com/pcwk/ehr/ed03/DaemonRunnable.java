package com.pcwk.ehr.ed03;

public class DaemonRunnable implements Runnable {

	@Override
	public void run() {
		
		//데몬 쓰레드에서 주기적으로 메시지 출력
		while(true) {
			System.out.println("Daemon Thread: Hello");
			
			try {
				Thread.sleep(3*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
