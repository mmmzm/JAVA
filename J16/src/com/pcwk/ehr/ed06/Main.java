package com.pcwk.ehr.ed06;

public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		//얕은 copy
		
		Circle circle=new Circle(new Pointer(13, 15), 18);
		
		Circle cloneCircle=circle.clone();
		
		
		System.out.println("원본:"+circle);
		System.out.println("cloneCircle:"+cloneCircle);
		System.out.println("---------------------------");
		
		circle.p.x = 13+1;
		circle.p.y = 15+1;
		System.out.println("원본:"+circle);
		System.out.println("cloneCircle:"+cloneCircle);		
	}
}
//cloneCircle의 Pointer은 같은 주소를 바로보고 있다. 
//완벽한 clone()되지 않음!
//원본:Circle [p=Pointer [x=13, y=15], r=18]
//cloneCircle:Circle [p=Pointer [x=13, y=15], r=18]
//---------------------------
//원본:Circle [p=Pointer [x=14, y=16], r=18]
//cloneCircle:Circle [p=Pointer [x=14, y=16], r=18]