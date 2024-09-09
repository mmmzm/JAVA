package com.pcwk.ehr.ed01;

import java.util.StringJoiner;

import com.pcwk.ehr.cmn.PLog;

public class R01_StringSplitJoin implements PLog {

	public static void main(String[] args) {
		String animals = "dog|cat|pig";
		
		//| : 특수한 문자 일반 텍스트로 변환 필요. \\|
		String[] strArr = animals.split("\\|");
		
		for(String str :strArr) {
			LOG.debug("str:"+str);
		}

		LOG.debug("----------------------------");
		//dog-cat-pig
		LOG.debug(String.join("-", strArr));
		
		//[dog-cat-pig] : StringJoiner
		StringJoiner sj=new StringJoiner(":", "[", "]");
		
		for(String str :strArr) {
			sj.add(str);
		}
		
		//[dog:cat:pig]
		LOG.debug(sj.toString());
		
	}

}
