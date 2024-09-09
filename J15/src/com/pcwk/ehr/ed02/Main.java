package com.pcwk.ehr.ed02;

public class Main {

	public static void main(String[] args) {
		Outer outer=new Outer();
		
		//Instance Inner객체 생성
		Outer.InstanceInnerClass ii=outer.new InstanceInnerClass();
		
		System.out.println("ii.iv:"+ii.iv);
		
		//static inner class 접근
		System.out.println("Outer.StaticInnerClass.cv:"+Outer.StaticInnerClass.cv);
		
		//static inner 인스턴스 변수 접근
		Outer.StaticInnerClass  si=new Outer.StaticInnerClass();
		System.out.println(si.iv);
	}

}
