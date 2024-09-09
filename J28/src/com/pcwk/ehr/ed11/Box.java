package com.pcwk.ehr.ed11;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {

	private List<T> listBox=new ArrayList<T>(); 
	
	public Box() {}

	public List<T> getListBox() {
		return listBox;
	}

	public void setListBox(List<T> listBox) {
		this.listBox = listBox;
	}


	public void add(T item) {
		this.listBox.add(item);
	}
	
	public T get(int i) {
		return this.listBox.get(i);
	}

	@Override
	public String toString() {
		return "Box [listBox=" + listBox + "]";
	}
	
	
	
}
