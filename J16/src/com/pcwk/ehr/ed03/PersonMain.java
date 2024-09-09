package com.pcwk.ehr.ed03;

public class PersonMain {

	public static void main(String[] args) {
		Person  p01=new Person(123456789L);
		Person  p02=new Person(123456789L);
		
		System.out.println(p01.hashCode());//123456820
		System.out.println(p02.hashCode());//123456820
		
		System.out.println( (p01.hashCode() == p01.hashCode()) && p01.equals(p02));//true
		System.out.println(p01.equals(p02));//true
	}

}
