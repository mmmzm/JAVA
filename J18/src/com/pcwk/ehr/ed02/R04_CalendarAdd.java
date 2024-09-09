package com.pcwk.ehr.ed02;

import java.util.Calendar;

import com.pcwk.ehr.cmn.DateUtil;
import com.pcwk.ehr.cmn.PLog;

//ctrl+shift+o
public class R04_CalendarAdd implements PLog {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		LOG.debug(DateUtil.toDateFormatString(cal));

		//7일 이후 날짜 +
		cal.add(Calendar.DATE, 7);
		LOG.debug(DateUtil.toDateFormatString(cal));
		
		//5개월 이후
		cal.add(Calendar.MONTH, 5);
		LOG.debug(DateUtil.toDateFormatString(cal));		
		
		//-6개월 이전
		cal.add(Calendar.MONTH, -6);
		LOG.debug(DateUtil.toDateFormatString(cal));		
	}

}
//(R04_CalendarAdd.java:14) - 2024년04월03일
//(R04_CalendarAdd.java:18) - 2024년04월10일
//(R04_CalendarAdd.java:22) - 2024년09월10일
//(R04_CalendarAdd.java:26) - 2024년03월10일
