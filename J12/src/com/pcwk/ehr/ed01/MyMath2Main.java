package com.pcwk.ehr.ed01;

public class MyMath2Main {

	public static void main(String[] args) {
		//인스턴스 생성
		MyMath2 mm=new MyMath2();
		
		mm.x = 15;
		mm.y = 13;
		
		//인스턴스 메서드 호출
		System.out.println("mm.add():"+mm.add());
		System.out.println("mm.substract():"+mm.substract());
		System.out.println("mm.multiply():"+mm.multiply());
		System.out.println("mm.divide():"+mm.divide());
		
		//클래스 메서드 호출
		System.out.println(MyMath2.add(15, 13));
		System.out.println(MyMath2.substract(15, 13));
		System.out.println(MyMath2.multiply(15, 13));
		System.out.println(MyMath2.divide(15, 13));

	}

}
//mm.add():28
//mm.substract():2
//mm.multiply():195
//mm.divide():1.1538461538461537
//28
//2
//195
//1.1538461538461537