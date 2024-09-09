package com.pcwk.ehr.ed01;

import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.pcwk.ehr.cmn.PLog;

public class R02_JSON implements PLog {

	public static void main(String[] args) {
		// 객체 생성
		Person person = new Person("PCWK", 22);

		// Gson객체 생성
		//new GsonBuilder().setPrettyPrinting()없는 경우 ->{"name":"PCWK","age":22}
		Gson gson = new GsonBuilder().setPrettyPrinting().create();

		try (FileWriter writer = new FileWriter("person.json")) {
			// 객체를 JSON문자열로 변환하여 파일에 기록
			gson.toJson(person, writer);
		} catch (IOException e) {
			LOG.debug("IOException:" + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("JSON 파일 생성!");

	}

}
