package com.pcwk.ehr.ed06;

public class R06_Main {

	public static void main(String[] args) {

		Thread th01=new Thread(new MyRunnable(),"*");
		Thread th02=new Thread(new MyRunnable(),"**");
		Thread th03=new Thread(new MyRunnable(),"***");
		
		th01.start();
		th02.start();
		th03.start();
		//th01.suspend() 쓰레드를 잠시 멈추게 한다.
		//suspend()에 의해 정지된 쓰레드는 resume()를 호출해야 다시 실행대기 상태가 됩니다.
		
		try {
			
			Thread.sleep(2000);
			th01.suspend();//th01을 잠시 멈추게 한다.
			
			Thread.sleep(2000);
			th02.suspend();//th02을 잠시 멈추게 한다.
			
			Thread.sleep(3000);
			th01.resume();//th01 resume()를 호출해야 다시 실행대기 상태
			
			Thread.sleep(3000);
			th01.stop();//th01 강제종료
			th02.stop();//th02 강제종료
			
			System.out.println("th01.stop()");
			System.out.println("th02.stop()");
			
			Thread.sleep(3000);
			th03.stop();//th03 강제종료
			System.out.println("th03.stop()");
		}catch(InterruptedException e) {
			
		}
		
		System.out.println("프로그램 종료");

	}

}
//***
//**
//*
//**
//*
//***
//***
//**
//***
//**
//***
//***
//***
//*
//***
//*
//***
//*
//***
//th01.stop()
//th02.stop()
//***
//***
//***
//th03.stop()
//프로그램 종료
