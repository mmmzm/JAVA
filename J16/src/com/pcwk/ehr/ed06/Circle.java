package com.pcwk.ehr.ed06;

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
		//얕은 Copy
		return (Circle)super.clone();
	}
	
	
	
}
