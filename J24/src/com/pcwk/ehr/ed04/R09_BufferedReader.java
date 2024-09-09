package com.pcwk.ehr.ed04;
import java.io.*;


public class R09_BufferedReader {

	public static void main(String[] args) {
		String filePath = "D:\\JAP_20249311\\01_JAVA\\WORKSPACE\\J24\\src\\largeFile.txt";
		long startTime = System.currentTimeMillis();
		
		try( FileReader  fr=new FileReader(filePath);
			 BufferedReader br=new BufferedReader(fr);//buffersize : 8192
			){
			
			String line = "";//line단위 데이터 읽기
			
			while( (line=br.readLine()) !=null) {
				System.out.println(line);
			}
			
			
			
		}catch(IOException e) {
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
//-----------------------------
//-경과시간-:547
//-----------------------------