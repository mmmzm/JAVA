package com.pcwk.ehr.ed10;

import java.util.List;

import com.pcwk.ehr.cmn.PLog;

public class Main implements PLog {

	public static void main(String[] args) {
		
		//String apiURL     = "https://openapi.naver.com/v1/search/blog.json?start=3&display=10&query=";
		String apiURL       = "https://openapi.naver.com/v1/search/blog.xml?display=10&query=";
		String searchWord = "홍대";
		//String start      = "1";
		
		Parseable<Item> parseable=ParserManager.getParser("xml", apiURL, searchWord);
		
		List<Item> list = parseable.parse();
		
		for(Item it  :list) {
			LOG.debug(it);
		}

	}

}
