package com.pcwk.ehr.ed10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.pcwk.ehr.cmn.PLog;


import static com.pcwk.ehr.ed10.NaverApp.CLIENT_ID;
import static com.pcwk.ehr.ed10.NaverApp.CLIENT_SECRET;

public class JSONParser implements Parseable, PLog {

	private String apiURL; // 검색URL
	private String searchWord; // 검색어

	public JSONParser(String apiURL, String searchWord) {

		this.apiURL = apiURL;
		try {
			this.searchWord = URLEncoder.encode(searchWord, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
   

	}

	@Override
	public List<Item> parse() {
		Channel channel = null;
		
		try {
			// Naver인증 요청
			apiURL += searchWord; 
			LOG.debug("apiURL:"+apiURL);			
			URL url = new URL(apiURL);

			HttpURLConnection con;

			con = (HttpURLConnection) url.openConnection();
			LOG.debug("con:"+con);
			// Client ID/Client Secret 인증
			con.setRequestMethod("GET");
			con.setRequestProperty("X-Naver-Client-Id", CLIENT_ID);
			con.setRequestProperty("X-Naver-Client-Secret", CLIENT_SECRET);

			LOG.debug("CLIENT_ID:"+CLIENT_ID);
			LOG.debug("CLIENT_SECRET:"+CLIENT_SECRET);
			// 응답코드:200성공
			int responseCode = con.getResponseCode();
			LOG.debug("responseCode:" + responseCode);

			if (200 != responseCode) {
				return (List<Item>) new ArrayList<Item>();
			}

			String retString = readBody(con.getInputStream());
			Gson gson = new Gson();
	        channel = gson.fromJson(retString,Channel.class);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return channel.getItems();
	}

	/**
	 * JSON type 문자열 return
	 * @param is
	 * @return String(JSON)
	 */
	public static String readBody(InputStream is) {
		StringBuilder sb = new StringBuilder(1000);

		try (BufferedReader br = new BufferedReader(new InputStreamReader(is));) {
			String inputData = "";

			while ((inputData = br.readLine()) != null) {
				sb.append(inputData + "\n");
			}

			 LOG.debug(sb.toString());

		} catch (IOException e) {
			LOG.debug("IOException:" + e.getMessage());
			e.printStackTrace();
		}

		return sb.toString();
	}
}
