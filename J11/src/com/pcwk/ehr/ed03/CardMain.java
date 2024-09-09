package com.pcwk.ehr.ed03;

public class CardMain {

	public static void main(String[] args) {
		
		//클래스 변수: 클래스.변수명 ex)Card.width, Card.height
		
		System.out.println("Card.width:"+Card.width);  //Card.width:100
		System.out.println("Card.height:"+Card.height);//Card.height:250
		
		
		//인스턴스 변수: 인스턴스 생성후 사용
		Card c01=new Card();
		c01.kind = "Heart";
		c01.number = 1;
		
		
		Card c02=new Card();
		c02.kind = "Spade";
		c02.number = 3;
		
		
		//인스턴스 변수:공유 않됨, 클래스변수 : 공유
		System.out.printf("c01 c01.kind=%s, c01.number=%d, Card.width=%d, Card.height=%d   %n",c01.kind,c01.number
				                                                              ,c01.width, c01.height);
		
		System.out.printf("c02 c02.kind=%s, c02.number=%d, Card.width=%d, Card.height=%d   %n",c02.kind,c02.number
				                                                              ,c02.width, c02.height);
		//c02.width=200, c02.height변경=500
		c02.width = 200;
		c02.height= 500;
		System.out.println("c02.width=200, c02.height변경=500----");
		System.out.printf("c02 c02.kind=%s, c02.number=%d, Card.width=%d, Card.height=%d   %n",c02.kind,c02.number
                ,c02.width, c02.height);		
		System.out.printf("c01 c01.kind=%s, c01.number=%d, Card.width=%d, Card.height=%d   %n",c01.kind,c01.number
                ,c01.width, c01.height);
	}

}
//Card.width:100
//Card.height:250
//c01 c01.kind=Heart, c01.number=1, Card.width=100, Card.height=250   
//c02 c02.kind=Spade, c02.number=3, Card.width=100, Card.height=250   
//c02.width=200, c02.height변경=500----
//c02 c02.kind=Spade, c02.number=3, Card.width=200, Card.height=500   
//c01 c01.kind=Heart, c01.number=1, Card.width=200, Card.height=500   

