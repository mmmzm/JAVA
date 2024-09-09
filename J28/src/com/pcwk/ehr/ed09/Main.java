package com.pcwk.ehr.ed09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.google.gson.Gson;
import com.pcwk.ehr.cmn.PLog;
import com.pcwk.ehr.ed08.Person;


public class Main implements PLog {

	
	
	
	public static void main(String[] args) {
		// 1. naver web인증
		// 2. 검색어: UTF-8
		// 3. XML형태로 받기
		
		
		//1.
		String clientId     = "RdE_bXTW7WIONQD4DJzY";
		String clientSecret = "HQ9cCupePs";
		//https://openapi.naver.com/v1/search/blog.xml	
        String apiURL       = "https://openapi.naver.com/v1/search/blog.xml?display=10&query=";
        //인증 없이 요청:
//        {
//        	  "errorMessage": "/v1/search/blog.json : Bad Request. (Check Extension or Required Parameter)",
//        	  "errorCode": "400"
//        }      
        
        String searchWord = "";//검색어
        
        if(args.length !=1) {
        	LOG.debug("검색어를 입력 하세요.");
        	System.exit(0);
        }
        
        
        
        try {
			searchWord = URLEncoder.encode(args[0], "UTF-8") ;
			apiURL += searchWord;
			
	        LOG.debug("searchWord:"+searchWord);
	        //apiURL:https://openapi.naver.com/v1/search/blog.json?query=%ED%99%8D%EB%8C%80
	        LOG.debug("apiURL:"+apiURL);
	        //Naver인증 요청
	        URL url=new URL(apiURL);
	        
	        HttpURLConnection con= (HttpURLConnection) url.openConnection();
			//Client ID/Client Secret 인증
	        con.setRequestMethod("GET");
	        con.setRequestProperty("X-Naver-Client-Id", clientId);
	        con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
	        
	        //응답코드:200성공
	        int responseCode = con.getResponseCode();
	        LOG.debug("responseCode:"+responseCode);
	        
	        if(200 == responseCode) {
	        	
	        }else {
	        	LOG.debug("접속실패 responseCode:"+responseCode);
	        }
	        
	        //String retString = readBody(con.getInputStream());
	        
	        //LOG.debug(retString);
			//JAXBContext 생성
			JAXBContext context = JAXBContext.newInstance(Rss.class);
			//Unmarshaller 생성
			Unmarshaller unmarshaller =context.createUnmarshaller();
			
			//XML을 Person Object로 변환
			Rss rss = (Rss) unmarshaller.unmarshal(con.getInputStream());	        
	        
			List<Item> list = rss.getChannel().getItem();	
	        
			for(Item item :list) {
				LOG.debug(item.toString());
			}
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (JAXBException e) {
			e.printStackTrace();
		}

        
	}//main
	
	//함수이름: readBody
	//파람 : InputSream
	//return :String
	
	public static String readBody(InputStream  is) {
		StringBuilder sb=new StringBuilder(1000);
		
		try(BufferedReader br =new BufferedReader(new InputStreamReader(is));){
			String inputData = "";
			
			while( (inputData=br.readLine()) !=null) {
				sb.append(inputData+"\n");
			}
			
			//LOG.debug(sb.toString());
			
		}catch(IOException e) {
			LOG.debug("IOException:"+e.getMessage());
			e.printStackTrace();
		}
		
		return sb.toString();
	}
	
	
	
	

}
