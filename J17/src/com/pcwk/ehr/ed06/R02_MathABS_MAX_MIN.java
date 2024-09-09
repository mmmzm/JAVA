package com.pcwk.ehr.ed06;

import com.pcwk.ehr.cmn.PLog;

public class R02_MathABS_MAX_MIN implements PLog {


	//절대값 :
	public static void pABS() {
		int x = -10;
		LOG.debug("Math.abs(x)="+Math.abs(x));
		x = 10;
		LOG.debug("Math.abs(x)="+Math.abs(x));
		
		//(x<0) ?-x:x;
	}
	
	//max(x,y) -> 주어진 두 값을 비교하여 큰 쪽을 반환한다. 
	//min(x,y) -> 주어진 두 값을 비교하여 작은 쪽을 반환한다.
	public static void pMaxMin() {
		int x = 13;
		int y = 15;
		
		LOG.debug("Math.max(x, y)="+Math.max(x, y));
		LOG.debug("Math.min(x, y)="+Math.min(x, y));
	}
	
	//절대값 함수
	public static int uAbs(int x) {
		return (x<0) ?-x:x;
	}
	
	public static void main(String[] args) {
		pABS();
		pMaxMin();
		
		LOG.debug(uAbs(-1));
	}

}
//(R02_MathABS_MAX_MIN.java:11) - Math.abs(x)=10
//(R02_MathABS_MAX_MIN.java:13) - Math.abs(x)=10
//(R02_MathABS_MAX_MIN.java:24) - Math.max(x, y)=15
//(R02_MathABS_MAX_MIN.java:25) - Math.min(x, y)=13
//(R02_MathABS_MAX_MIN.java:37) - 1
