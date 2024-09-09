package com.pcwk.ehr.q;

public class Q2 {

	public static void main(String[] args) {
		String fullPath = "c:\\jdk1.8\\work\\PathSeparaterTest.java";
		String path = "";
		String fileName = "";
		
		int idx = fullPath.lastIndexOf("\\");
		
		if(-1 != idx) {//프로그램 안정성을 위해 : 해당 문자가 없으면 -1
			path = fullPath.substring(0, idx);
			fileName = fullPath.substring(idx+1);
		}
		
		
		System.out.println(idx);
		System.out.println("fullPath:"+fullPath);
		System.out.println("path:"+path);
		System.out.println("fileName:"+fileName);

	}  

}
//14
//fullPath:c:\jdk1.8\work\PathSeparaterTest.java
//path:c:\jdk1.8\work
//fileName:PathSeparaterTest.java