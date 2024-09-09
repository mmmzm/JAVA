package com.pcwk.ehr.ed06;

import java.io.File;
import java.util.ArrayList;

public class R13_File {

	static int totalFiles = 0;//파일 개수
	static int totalDirs  = 0;//디렉토리 개수
	
	public static void printFileDir(File dir) {
		//하위 디렉토리 
		ArrayList<String> subDir=new ArrayList<String>();
		
		System.out.println("디렉토리:"+dir.getAbsolutePath());
		
		// 디렉토리 내의 파일과 디렉토리 목록
		File[] files = dir.listFiles();
		
		for(int i=0;i<files.length;i++) {
			String name = files[i].getName();
			
			//디렉토리 : [디렉토리]
			if(files[i].isDirectory()==true) {
				name ="["+name+"]";
				subDir.add(i+"");
			}
			
			//파일이면 : 파일
			System.out.println(name);
		}//for end 
		
		
		//디렉토리 수	
		int dirCount = 	subDir.size();
		
		//파일 수	
		int fileCount=  files.length - dirCount;
		
		System.out.printf("%d 개의 파일, %d 개의 디렉토리%n",fileCount,dirCount);
		
		totalFiles +=fileCount;
		totalDirs  +=dirCount;
		
		for(int j=0;j<subDir.size();j++ ) {
			int index=Integer.parseInt(subDir.get(j));
			//System.out.println(index+","+files[index]);
			
			//제귀호출 
			printFileDir(files[index]);
		}
		
	}
	
	public static void main(String[] args) {
		if(args.length !=1) {
			System.out.println("디렉토리를 입력 하세요.");
			System.exit(0);
		}
		//D:\JAP_20249311\01_JAVA\WORKSPACE\J24\src\com\pcwk\ehr
		//System.out.println("디렉토리:"+args[0]);

		File f=new File(args[0]);
		
		if(!f.isDirectory() || !f.exists()) {
			System.out.println("유효한 디렉터리를 입력 하세요.");
			System.exit(0);
		}
		
		printFileDir(f);
		
		System.out.println("파일 개수:"+totalFiles);
		System.out.println("디렉토리 개수:"+totalDirs);
		
	}

}
