package com.pcwk.ehr.ed01;

public class Main {

	public static void main(String[] args) {
		
		FruitBox<Fruit>  fruitBox=new FruitBox<Fruit>();
		
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		fruitBox.add(new Fruit());
		
		fruitBox.add(new Strawberry());
		//fruitBox.add(new Toy()); Fruit과 Fruit의 자손들 담을수 있다.
		
		System.out.println("fruitBox:"+fruitBox.toString());
		System.out.println("==============================");
		
		FruitBox<Grape>  grapeBox=new FruitBox<Grape>();
		grapeBox.add(new Grape());
		//grapeBox.add(new Fruit());
		
		
		System.out.println("grapeBox:"+grapeBox.toString());
		System.out.println("==============================");
		
		//Bound mismatch
		//FruitBox<Toy>  toyBox=new FruitBox<Toy>();
	}

}
