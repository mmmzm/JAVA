package com.pcwk.ehr.ed01;

import com.pcwk.ehr.cmn.PLog;

public class R01_Wrapper implements PLog {

	public static void main(String[] args) {
		Integer  iValue =new Integer(22);
		
		Integer  sValue =new Integer("23");
		
		LOG.debug("iValue:"+iValue);
		LOG.debug("sValue:"+sValue);
		LOG.debug("-------------------------");
		
		//클래스를 기본 자료형으로 변환: 자료형+Value()
		int myIntValue = iValue.intValue();
		LOG.debug("myIntValue:"+myIntValue);
		
		LOG.debug("Integer.MAX_VALUE:"+Integer.MAX_VALUE);
		LOG.debug("Integer.MIN_VALUE:"+Integer.MIN_VALUE);
		
		//bit,byte
		LOG.debug("Integer.SIZE:"+Integer.SIZE+"bit");
		LOG.debug("Integer.BYTES:"+Integer.BYTES+"byte");
		
		LOG.debug("-------------------------");
		
		Long lValue =new Long(22L);
		
		LOG.debug("lValue:"+lValue);
		//기본형 long으로 변환
		long myLongValue = lValue.longValue();
		LOG.debug("myLongValue:"+myLongValue);
		
		LOG.debug("Long최대값 :"+Long.MAX_VALUE);
		LOG.debug("Long최소값 :"+Long.MIN_VALUE);
		
		LOG.debug("Long.BYTES :"+Long.BYTES+" byte");
		LOG.debug("Long.SIZE :"+Long.SIZE+" bit");
	}

}
//iValue:22
//sValue:23
//-------------------------
//myIntValue:22
//Integer.MAX_VALUE:2147483647
//Integer.MIN_VALUE:-2147483648
//Integer.SIZE:32bit
//Integer.BYTES:4byte
//-------------------------
//lValue:22
//myLongValue:22
//Long최대값 :9223372036854775807
//Long최소값 :-9223372036854775808
//Long.BYTES :8 byte
//Long.SIZE :64 bit
