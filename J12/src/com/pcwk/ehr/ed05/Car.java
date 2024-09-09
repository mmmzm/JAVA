package com.pcwk.ehr.ed05;

public class Car {

	String brand;// 브랜드
	String model;// 모델
	int year; // 연식

	public Car() {
		this("GENESIS","GV80",2024);

		System.out.println("Car() 생성자");
	}
	
	public Car(String brand) {
		//
		this(brand, "GV80",2024);// 첫줄
	}
	
	
	public Car(String brand, String model,int year) {
		this.brand = brand;
		this.model = model;
		this.year  = year;
	}



	public void startEngine() {
		System.out.println("차량 시동을 걸다.");
	}

	public void stopEngine() {
		System.out.println("차량 시동을 끈다.");
	}
}
