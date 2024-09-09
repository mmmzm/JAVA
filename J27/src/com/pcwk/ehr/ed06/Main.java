package com.pcwk.ehr.ed06;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		MultiThread  mTh=new MultiThread();
		mTh.start();
		
		
		String input=JOptionPane.showInputDialog("저녁 메뉴 ");
		System.out.println("입력 값:"+input);

	}

}
