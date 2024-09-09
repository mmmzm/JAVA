package com.pcwk.ehr.ed01;

import com.pcwk.ehr.cmn.PLog;
import java.util.Objects;
public class ObjectUtil implements PLog {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = null;
		
		//NullPointerException
		//System.out.println(str2.equals(str1));
		
		//두 객체의 동등 여부 비교
		boolean isEqual=Objects.equals(str1, str2);
		LOG.debug(isEqual);
		
		
		//객체가 null인지
		boolean isNUll = Objects.isNull(str1);
		LOG.debug(isNUll);
		
		//객체가 null이 아닌지 확인
		boolean noneNull = Objects.nonNull(str1);
		LOG.debug(noneNull);
		
	}

}
