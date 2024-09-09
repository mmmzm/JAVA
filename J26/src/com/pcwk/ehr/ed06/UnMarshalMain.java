package com.pcwk.ehr.ed06;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class UnMarshalMain {
    public  void unmarshalTest() {
        try {
            // XML 파일을 읽어온다.
            File file = new File(getClass().getResource("test.xml").getFile());
            
            // JAXBContext 생성 & unmarshaller 생성
            JAXBContext context = JAXBContext.newInstance(Person.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            
            // XML을 Person 오브젝트로 변환한다.
            Person person = (Person) unmarshaller.unmarshal(file);
            
            System.out.println("name: " + person.getName());
            System.out.println("age: " + person.getAge());
        } catch (Exception e) {
            // ... handle exception
        }
    }
	public static void main(String[] args) {
		new UnMarshalMain().unmarshalTest();

	}

}
//name: jaxb
//age: 22