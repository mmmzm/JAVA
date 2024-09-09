package com.pcwk.ehr.ed02;

public class R02_Main {

	public static void main(String[] args) {
		//쓰레드 그룹 생성
		ThreadGroup group=new ThreadGroup("MyThreadGroup");
		
		//첫 번째 쓰레드 생성 및 그룹에 추가
		Thread thread1=new Thread(group, new MyRunnable(), "Thread 1");
		
		thread1.start();
		
		//두 번째 쓰레드 생성 및 그룹에 추가
		Thread thread2=new Thread(group, new MyRunnable(), "Thread 2");
		thread2.start();
		
		
		//쓰레드 그룹에 속한 모든 쓰레드의 정보 출력
		group.list();

	}

}
//java.lang.ThreadGroup[name=MyThreadGroup,maxpri=10]
//	    Thread[Thread 1,5,MyThreadGroup]
//	    Thread[Thread 2,5,MyThreadGroup]
//	Thread 2 is running.
//	Thread 1 is running.