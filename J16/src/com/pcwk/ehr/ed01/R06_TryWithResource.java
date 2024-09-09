package com.pcwk.ehr.ed01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class R06_TryWithResource {

	public static void main(String[] args) {
		// try-with-resource :
		//finally구문을 생략 가능(AutoCloseable 인터페이스를 implements받은  클래스 대상)
		
		String orgFileName = "D:\\JAP_20249311\\01_JAVA\\WORKSPACE\\J16\\src\\com\\pcwk\\ehr\\ed01\\R06_TryWithResource.java";
		String saveFileName = "CopyR06.java";

		FileInputStream  fis = null;
		FileOutputStream out = null;
		
		try {
			fis=new FileInputStream(orgFileName);
			out=new FileOutputStream(saveFileName);
			
		}catch(FileNotFoundException e) {
			System.out.println("FileNotFoundException :"+e.getMessage());
		}catch(IOException e) {
			System.out.println("IOException :"+e.getMessage());
		}catch(Exception e) {
			System.out.println("Exception :"+e.getMessage());
		}finally {
			if(null != fis) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			if(null != out) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}			
		}
	}

}
