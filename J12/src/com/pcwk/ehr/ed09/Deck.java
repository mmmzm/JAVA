package com.pcwk.ehr.ed09;

public class Deck {
	final int CARD_NUM = 52;//카드 개수
	
	Card[] cardArray=new Card[CARD_NUM];

	public Deck() {
		
		//KIND:4, NUMBER: 13
		int i = 0;
		
		//무늬
		for(int k=Card.KIND_MAX;k>0;k--) {
			
			//숫자
			for(int n=0;n<Card.NUM_MAX;n++) {
				cardArray[i++] = new Card(k, n+1);
			}
			
			
		}
	}
	
	void shuffle() {
		for(int i=0;i<cardArray.length;i++) {
			int r = (int)(Math.random() * CARD_NUM);
			
			Card tmp = cardArray[i];
			cardArray[i] = cardArray[r];
			cardArray[r] = tmp;
			
		}
	}
	
	
	//index에 해당하는 card pick
	Card pick(int index) {
		return  cardArray[index];
	}
	
	//난수로 카드 선택
	Card pick() {
		//52
		int index = (int)(Math.random() * CARD_NUM);
		return pick(index);
	}
	
	
	
	
}
