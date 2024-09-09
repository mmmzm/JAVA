package com.pcwk.ehr.ed03;

import java.io.Serializable;

public class Person implements  Serializable {


	private static final long serialVersionUID = -8569364944781867499L;
	private String name;//이름
	private int    age; //나이
	
	//비번은 직렬화 대상에서 제외
	private transient String password;
	
	
	
	public Person() {
	}


	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}


	public Person(String name, int age, String password) {
		super();
		this.name = name;
		this.age = age;
		this.password = password;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", password=" + password + "]";
	}

	
	
}
