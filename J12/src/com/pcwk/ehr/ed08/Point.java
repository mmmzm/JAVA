package com.pcwk.ehr.ed08;

public class Point {
	int x;
	int y;
	
	
	public Point() {
		this(0,0);
	}


	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}


	String getXY() {
		return "("+x+","+y+")";//x,y를 문자열로 반환
	}

	
	
}
