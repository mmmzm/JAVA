package com.pcwk.ehr.ed04;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class R07_FileReader {

	public static void main(String[] args) {

		if (args.length != 1) {
			System.out.println("파일을 입력 하세요.");
			System.exit(0);
		}

		//경과 시간 측정
		long startTime = System.currentTimeMillis();
		
		
		String fileName = args[0];
		// D:\JAP_20249311\01_JAVA\WORKSPACE\J24\src\largeFile.txt
		System.out.println("fileName:" + fileName);

		try (Reader reader = new FileReader(fileName)) {
			int charater;
			while ((charater = reader.read()) != -1) {
				System.out.print((char) charater);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}



		long endTime = System.currentTimeMillis();
		System.out.println("-----------------------------");
		System.out.println("-경과시간-:"+(endTime-startTime));
		System.out.println("-----------------------------");
		
	}

}
//-----------------------------
//-경과시간-:5378
//-----------------------------