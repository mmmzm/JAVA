package com.pcwk.ehr.ed09;
import java.util.*;


public class Box<T> {
	
	ArrayList<T> list=new ArrayList<>();
	
	
	public void add(T item) {
		list.add(item);
	}
	
	public T get(int i) {
		return list.get(i);
	}

	@Override
	public String toString() {
		return "Box [list=" + list + "]";
	}
	
	
	
	
}
