package com.pcwk.ehr.ed08;

public class Circle extends Shape {
	Point center;//원의 원점
	int r;//반지
	
	public Circle() {
		this(new Point(0, 0), 100);
	}
	public Circle(Point center, int r) {
		
		this.center = center;
		this.r = r;
	}
	
	void draw() {
		System.out.printf("[center=(%d,%d), r=%d, color=%s]"
				,center.x, center.y, r, color);
	}
	
	
}
