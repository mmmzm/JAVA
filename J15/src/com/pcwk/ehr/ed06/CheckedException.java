package com.pcwk.ehr.ed06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {
	public static void main(String[] args) {
		
		try {
			FileInputStream  fis=new FileInputStream("D:\\JAP_20249311\\01_JAVA\\WORKSPACE\\J15\\src\\com\\pcwk\\ehr\\ed06\\CheckedException.java");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
