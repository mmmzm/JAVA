package com.pcwk.ehr.ed08;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class UnMarshalMain {

	
	public void unmarshalTest() {
		//System.out.println("unmarshalTest()");
		
		//1.XML파일을 읽는다.
		//2.JAXB객체 생성
		//3.XML을 Person Object로 변환
		///D:/JAP_20249311/01_JAVA/WORKSPACE/J28/bin/com/pcwk/ehr/ed08/person.xml
		System.out.println(getClass().getResource("person.xml").getFile());
		File file=new File(getClass().getResource("person.xml").getFile()); 
		
		try {
			//JAXBContext 생성
			JAXBContext context = JAXBContext.newInstance(Person.class);
			//Unmarshaller 생성
			Unmarshaller unmarshaller =context.createUnmarshaller();
			
			//XML을 Person Object로 변환
			Person person = (Person) unmarshaller.unmarshal(file);
			
			System.out.println("name:"+person.getName());
			System.out.println("age:"+person.getAge());
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		// 객체 언마샬링(Unmarshalling) : XML문서를 읽어 와서 Java객체로 변환 합니다.
		
		new UnMarshalMain().unmarshalTest();

	}

}
///D:/JAP_20249311/01_JAVA/WORKSPACE/J28/bin/com/pcwk/ehr/ed08/person.xml
//name:JAXB
//age:22

