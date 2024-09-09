package com.pcwk.ehr.ed10;

public class ParserManager {

	/**
	 * 데이터 타입(json/xml)에 따른 XMLParser/JSONParser 객체 return
	 * @param type
	 * @return 
	 */
	public static Parseable  getParser(String type,String apiURL, String searchWord) {
		if("xml".equalsIgnoreCase(type)) {
			return new XMLParser(apiURL,searchWord);
		}else if("json".equalsIgnoreCase(type)) {
			return new JSONParser(apiURL,searchWord);
		}
		
		return null;
		
	}
}
