package com.pcwk.ehr.ed07;

public class Account {

	private int balance = 1_000;//잔고

	public int getBalance() {
		return balance;
	}
	
	
	public  void withdraw(int money) {
		synchronized (this) {
			if(balance >=money ) {//잔고가 출금 금액보다 커야 출금 가능
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				balance -=money;
			}
		}

	}
	
//	public synchronized void withdraw(int money) {
//		if(balance >=money ) {//잔고가 출금 금액보다 커야 출금 가능
//			try {
//				Thread.sleep(1500);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			
//			balance -=money;
//		}
//	}
	
}
