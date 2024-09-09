package com.pcwk.ehr.ed05;

import javax.swing.JOptionPane;

public class R05_Main {

	public static void main(String[] args) {
		
		ThreadInteruped  th1=new ThreadInteruped();
		th1.start();
		
		String input = JOptionPane.showInputDialog("오늘은 즐거운 목요일!");
		
		System.out.println("당신이 입력한 값은 "+input+" 입니다.");
		
		//예외 발생시키거나 중단할 수 있다.
		th1.interrupt();//isInterrupted가 true로 변경
		System.out.println(th1.isInterrupted());
		

	}

}
//10
//9
//8
//7
//6
//당신이 입력한 값은 11 입니다.
//true
//카운트 다운 종료