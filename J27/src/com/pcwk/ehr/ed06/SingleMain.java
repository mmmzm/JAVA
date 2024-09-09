package com.pcwk.ehr.ed06;

import javax.swing.JOptionPane;

public class SingleMain {

	public static void main(String[] args) {
		String input=JOptionPane.showInputDialog("저녁 메뉴 ");
		System.out.println("입력 값:"+input);

		for(int i=10;i>0;i--) {
			System.out.printf("%d%n",i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}//1초 동안 대기
			
		}			
	}

}
