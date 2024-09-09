package com.pcwk.ehr.ed07;

public class MyRunnable implements Runnable {
	Account  account=new Account();
	
	
	@Override
	public void run() {
		
		while(account.getBalance() > 0) {
			//100,200,300
			int money=(int)(Math.random()*3+1)*100;
			
			
			account.withdraw(money);
			System.out.println("balance:"+account.getBalance());
		}
		

	}

}
