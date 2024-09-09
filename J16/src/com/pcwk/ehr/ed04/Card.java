package com.pcwk.ehr.ed04;

public class Card {
	String kind; //무늬
	int number;
	
	
	public Card() {
		this("space",1);//인자 2개 생성자 호출
	}
	
	public Card(String kind, int number) {
		super();
		this.kind = kind;
		this.number = number;
	}  //숫자

	@Override
	public String toString() {
		return "Card [kind=" + kind + ", number=" + number + "]";
	}
	
	
	
}
