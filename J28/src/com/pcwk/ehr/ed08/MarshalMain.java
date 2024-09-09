package com.pcwk.ehr.ed08;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class MarshalMain {

	public static void marshalTest() {
		Person person=new Person(21, "이상무");
		
		try {
			JAXBContext context = JAXBContext.newInstance(Person.class);
			
			Marshaller marshaller = context.createMarshaller();
			
			//보기 좋게 출력
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			//console에 출력
			marshaller.marshal(person, System.out);
			
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		marshalTest();
	}

}
//<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
//<person>
//    <age>21</age>
//    <name>이상무</name>
//</person>