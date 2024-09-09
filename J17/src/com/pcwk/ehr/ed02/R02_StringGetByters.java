package com.pcwk.ehr.ed02;

import java.io.UnsupportedEncodingException;
import java.util.StringJoiner;

import com.pcwk.ehr.cmn.PLog;

public class R02_StringGetByters implements PLog {

	static String joinByteArray(byte[] bArr) {
		String str = "";
		
		StringJoiner sj=new StringJoiner(":", "[", "]");
		
		for(byte b :bArr) {
			//System.out.printf("%02X",b);
			sj.add(String.format("%02X", b));
		}
		str = sj.toString();
		return str;
	}
	
	
	public static void main(String[] args) {
		//문자열의 문자 인코딩을 다른 인코딩으로 변경 할수 있다.
		//자바가 UTF-16을 사용. 하지만 문자열 리터럴은 OS의 인코딩을 사용한다.
		//한글 윈도우즈의 경우 문자 인코딩으로 CP949를 사용한다.
		String str = "한";
		

		
		try {
			//OS(CP949) 인코딩으로 문자열 추출
			byte[] bArr = str.getBytes("CP949");
			LOG.debug("bArr="+joinByteArray(bArr));//CP949 "한" 한글을 표시[C7:D1]
			
			
			byte[] bArr2 = str.getBytes("UTF-8");//UTF-8 "한" 한글 bArr2=[ED:95:9C]
			LOG.debug("bArr2="+joinByteArray(bArr2));
			
			LOG.debug("===================================");
			//bArr(CP949)
			//bArr2(UTF-8)
			LOG.debug("String(bArr,\"CP949\")"+new String(bArr,"CP949"));
			LOG.debug("new String(bArr2,\"UTF-8\")"+new String(bArr2,"UTF-8"));
			
			//encoding 한글 깨짐
			LOG.debug("===================================");
			LOG.debug("String(bArr,\"CP949\")"+new String(bArr,"UTF-8"));
			
			
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		

	}

}
//(R02_StringGetByters.java:35) - bArr=[C7:D1]
//(R02_StringGetByters.java:39) - bArr2=[ED:95:9C]
//(R02_StringGetByters.java:41) - ===================================
//(R02_StringGetByters.java:44) - String(bArr,"CP949")한
//(R02_StringGetByters.java:45) - new String(bArr2,"UTF-8")한
//(R02_StringGetByters.java:48) - ===================================
//(R02_StringGetByters.java:49) - String(bArr,"CP949")��