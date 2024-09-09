package com.pcwk.ehr.ed04;

import java.net.*;

public class R06_URL {

	public static void main(String[] args) {
		String aconURL = "https://www.acorncampus.co.kr:443/business/process.jsp?seq=30#inedx1";
		
		
		try {
			URL url=new URL(aconURL);
			
			//호스트명 포트
			System.out.println("호스트명 포트:"+url.getAuthority());
			
			//프로토콜
			System.out.println("프로토콜:"+url.getProtocol());
			
			//쿼리
			System.out.println("쿼리:"+url.getQuery());
			
			//전체
			System.out.println("쿼리:"+url.toURI());			
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}

	}

}
//호스트명 포트:www.acorncampus.co.kr:443
//프로토콜:https
//쿼리:seq=30
//쿼리:https://www.acorncampus.co.kr:443/business/process.jsp?seq=30#inedx1


