package com.pcwk.ehr.ed08;

public class Person {

	Food  food;
	public Person(Food food) {
		this.food = food;
	}
	
	public void startEat() {
		food.eat();
	}
	
}
