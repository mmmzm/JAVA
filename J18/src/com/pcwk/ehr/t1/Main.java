package com.pcwk.ehr.t1;

import java.nio.charset.StandardCharsets;

public class Main {
	
	    public static void main(String[] args) {
	        String str = "안녕하세요";
	        
	        // UTF-8 인코딩을 사용하여 문자열을 바이트 배열로 변환합니다.
	        byte[] byteArray = str.getBytes(StandardCharsets.UTF_8);
	        
	        // 바이트 배열을 문자열로 변환하여 출력합니다.
	        String convertedString = new String(byteArray, StandardCharsets.UTF_8);
	        System.out.println("Converted String: " + convertedString);
	    }
	}
