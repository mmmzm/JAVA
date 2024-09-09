package com.pcwk.ehr.ed06;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class MarshalMain {
	public static void marshalTest() {

            Person person = new Person("jaxb",22);

            // JAXBContext 생성 & marshaller 생성
            JAXBContext context;
			try {
				context = JAXBContext.newInstance(Person.class);
	            Marshaller marshaller = context.createMarshaller();

	            // 보기 좋게 출력해주는 옵션
	            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

	            // 표준 출력으로 결과를 보여준다.
	            marshaller.marshal(person, System.out);				
			} catch (JAXBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


    }
	public static void main(String[] args) {
		marshalTest();

	}

}
