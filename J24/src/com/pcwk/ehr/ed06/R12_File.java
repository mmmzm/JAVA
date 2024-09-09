package com.pcwk.ehr.ed06;

import java.io.*;


public class R12_File {

	public static void main(String[] args) {
		// 디렉토리 내에 파일/디렉토리 읽기
		// D:\JAP_20249311\01_JAVA\WORKSPACE\J24\src\com\pcwk\ehr\ed01

		if(args.length !=1) {
			System.out.println("디렉토리를 입력 하세요.");
			System.exit(0);
		}
		
		
		System.out.println("디렉토리:"+args[0]);
		
		File f=new File(args[0]);
		
		if(!f.isDirectory() || !f.exists()) {
			System.out.println("유효한 디렉터리를 입력 하세요.");
			System.exit(0);
		}
		
		
		File[]  filesAndDir=f.listFiles();
		
		for(int i=0;i<filesAndDir.length;i++) {
			String name = filesAndDir[i].getName();
			System.out.println(filesAndDir[i].isDirectory()?"["+name+"]":name);
		}
		
	}

}
//디렉토리:D:\JAP_20249311\01_JAVA\WORKSPACE\J24\src
//[com]
//[images]
//largeFile.txt
//[music]
//pcwk.txt
//[source]