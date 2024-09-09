package com.pcwk.ehr.ed04;

public class Main {

	public static void main(String[] args) {
		// 지네릭 타입과 넌 지네릭 타입간의 형변환은 가능.
		
		Box  box = null;
		Box<Object> objBox = null;
		
		
		box    = (Box)objBox;      //OK : 지네릭 타입 -> 원시타입(경고 발생)
		objBox = (Box<Object>)box; //OK : 원시타입 -> 지네릭 타입 (경고 발생)
		System.out.println("---------------------------------------");
		
		//대입된 타입이 다른 지네릭 타입 간에는 형변환 불가능.
		Box<Object> objectBox = null;
		Box<String> stringBox = null;
		
		//objectBox = (Box<Object>)stringBox;//에러 
		//stringBox = (Box<String>)objectBox;//에러
		
		//FruitBox<Apple> box01 = new FruitBox<Fruit>();
		
		//메서드의 매개변수 다형성이 적용된것 처러 적용 가능
		
		FruitBox<? extends Fruit> box01 = new FruitBox<Apple>();
		FruitBox<? extends Fruit> box02 = new FruitBox<Fruit>();
		FruitBox<? extends Fruit> box03 = new FruitBox<Grape>();
		
	}

}
