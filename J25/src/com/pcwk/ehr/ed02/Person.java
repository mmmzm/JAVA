package com.pcwk.ehr.ed02;

import java.io.Serializable;

public class Person implements  Serializable {


	private static final long serialVersionUID = -8569364944781867499L;
	private String name;//이름
	private int    age; //나이
	
	public Person() {
	}


	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
}
