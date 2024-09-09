package com.pcwk.ehr.ed01;
//compiler가 java.lang.*를 import하고 있음.

public class R04_Throw {

	public static void main(String[] args) {
		int age = -1;

		try {
			if (age < 0) {
				IllegalArgumentException e=new IllegalArgumentException("나이는 음수 일수 없습니다.");
				throw e;
				//throw new IllegalArgumentException("나이는 음수 일수 없습니다.");
			}

		} catch (IllegalArgumentException e) {
			System.out.println("예외 발생:"+e.getMessage());
		}

		System.out.println("나이는 " + age + "입니다.");
	}

}
//예외 발생:나이는 음수 일수 없습니다.
//나이는 -1입니다.