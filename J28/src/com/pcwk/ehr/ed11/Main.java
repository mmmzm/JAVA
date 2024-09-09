package com.pcwk.ehr.ed11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.pcwk.ehr.cmn.PLog;

public class Main implements PLog {
	MemberDTO member01;
	MemberDTO member02;
	MemberDTO member03;
	Box<MemberDTO> box;

	public Main() {
		member01 = new MemberDTO("james01", "이상무01", "a4321", "jamesol01@paran.com", "010-1234-5678", "2024-04-19",
				"admin");
		member02 = new MemberDTO("james02", "이상무02", "a4321", "jamesol02@paran.com", "010-1234-5679", "2024-04-19",
				"admin");
		member03 = new MemberDTO("james03", "이상무03", "a4321", "jamesol03@paran.com", "010-1234-5680", "2024-04-19",
				"admin");
		box = new Box<MemberDTO>();

		box.add(member01);
		box.add(member02);
		box.add(member03);
	}

	public int saveJSON(String fileName) {
		// PrettyPrinting된 json생성
		int flag = 0;
		Gson gson = new GsonBuilder().setPrettyPrinting().create();

		try (FileWriter writer = new FileWriter(fileName)) {
			// 객체를 JSON문자열로 변환하여 파일에 기록
			gson.toJson(box, writer);
			flag = 1;
		} catch (IOException e) {
			LOG.debug("IOException:" + e.getMessage());
			e.printStackTrace();
			flag = 0;
		}
		System.out.println("JSON 파일 생성!");

		return flag;

	}

	public Box<MemberDTO> readJSON(String fileName) {
		// PrettyPrinting된 json생성
		Box<MemberDTO> boxList = null;
		try(FileReader  fr=new FileReader(fileName);
				){
			//Gson객체 생성
			Gson  gson=new Gson();
			boxList =gson.fromJson(fr, Box.class);

		}catch(IOException e) {
			LOG.debug("IOException:"+e.getMessage());
			e.printStackTrace();
		}

		return boxList;

	}

	public static void main(String[] args) {
		// json파일 생성
		//new Main().saveJSON("member.json");
		
		Box<MemberDTO> readBox = new Main().readJSON("member.json");
		List<MemberDTO> list   = readBox.getListBox();

		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		

	}

}
