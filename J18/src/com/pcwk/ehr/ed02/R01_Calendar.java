package com.pcwk.ehr.ed02;

import com.pcwk.ehr.cmn.PLog;
import java.util.Calendar;


public class R01_Calendar implements PLog {

	public static void main(String[] args) {
		Calendar today01= Calendar.getInstance();

		//2024-04-03 오전/오후 14:27:30
		//날짜,
		//today01.get(field) :  출력하고 싶은 날짜 시간을 파람으로 전달
		LOG.debug("년:"+today01.get(Calendar.YEAR));//Calendar.YEAR == 1
		LOG.debug("월:"+(today01.get(Calendar.MONTH)+1));//1월 : 0
		LOG.debug("일:"+today01.get(Calendar.DATE));
		
		//요일(1~7) :1(일요일)
		LOG.debug("요일:"+today01.get(Calendar.DAY_OF_WEEK));//요일

		//오전/오후
		LOG.debug("오전(0)/오후(1):"+today01.get(Calendar.AM_PM));
		
		//시간:14:27:30
		//시간:
		LOG.debug("시간(0-11):"+today01.get(Calendar.HOUR));//
		LOG.debug("시간(0-23):"+today01.get(Calendar.HOUR_OF_DAY));//

		//분
		LOG.debug("분(0-59):"+today01.get(Calendar.MINUTE));//
		
		//초
		LOG.debug("초(0-59):"+today01.get(Calendar.SECOND));//
		
		//1/1000초
		LOG.debug("초(1/1000):"+today01.get(Calendar.MILLISECOND));//
	}

}
