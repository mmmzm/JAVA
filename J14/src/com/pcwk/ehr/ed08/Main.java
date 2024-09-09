package com.pcwk.ehr.ed08;

public class Main {

	public static void main(String[] args) {
		Food food01=new Chicken();
		
		Food food02=new Pizza();
		
		Person person01=new Person(food01);
		person01.startEat();//치킨을 먹습니다.
		
		Person person02=new Person(food02);		
		person02.startEat();//피자를 먹습니다.
	}

}
