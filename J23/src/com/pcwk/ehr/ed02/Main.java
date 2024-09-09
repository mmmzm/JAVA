package com.pcwk.ehr.ed02;

public class Main {

	public static void main(String[] args) {
		FruitBox<Fruit>  fruitBox=new FruitBox<Fruit>();
		FruitBox<Apple>  appleBox=new FruitBox<Apple>();
		
		
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		
		appleBox.add(new Apple());
		appleBox.add(new Apple());
		//appleBox.add(new Grape());
		
		System.out.println(Juicer.makeJuice(fruitBox));
		System.out.println(Juicer.makeJuice(appleBox));
	}

}
