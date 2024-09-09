package com.pcwk.ehr.ed02;

import java.util.HashSet;

public class R07_PersonMain {

	public static void main(String[] args) {

		HashSet<Person> set = new HashSet<Person>();

		Person p01 = new Person("Alice", 19);
		Person p02 = new Person("Alice", 19);

		set.add(p01);
		set.add(p02);

		System.out.println(set);

	}

}
//[Person [name=Alice, age=19]]
