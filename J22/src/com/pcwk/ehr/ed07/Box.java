package com.pcwk.ehr.ed07;

//클래스와 메서드 멤버변수
public class Box<T> {
	T item;
	
	public void setItem(T item) {
		this.item = item;
	}
	
	public T getItem() {
		return this.item;
	}
}
