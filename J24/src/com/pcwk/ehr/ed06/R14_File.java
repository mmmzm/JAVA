package com.pcwk.ehr.ed06;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class R14_File {

	public static void main(String[] args) throws FileNotFoundException {
		// dos :dir
		// linux: ls -l

		if (args.length != 1) {
			System.out.println("디렉토리 경로를 입력 하세요.");
			System.exit(0);
		}

		String filePathName = args[0];
		
		String fileName = "list99.txt";
		
		PrintStream  printStream = new PrintStream(new FileOutputStream(fileName));
		
		
		// 디렉토리 객체 생성
		File directory = new File(filePathName);

		// 디렉토리 및 파일 리스트
		File[] fileList = directory.listFiles();
		
		
		
		for (File f : fileList) {
			StringBuilder  sb=new StringBuilder();
			// 파일이름
			sb.append(String.format("%-24s", f.getName()));
			
			// 파일크기
			String formattedNumber = String.format("%,d", f.length());

			sb.append(String.format("%12s\t", formattedNumber));
			// -rwx
			// -:file
			// d:directory
			// r:read
			// w:write
			// x:executable

			// 권한
			sb.append(f.isFile() == true ? "-" : "d");
			sb.append(f.canRead() ? "r" : "-");
			sb.append(f.canWrite() ? "w" : "-");
			sb.append(f.canExecute() ? "x" : "-");
			sb.append("\t");
			
			
			// 최종 수정일
			Date lastModDate = new Date(f.lastModified());

			// yyyy-MM-dd HH:mm:ss
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

			sb.append(sdf.format(lastModDate));
			sb.append("\n");
			
			System.out.print(sb.toString());
			printStream.print(sb.toString());
			
		} // --for

	}// --main

}
