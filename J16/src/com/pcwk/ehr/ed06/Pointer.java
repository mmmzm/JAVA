package com.pcwk.ehr.ed06;

public class Pointer implements Cloneable {
    //Cloneable : 내용없음(마커 인터페이스)
	int x;
	int y;

	public Pointer(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Pointer [x=" + x + ", y=" + y + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("CloneNotSupportedException: " + e.getMessage());
			throw e;
		}

		return obj;
	}

}
