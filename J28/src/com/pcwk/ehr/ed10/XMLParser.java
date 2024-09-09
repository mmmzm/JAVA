package com.pcwk.ehr.ed10;

import static com.pcwk.ehr.ed10.NaverApp.CLIENT_ID;
import static com.pcwk.ehr.ed10.NaverApp.CLIENT_SECRET;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.pcwk.ehr.cmn.PLog;


public class XMLParser implements Parseable, PLog {

	private String apiURL; // 검색URL
	private String searchWord; // 검색어

	public XMLParser(String apiURL, String searchWord) {

		this.apiURL = apiURL;
		try {
			this.searchWord = URLEncoder.encode(searchWord, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<Item> parse() {
		List<Item> list = null;
		try {
			// Naver인증 요청
			apiURL += searchWord;
			LOG.debug("apiURL:" + apiURL);
			URL url = new URL(apiURL);

			HttpURLConnection con;

			con = (HttpURLConnection) url.openConnection();
			LOG.debug("con:" + con);
			// Client ID/Client Secret 인증
			con.setRequestMethod("GET");
			con.setRequestProperty("X-Naver-Client-Id", CLIENT_ID);
			con.setRequestProperty("X-Naver-Client-Secret", CLIENT_SECRET);

			LOG.debug("CLIENT_ID:" + CLIENT_ID);
			LOG.debug("CLIENT_SECRET:" + CLIENT_SECRET);
			// 응답코드:200성공
			int responseCode = con.getResponseCode();
			LOG.debug("responseCode:" + responseCode);

			if (200 != responseCode) {
				return (List<Item>) new ArrayList<Item>();
			}
			
			//JAXBContext 생성
			JAXBContext context = JAXBContext.newInstance(Rss.class);
			//Unmarshaller 생성
			Unmarshaller unmarshaller =context.createUnmarshaller();
			
			//XML을 Person Object로 변환
			Rss rss = (Rss) unmarshaller.unmarshal(con.getInputStream());	        
	        
			list = rss.getChannel().getItem();			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (JAXBException e) {
			e.printStackTrace();
		}

		return list;
	}

}
