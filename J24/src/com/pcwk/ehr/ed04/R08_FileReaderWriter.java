package com.pcwk.ehr.ed04;
import java.io.*;


public class R08_FileReaderWriter {

	public static void main(String[] args) {
		
		if(args.length !=2) {
			System.out.println("읽을 파일명 기록파일명을 입력 하세요.");
			System.exit(0);
		}
		
		//D:\JAP_20249311\01_JAVA\WORKSPACE\J24\src\com\pcwk\ehr\ed04\R08_FileReaderWriter.java convert.txt
		String readFileName  = args[0];
		String writeFileName = args[1];
		
		System.out.println("readFileName:"+readFileName);
		System.out.println("writeFileName:"+writeFileName);
		
		try(FileReader fr=new FileReader(readFileName);
			FileWriter fw=new FileWriter(writeFileName);
			){
			
			int character = 0;
			while( (character=fr.read()) !=-1) {
				//enter:'\n' && '\r'
				//space:' '
				//tab:'\t'
				if( character !='\t' && character !=' ' && character !='\n' && character !='\r') {
					fw.write(character);
				}
			}
			
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("-----------------------------");
		System.out.println("-프로그램 종료-");
		System.out.println("-----------------------------");
	}

}
