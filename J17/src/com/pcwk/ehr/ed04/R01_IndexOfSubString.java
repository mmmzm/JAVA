package com.pcwk.ehr.ed04;

import com.pcwk.ehr.cmn.PLog;

public class R01_IndexOfSubString implements PLog {

	public static void main(String[] args) {
		String fullName = "Hello.java";
		
		int idx =fullName.indexOf(".");
		
		LOG.debug("idx:"+idx);

		//확장자: '.'위치를 찾고 +1 
		String suffix = fullName.substring(idx+1);
		LOG.debug(suffix);
		
		LOG.debug("------------------------------");
		fullName = "new.Hello.java";
		
		idx = fullName.lastIndexOf(".");
		LOG.debug("idx:"+idx);
		suffix = fullName.substring(idx+1);
		LOG.debug(suffix);
		
		//
		String fileName = fullName.substring(0, idx);
		LOG.debug(fileName);

	}

}
//(R01_IndexOfSubString.java:12) - idx:5
//(R01_IndexOfSubString.java:16) - java
//(R01_IndexOfSubString.java:18) - ------------------------------
//(R01_IndexOfSubString.java:22) - idx:9
//(R01_IndexOfSubString.java:24) - java
//(R01_IndexOfSubString.java:28) - new.Hello


