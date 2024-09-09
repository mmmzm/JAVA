package com.pcwk.ehr.ed06;

import com.pcwk.ehr.cmn.PLog;

public class R01_MathRoundCeilFloor implements PLog {

	public static void main(String[] args) {
		//반올림 : 
		double dVal = 90.7552D;
		LOG.debug("반올림: ");
		
		//Math.round(dVal)=>91
		LOG.debug("Math.round(dVal)=>"+Math.round(dVal));
		
		//솟수 3째 자리에서 반올림 : 90.xx
		
		dVal = dVal * 100;
		//Math.round(dVal)/100.0=>90.76
		LOG.debug("Math.round(dVal)/100.0=>"+Math.round(dVal)/100.0);
		
		//올림 : Math.ceil() -> SQL에 paging
		//1.1 -> 2
		//1.5 -> 2
		LOG.debug("========================================");
		LOG.debug("올림: ");
		LOG.debug("Math.ceil(1.1)"+Math.ceil(1.1));//Math.ceil(1.1)2.0
		LOG.debug("Math.ceil(1.5)"+Math.ceil(1.5));//Math.ceil(1.1)2.0
		
		LOG.debug("========================================");
		LOG.debug("버림: ");		
		LOG.debug("Math.floor(1.1)"+Math.floor(1.1));
		LOG.debug("Math.floor(1.1)"+Math.floor(1.5));
		
		LOG.debug("========================================");
		LOG.debug("상수: ");		
		LOG.debug("Math.PI="+Math.PI);
		LOG.debug("Math.E="+Math.E);
	}

}
//(R01_MathRoundCeilFloor.java:10) - 반올림: 
//(R01_MathRoundCeilFloor.java:13) - Math.round(dVal)=>91
//(R01_MathRoundCeilFloor.java:19) - Math.round(dVal)/100.0=>90.76
//(R01_MathRoundCeilFloor.java:24) - ========================================
//(R01_MathRoundCeilFloor.java:25) - 올림: 
//(R01_MathRoundCeilFloor.java:26) - Math.ceil(1.1)2.0
//(R01_MathRoundCeilFloor.java:27) - Math.ceil(1.5)2.0
//(R01_MathRoundCeilFloor.java:29) - ========================================
//(R01_MathRoundCeilFloor.java:30) - 버림: 
//(R01_MathRoundCeilFloor.java:31) - Math.floor(1.1)1.0
//(R01_MathRoundCeilFloor.java:32) - Math.floor(1.1)1.0
//(R01_MathRoundCeilFloor.java:34) - ========================================
//(R01_MathRoundCeilFloor.java:35) - 상수: 
//(R01_MathRoundCeilFloor.java:36) - Math.PI=3.141592653589793
//(R01_MathRoundCeilFloor.java:37) - Math.E=2.718281828459045