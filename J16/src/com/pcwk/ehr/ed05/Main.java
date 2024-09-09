package com.pcwk.ehr.ed05;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		Pointer pointer=new Pointer(13, 15);
		
		Pointer clonePointer = (Pointer) pointer.clone();
		
		System.out.println("원본:"+pointer.toString());
		System.out.println("clone:"+clonePointer.toString());
		System.out.println("============================");
		//clone 데이터 변경
		
		clonePointer.x = 12;
		
		System.out.println("원본:"+pointer.toString());
		System.out.println("clone:"+clonePointer.toString());		
		
		
	}

}
//원본:Pointer [x=13, y=15]
//clone:Pointer [x=13, y=15]
//============================
//원본:Pointer [x=13, y=15]
//clone:Pointer [x=12, y=15]