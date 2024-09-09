package com.pcwk.ehr.ed05;

public class Main {

	public static void main(String[] args) {
		Parseable parser = ParserManager.getParser("JSON");
		parser.parse("PCWK.json");
		
		
				
		parser = ParserManager.getParser("XML");
		parser.parse("PCWK.xml");

	}

}
//PCWK.json JSON parsing completed.
//PCWK.xml XML parsing completed.