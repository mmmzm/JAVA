package com.pcwk.ehr.ed03;

public class R03_Main {

	public static void main(String[] args) {
		
		//데몬 쓰레드 생성
		Thread daemonThread =new Thread(new DaemonRunnable());
		daemonThread.setDaemon(true);//데몬 쓰레드로 설정
		daemonThread.start();
		
		
		//메인 쓰레드에서 메시지 출력
		for(int i=0;i<10;i++) {
			System.out.println("Main thread: "+i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		

    }
}
//Main thread: 0
//Daemon Thread: Hello
//Main thread: 1
//Main thread: 2
//Daemon Thread: Hello
//Main thread: 3
//Main thread: 4
//Main thread: 5
//Daemon Thread: Hello
//Main thread: 6
//Main thread: 7
//Main thread: 8
//Daemon Thread: Hello
//Main thread: 9