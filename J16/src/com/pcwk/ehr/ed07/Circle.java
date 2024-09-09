package com.pcwk.ehr.ed07;

public class Circle implements Cloneable{

	Pointer p;//원점
	int r;    //반지
	public Circle(Pointer p, int r) {
		super();
		this.p = p;
		this.r = r;
	}
	
	
	@Override
	public String toString() {
		return "Circle [p=" + p + ", r=" + r + "]";
	}


	@Override
	protected Circle clone() throws CloneNotSupportedException {
		//deep Copy
		Object obj = null;
		
		obj = super.clone();
		
		//참조변수 :Pointer copy
		Circle tmpCircle = (Circle)obj;
		
		//참조변수를 새롭게 생성
		tmpCircle.p = new Pointer(this.p.x, this.p.y);
		
		
		return tmpCircle;
	}
	
	
	
}
