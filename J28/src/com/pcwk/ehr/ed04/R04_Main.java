package com.pcwk.ehr.ed04;

import javax.swing.JOptionPane;

public class R04_Main {

	public static void main(String[] args) {
		
		ThreadInteruped  th1=new ThreadInteruped();
		th1.start();
		
		String input = JOptionPane.showInputDialog("오늘은 즐거운 목요일!");
		
		System.out.println("당신이 입력한 값은 "+input+" 입니다.");
		
		//예외 발생시키거나 중단할 수 있다.
		
		//Thread.sleep(1000)에서 InterruptedException이
		//발생했기 때문이다. 
		//interrupt상태는 false로 자동 초기화 된다.
		
		th1.interrupt();
		System.out.println(th1.isInterrupted());
		

	}

}
//10
//9
//8
//7
//6
//당신이 입력한 값은 9 입니다.
//true
//5
//4
//3
//2
//1
//카운트 다운 종료