package com.pcwk.ehr.ed01;

public class R01_UnCheckedException {

	public static void main(String[] args) {
		
		int [] numbers= {13,15,18};
		
		int index = 4;
		try {
			System.out.println("1");
			int result = numbers[index];
			System.out.println("2");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("===================");
			System.out.println("ArrayIndexOutOfBoundsException="+e.getMessage());
			System.out.println("===================");
			e.printStackTrace();
		}
		
		System.out.println("--------------------");
		System.out.println("-프로그램종료--");
		System.out.println("--------------------");

	}

}

//1
//===================
//ArrayIndexOutOfBoundsException=4
//===================
//--------------------
//-프로그램종료--
//--------------------
