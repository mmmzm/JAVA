package com.pcwk.ehr.ed01;

import java.time.LocalDate;
import java.time.Period;

import com.pcwk.ehr.cmn.PLog;

//ctrl+shift+o
//ctrl+shift+f
public class R01_Period implements PLog {

	public static void main(String[] args) {
		// Period : 날짜 간격, 시간정보 포함하지 않음.

		LocalDate startDate = LocalDate.of(2021, 5, 1);
		LocalDate endDate = LocalDate.of(2023, 10, 11);

		// 두 날짜간에 간격
		Period period = Period.between(startDate, endDate);

		System.out
				.println("두 날짜간에 간격:" + period.getYears() + "년 " + period.getMonths() + "개월" + period.getDays() + "일");

		//
		LocalDate futureDate = startDate.plus(period);
		System.out.println("futureDate:" + futureDate);

	}

}
//두 날짜간에 간격:2년 5개월10일
//futureDate:2023-10-11