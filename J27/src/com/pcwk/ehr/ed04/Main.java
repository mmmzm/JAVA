package com.pcwk.ehr.ed04;

public class Main {

	public static void main(String[] args) {
		
		//Runnable 인터페이스
		Runnable runnable=new MyThread();
		Thread tread=new Thread(runnable);
		
		//Thread class
		MyClass myClass=new MyClass();
		
		tread.start();
		myClass.start();
	}

}
//1. MyThread.class
//2. MyThread.class
//3. MyThread.class
//4. MyThread.class
//5. MyThread.class
//1.Thread-1
//2.Thread-1
//3.Thread-1
//4.Thread-1
//5.Thread-1
