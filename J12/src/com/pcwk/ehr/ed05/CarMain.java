package com.pcwk.ehr.ed05;

public class CarMain {

	public CarMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Car car01=new Car();//default생성자
		
		System.out.println("car01.brand:"+car01.brand);
		System.out.println("car01.model:"+car01.model);
		System.out.println("car01.year:"+car01.year);
		
		System.out.println("==================================================");
		
		Car car02=new Car("그랜저");
		System.out.println("car02.brand:"+car02.brand);
		System.out.println("car02.model:"+car02.model);
		System.out.println("car02.year:"+car02.year);		

	}

}
//Car() 생성자
//car01.brand:GENESIS
//car01.model:GV80
//car01.year:2024
//==================================================
//car02.brand:그랜저
//car02.model:GV80
//car02.year:2024