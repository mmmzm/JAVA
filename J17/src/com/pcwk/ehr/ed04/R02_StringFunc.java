package com.pcwk.ehr.ed04;

import com.pcwk.ehr.cmn.PLog;

public class R02_StringFunc implements PLog {

	//지정된 문자열의 포함 여부 :contains()
	public static void pContains() {
		String str = "abcdefghi";
		LOG.debug(str.contains("b"));//true
		LOG.debug(str.contains("z"));//false
	}
	
	//문자열의 길이: length()
	public static void pLength() {
		String str = "Hello";
		LOG.debug(str.length());
		
		//문자열을 1개씩 추출
		for(int i=0;i<str.length();i++  ) {
			LOG.debug(str.charAt(i));
		}
	}
	
	//trim(): 앞뒤 공백 제거
	public static void pTrim() {
		String str = " Hello world! ";
		LOG.debug(str.trim());
	}
	
	//010-1234-5678
	public static void pSplit() {
		String str = "010-1234-5678";
		for( String s  :str.split("-")) {
			System.out.print(s);
		}
	}
	
	public static void main(String[] args) {
		pContains();
		pLength();
		pTrim();
		pSplit();
	}

}
//(R02_StringFunc.java:10) - true
//(R02_StringFunc.java:11) - false
//(R02_StringFunc.java:17) - 5
//(R02_StringFunc.java:21) - H
//(R02_StringFunc.java:21) - e
//(R02_StringFunc.java:21) - l
//(R02_StringFunc.java:21) - l
//(R02_StringFunc.java:21) - o
//(R02_StringFunc.java:28) - Hello world!
//01012345678
