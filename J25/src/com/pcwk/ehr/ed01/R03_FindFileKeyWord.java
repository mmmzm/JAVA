package com.pcwk.ehr.ed01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class R03_FindFileKeyWord {

	static int totalFileCount = 0;// 총 파일 수
	static int totalDirectoryCount = 0;// 총 디렉토 수

	static int keywordCount = 0;// 키워드 수

	static String keyword = "";// 키워드

	public static void main(String[] args) {
		// param args[0] : 디렉터리
		// param args[1] : 키워드

		if (args.length != 2) {
			System.out.println("디렉터리, 검색 키워드를 입력 하세요.");
			System.exit(0);
		}

		String dirPath = args[0];
		keyword = args[1];

		System.out.printf("dirPath=%s, keyword=%s%n", dirPath, keyword);

		// 디렉토리 객체
		File directory = new File(dirPath);

		try {
			printDirectoryContents(directory);
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("─────────────────────");
		System.out.println("keyword:" + keyword);
		System.out.println("keywordCount:" + keywordCount);
		System.out.println("─────────────────────");
	}

	/**
	 * 파일에 포함된 keyword 찾기
	 * 
	 * @param dir
	 * @throws IOException
	 */
	public static void printDirectoryContents(File dir) throws IOException {
		// 디렉터리, 파일 리스트
		File[] files = dir.listFiles();

		for (int i = 0; i < files.length; i++) {

			// 디렉터리 find : printDirectoryContents()
			if (files[i].isDirectory() == true) {
				printDirectoryContents(files[i]);
				// 파일:확장자가 java
			} else {
				// R03_FindFileKeyWord.java

				// 파일 이름 찾기
				String fileName = files[i].getName();
				String ext = "";
				if (fileName.lastIndexOf(".") != -1) {
					ext = fileName.substring(fileName.lastIndexOf(".") + 1);
				}

				// 확장자가 java가 아니면 continue
				if (!ext.equalsIgnoreCase("java")) {
					continue;
				}
				// System.out.printf("%s, %s%n",fileName,ext);

				// 파일
				// D:\JAP_20249311\01_JAVA\WORKSPACE\J25\src\com\pcwk\ehr\ed01\R02_UUID.java
				// D:\JAP_20249311\01_JAVA\WORKSPACE\J25\src\com\pcwk\ehr\cmn+\+
				String tmpFile = dir.getAbsolutePath() + File.separator + fileName;
				// System.out.printf("디렉터리:%s %n",tmpFile);

				// 문자 스트림 + 보조스트림(Buffer)
				try (FileReader fr = new FileReader(tmpFile); BufferedReader br = new BufferedReader(fr);) {

					// 한 줄씩 데이터 읽기
					String data = "";

					// 라인번호
					int lineNumber = 0;

					while ((data = br.readLine()) != null) {
						lineNumber++;

						// if comment가 있으면 counter에서 제외
						if (data.indexOf("//" + keyword) != -1 || data.indexOf("// " + keyword) != -1) {
							continue;
						}

						if (data.indexOf(keyword + " (") != -1 || data.indexOf(keyword + "(") != -1) {
							keywordCount++;
							System.out.printf("[%-20s - %d \t\t] %s%n", fileName, lineNumber, data);
						}
					}

					br.close();
				} catch (IOException e) {
					e.printStackTrace();
					throw e;
				}

			}

		} // for i

	}// printDirectoryContents end

}
