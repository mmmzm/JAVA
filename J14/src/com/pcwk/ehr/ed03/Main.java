package com.pcwk.ehr.ed03;

public class Main {

	public static void main(String[] args) {
		Fighter  f=new Fighter();
		
		//인터페이스의 다형성
		if(f instanceof Unit) {
			System.out.println("f는 Unit의 자손 입니다.");
		}

		//인터페이스의 다형성
		if(f instanceof Fightable) {
			System.out.println("f는 Fightable 인터페이스를 구현 했습니다.");
		}	
		
		//인터페이스의 다형성
		if(f instanceof Movable) {
			System.out.println("f는 Movable 인터페이스를 구현 했습니다.");
		}	
		
		//인터페이스의 다형성
		if(f instanceof Attackable) {
			System.out.println("f는 Attackable 인터페이스를 구현 했습니다.");
		}	
		
		//인터페이스의 다형성
		if(f instanceof Object) {
			System.out.println("f는 Object클래스의 자손 입니다.");
		}		
	}

}
//f는 Unit의 자손 입니다.
//f는 Fightable 인터페이스를 구현 했습니다.
//f는 Movable 인터페이스를 구현 했습니다.
//f는 Attackable 인터페이스를 구현 했습니다.
//f는 Object클래스의 자손 입니다.
