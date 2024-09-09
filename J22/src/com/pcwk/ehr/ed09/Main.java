package com.pcwk.ehr.ed09;

public class Main {

	
	public static void main(String[] args) {
		
		Box<Fruit> furitBox=new Box<Fruit>();
		
		//상속관계 있는 것들은 모두 담을 수 있다.
		furitBox.add(new Fruit());
		furitBox.add(new Apple());
		furitBox.add(new Grape());
		
		//
		//furitBox.add(new Toy());
		
		
		System.out.println("furitBox:"+furitBox);
		
		
		Box<Apple> appleBox=new Box<Apple>();
		
		//자매관계:X
		appleBox.add(new Apple());
		appleBox.add(new Apple());
		//appleBox.add(new Grape());
		System.out.println("appleBox:"+appleBox);
		
		
		Box<Toy> toyBox=new Box<Toy>();
		toyBox.add(new Toy());
		//toyBox.add(new Apple());
		System.out.println("toyBox:"+toyBox);
	}
}
