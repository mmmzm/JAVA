package com.pcwk.ehr.ed08;

public class DrawMain {

	public static void main(String[] args) {
		Point[] p= { new Point(100,100),new Point(140,50),new Point(200,100)};
		
		Triangle  triangle=new Triangle(p);
		Circle   circle = new Circle(new Point(150,150), 50);
		
		//오버라이딩: 건문 리모델링!
		triangle.draw();
		circle.draw();

	}

}
//[p1=(100,100), p2=(140,50), p3=(200,100), color=black]
//[center=(150,150), r=50, color=black]