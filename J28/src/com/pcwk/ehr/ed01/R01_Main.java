package com.pcwk.ehr.ed01;

public class R01_Main {

	public static void main(String[] args) {
		
		//첫 번째 쓰레드 생성
		Thread thread1=new Thread(new MyRunnable(), "Thread 1");
		
		//두 번째 쓰레드 생성
		Thread thread2=new Thread(new MyRunnable(), "Thread 2");
		
		
		//첫 번째 쓰레드 생성
		thread1.setPriority(Thread.MAX_PRIORITY);//가장 높은 우선 순위
		//두 번째 쓰레드 생성
		thread2.setPriority(Thread.MIN_PRIORITY);//가장 낮은 우선 순위
		
		// 쓰레드 시작
		thread1.start();
		thread2.start();
				

	}

}
