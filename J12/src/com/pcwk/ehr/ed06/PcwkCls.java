package com.pcwk.ehr.ed06;

public class PcwkCls {
	//인스턴스 변수
	int age;
	
	//클래스 변수
	static String name ;
	
	//default생성자
	public PcwkCls() {
		//this()또다른 생성자 호출
		this(23,"Kim");
	}
	
	public PcwkCls(int age, String name) {
		//this: 인스턴스 변수
		this.age = age;
		this.name = name;
		disp();
	}
	
	public void disp() {
		System.out.println("age="+age);
		System.out.println("name="+name);
	}
	
	//메소드 오버로드: 메서드 이름은 같은데 파람의 갯수와 타입이 다르면 다른 메서드
	
	public void disp(String newName) {
		System.out.println("age="+age);
		System.out.println("name="+name);
	}	
	//파람에 가변 인자
	public static void allPrint(String ... args) {
		System.out.println();
	}
	
}
