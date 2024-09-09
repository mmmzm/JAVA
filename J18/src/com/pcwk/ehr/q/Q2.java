package com.pcwk.ehr.q;

import com.pcwk.ehr.cmn.PLog;

public class Q2 implements PLog {

	public static String delChar(String src, String delCh) {
		StringBuilder sb=new StringBuilder();
		//1. src 문자열에서 char를 추출
		//2. 추출한 char delCh에 있는 지 확인.
		//->없으면 StringBuilder에 추가
		
		//1
		for(int i=0;i<src.length();i++) {
			char ch = src.charAt(i);
			//delCh에 ch가 없으면 StringBuilder에 추가 
			if(delCh.indexOf(ch) == -1) {
				//LOG.debug(ch);	
				sb.append(ch);
			}
			
		}
		
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(delChar("(1!2@3^4~5)","~!@#$%^&*()"));
		System.out.println(delChar("(1 2   3   4\t5)"," \t"));
	}

}
//12345
//(12345)