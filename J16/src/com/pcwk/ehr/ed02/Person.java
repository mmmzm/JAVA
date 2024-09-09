package com.pcwk.ehr.ed02;

public class Person {
	long id;//회원ID
	
	public Person(long id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(null != obj && obj instanceof Person) {
			return id== ((Person)obj).id;
		}else {
			return false;
		}
	}
}
