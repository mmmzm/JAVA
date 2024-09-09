package com.pcwk.ehr.ed05;

public class ParserManager {

	
	public static Parseable getParser(String type) {
		
		if("XML".equals(type)) {
			return new XMLParser();
		}else {
			
			Parseable p =new JSONParser();
			
			return p;
		}
		
	}
}
