package com.pcwk.ehr.ed09;

public class Card {
	static final int KIND_MAX = 4; //무늬 4개
	static final int NUM_MAX  = 13;//무늬별 숫자 
	
	static final int SPACE   = 4;
	static final int DIAMOND = 3;
	static final int HEART   = 2;
	static final int CLOVER  = 1;
	
	
	
	int kind;//무늬
	int number;//숫자 
	
	public Card() {
		this(SPACE,1);
	}
	
	public Card(int kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	
	
	public String toString() {
		//배열 index와 무늬 상수와 일치
		String[]kinds = {"","CLOVER","HEART","DIAMOND","SPACE"};
		String numbers= "0123456789XJQK";//숫자10은 X로
		
		return "kind : "+kinds[this.kind] +", number : "+numbers.charAt(this.number);
	}
	
	
	
	
	
}
