package com.pcwk.ehr.ed01;
import java.util.*;


public class R05_StringTokenizer {

	public static void main(String[] args) {
		//문자열을 공백을 기준으로 분리
		
		String str = "Javaisaprograminglanguage";
		StringTokenizer  tokenizer=new StringTokenizer(str);
	
		//모든 토큰 출력
		while(tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			System.out.println(token);
		}
		
		String  data = "1,Alice,80,90,95|2,Bob,80,90,95|3,Charlie,80,90,95";
		
		StringTokenizer st=new StringTokenizer(data, "|");
		
		//모든 토큰 출력
		while(st.hasMoreTokens() == true) {
			String token = st.nextToken();
			System.out.println(token);
			
			StringTokenizer stPerson=new StringTokenizer(token, ",");
			while(stPerson.hasMoreTokens()) {
				System.out.println(stPerson.nextToken());
			}
			System.out.println("-------------------------------------------");
		}

	}

}
