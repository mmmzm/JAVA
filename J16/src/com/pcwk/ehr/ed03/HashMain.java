package com.pcwk.ehr.ed03;

public class HashMain {

	public static void main(String[] args) {
		String str01= new String("abc");
		String str02= new String("abc");
		
		System.out.println(str01.equals(str02));
		
		System.out.println(str01.hashCode());//96354
		System.out.println(str02.hashCode());//96354

	}

}
//true
//96354
//96354