package com.pcwk.ehr.ed01;

import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;
import com.pcwk.ehr.cmn.PLog;

public class R01_JSON implements PLog {

	public static void main(String[] args) {
		//
		LOG.debug("JSON 파싱");
		String fileName = "D:\\JAP_20249311\\01_JAVA\\WORKSPACE\\J26\\src\\data.json";

		try (FileReader fr = new FileReader(fileName);) {
			// Gson객체 생성
			Gson gson = new Gson();
			Person person = gson.fromJson(fr, Person.class);

			LOG.debug("name: " + person.getName());
			LOG.debug("age: " + person.getAge());

		} catch (IOException e) {
			LOG.debug("IOException:" + e.getMessage());
			e.printStackTrace();
		}

	}

}
