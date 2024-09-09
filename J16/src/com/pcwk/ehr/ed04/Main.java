package com.pcwk.ehr.ed04;

public class Main {

	public static void main(String[] args) {
		Card card01=new Card();
		Card card02=new Card();
		

		//com.pcwk.ehr.ed04.Card@15db9742
		//패키지.클래스@주소
		//getClass().getName() + "@" + Integer.toHexString(hashCode());
		System.out.println(card01.toString());
		System.out.println(card01);//toString생략해도 동일
		
		System.out.println(card02.toString());
		
	}

}
//Card [kind=space, number=1]
//Card [kind=space, number=1]
//Card [kind=space, number=1]

