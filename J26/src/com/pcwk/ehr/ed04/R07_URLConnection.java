package com.pcwk.ehr.ed04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.*;

public class R07_URLConnection {

	public static void main(String[] args) {
		String acon = "https://www.acorncampus.co.kr:443/business/process.jsp?seq=30#inedx1";
		
		BufferedReader br = null;
		
		try{
			URL url=new URL(acon);
			
			URLConnection conn = url.openConnection();
			
			InputStream is = conn.getInputStream();
			//byte -> char 변경 클래스 : InputStreamReader
			br = new BufferedReader(new InputStreamReader(is));
			
			String lineData = "";
			while( (lineData = br.readLine()) !=null) {
				System.out.println(lineData);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(null !=br) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
