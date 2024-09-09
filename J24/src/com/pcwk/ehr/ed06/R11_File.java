package com.pcwk.ehr.ed06;

import java.io.File;

public class R11_File {

	public static void main(String[] args) {
		String filePathName = "D:\\JAP_20249311\\01_JAVA\\WORKSPACE\\J24\\src\\com\\pcwk\\ehr\\ed06\\R11_File.java";

		File f = new File(filePathName);

		// 경로를 제외한 파일이름: R11_File.java
		System.out.println("경로를 제외한 파일이름:" + f.getName());// 경로를 제외한 파일이름:R11_File.java

		// 파일이름을 제외한 파일 경로:
		System.out.println("파일이름을 제외한 파일 경로:" + f.getParent());// D:\JAP_20249311\01_JAVA\WORKSPACE\J24\src\com\pcwk\ehr\ed06

		// 경로+파일이름
		System.out.println("경로+파일이름:" + f.getPath());// D:\JAP_20249311\01_JAVA\WORKSPACE\J24\src\com\pcwk\ehr\ed06\R11_File.java

		// 파일이름, 확장자
		String fileName = f.getName();
		int pos = fileName.lastIndexOf(".");

		// R11_File
		System.out.println("파일이름:" + fileName.substring(0, pos));// R11_File

		// 확장자 : java
		System.out.println("확장자:" + fileName.substring(pos + 1));// java

		System.out.println("==================================================");
		// pathSeparator=> ;
		System.out.println("File.pathSeparator=>" + File.pathSeparator);// String
		// pathSeparatorChar
		System.out.println("File.pathSeparatorChar=>" + File.pathSeparatorChar);// char

		// \
		System.out.println("File.separator=>" + File.separator);// String
		System.out.println("File.separatorChar=>" + File.separatorChar);// char

		// user.dir:D:\JAP_20249311\01_JAVA\WORKSPACE\J24
		System.out.println("user.dir:" + System.getProperty("user.dir"));

	}

}
//경로를 제외한 파일이름:R11_File.java
//파일이름을 제외한 파일 경로:D:\JAP_20249311\01_JAVA\WORKSPACE\J24\src\com\pcwk\ehr\ed06
//경로+파일이름:D:\JAP_20249311\01_JAVA\WORKSPACE\J24\src\com\pcwk\ehr\ed06\R11_File.java
//파일이름:R11_File
//확장자:java
//==================================================
//File.pathSeparator=>;
//File.pathSeparatorChar=>;
//File.separator=>\
//File.separatorChar=>\
//user.dir:D:\JAP_20249311\01_JAVA\WORKSPACE\J24
