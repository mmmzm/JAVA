package com.pcwk.ehr.ed03;
import java.io.*;


public class R06_PrintStreamFile {

	public static void main(String[] args) {
		String fileName ="pcwkOut.txt";
		
		try(PrintStream  printStream = new PrintStream(new FileOutputStream(fileName))) {
		
			//파일에 내용 출력
			printStream.println("Hello, World!");
			printStream.print("This is a line without newline.");
			printStream.printf("Formatted number: %d", 23);
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		//표준 출력으로 텍스트 출력
		System.out.println("Printed to standard output.");
		

	}

}
