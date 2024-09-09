package com.pcwk.ehr.ed08;

public class Main {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		//ctrl+shift+y : 대문자 to 소문자
		//ctrl+shift+ㅌ : 소문자 to 대문자
		Card card=new Card("heart",3);
		Card card02 = Card.class.newInstance();
		
		Class cardClass = card.getClass();
		
		
		System.out.println(card);
		System.out.println(card02);
		System.out.println("============================");
		System.out.println(cardClass.getName());
		System.out.println(cardClass.toString());

	}

}
//Card [kind=heart, number=3]
//Card [kind=space, number=1]
//============================
//com.pcwk.ehr.ed08.Card
//class com.pcwk.ehr.ed08.Card