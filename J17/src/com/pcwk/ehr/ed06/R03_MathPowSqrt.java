package com.pcwk.ehr.ed06;

import com.pcwk.ehr.cmn.PLog;

public class R03_MathPowSqrt implements PLog {

	public static void main(String[] args) {
//		Math.sqrt() : root
//		Math.sqrt( Math.pow((x2 - x1),2) + Math,pow((y2- y1),2) );

		//(1,1)
		//(2,2)

		LOG.debug("Math.sqrt(2)="+Math.sqrt(2));
		LOG.debug("Math.pow(3, 2)="+Math.pow(3, 2));
		
		int x1 =1;
		int y1 =1;
		
		int x2 =2;
		int y2 =2;
		
		double distance =Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1),2));
		
		LOG.debug("두 점사이의 거리는: "+distance);
		
		
		LOG.debug(distance * Math.sin(Math.PI/4));
		LOG.debug(distance * Math.cos(Math.PI/4));
		
	}

}
