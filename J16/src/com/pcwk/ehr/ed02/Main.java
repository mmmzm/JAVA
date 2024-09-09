package com.pcwk.ehr.ed02;

public class Main {

	public static void main(String[] args) {
		Person person01=new Person(123456789);
		
		Person person02=new Person(123456789);
		
		System.out.println("person01:"+person01);
		if(person01.equals(person02) ==true ) {
			System.out.println("person01,person02동일 ");
		}else {
			System.out.println("person01,person02 같지않다. ");
		}
		System.out.println("person02:"+person02);
	}

}
//person01:com.pcwk.ehr.ed02.Person@15db9742
//person01,person02동일 
//person02:com.pcwk.ehr.ed02.Person@6d06d69c