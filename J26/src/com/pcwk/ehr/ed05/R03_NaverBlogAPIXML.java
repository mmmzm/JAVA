package com.pcwk.ehr.ed05;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;
import java.rmi.server.UID;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.google.gson.*;
import com.pcwk.ehr.cmn.PLog;
import com.pcwk.ehr.ed01.Person;


public class R03_NaverBlogAPIXML implements PLog{

	public static void main(String[] args) throws JAXBException {
		// 1. naver web인증
		// 2. 검색어: UTF-8
		// 3. JSON형태로 받기
		
		
		//1.
		String clientId     = "RdE_bXTW7WIONQD4DJzY";
		String clientSecret = "HQ9cCupePs";
		
        String apiURL       = "https://openapi.naver.com/v1/search/blog.xml?query=";
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
	        

			JAXBContext  jc = JAXBContext.newInstance(Rss.class);
			Unmarshaller us= jc.createUnmarshaller();;
			 Rss rss=(Rss)us.unmarshal(con.getInputStream());
	        List<Item> list=rss.getChannel().getItem();     
	        
//	        
	        for(Item item :list) {
	        	LOG.debug(item.toString());
	        }
	        
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

        
	}//main
	
	//함수이름: readBody
	//파람 : InputSream
	//return :String
	
	public static String readBody(InputStream  is) {
		StringBuilder sb=new StringBuilder(1000);
		try(BufferedReader br =new BufferedReader(new InputStreamReader(is));
			BufferedWriter bw =new BufferedWriter(new FileWriter("naverBlog.xml"))	
				){
			String inputData = "";
			
			while( (inputData=br.readLine()) !=null) {
				sb.append(inputData+"\n");
				bw.write(inputData);
				LOG.debug(inputData+"\n");
			}
			
			


			bw.close();
		}catch(IOException e) {
			LOG.debug("IOException:"+e.getMessage());
			e.printStackTrace();
		}
		
		return sb.toString();
	}
	
	
	
	

}
//(R03_NaverBlogAPI.java:79) - Item [title=<b>홍대</b> 미도인(味道人) 스테이크 덥밥 <b>맛집</b> ✨, link=https://blog.naver.com/bells231/223404868285, description=보단, <b>홍대 맛집</b>을 검색했을 때 빨리 뜨는 곳이라 가게 되었는데, 인테리어가 괜찮았거든요! 여러명이... 홍대에 가실일이 있다면, 또는 맛집 식당을 찾아 가는걸 좋아한다면 기꺼이 추천하고 싶은 그런... , bloggername=Yeong Ju's Cafeteria, bloggerlink=blog.naver.com/bells231, postdate=20240403]
//(R03_NaverBlogAPI.java:79) - Item [title=<b>홍대</b>덮밥 <b>맛집</b> 테즈쿠리, link=https://blog.naver.com/sunslifeis/223410042925, description=테이블도 많고, 일식당답게 깔끔하고 차분한 분위기가 음식의 격을 한층 높여주는 홍대 가성비 맛집... 외부에서 바로 입장 가능한 계단 <b>홍대맛집</b> 테즈쿠리 입구로 들어가 보도록 하겠습니다. 내부 전경... , bloggername=Sun’s Life Is♡, bloggerlink=blog.naver.com/sunslifeis, postdate=20240409]
//(R03_NaverBlogAPI.java:79) - Item [title=[<b>홍대 맛집</b>] 홍대 초밥 오마카세 오사이초밥 홍대점, link=https://blog.naver.com/richjenn7/223406525564, description=<b>홍대</b> 오마카세 초밥 <b>맛집</b> 오사이초밥 <b>홍대</b>점 1. 위치&amp;영업시간 주소 : 서울특별시 마포구 연희로1길 11 2층 ☎️ : 02-332-5425 영업시간 : 예약제 ❤️평일 런치, 점심 - 1부(12시), 2부(1시), 3부(2시)❤️ [45분가량 식사]... , bloggername=져니공간, bloggerlink=blog.naver.com/richjenn7, postdate=20240405]
//(R03_NaverBlogAPI.java:79) - Item [title=<b>홍대 맛집</b> 수림식당 : 홍대 탄탄면 가지만두 새우완탕면, link=https://blog.naver.com/izziy/223403814739, description=#<b>홍대 맛집</b> #상수 맛집 #홍대 탄탄면 #홍대 점심 #탄탄면 맛집 예전에 홍대 건프라 있을 때 자주 가던 쪽에 아더스페이스 플래스쉽이 있는데 그 바로 앞에 홍대 탄탄면 가게가 있다. 수림식당 홍대점 대만 여행할... , bloggername=Hello, Stranger, bloggerlink=blog.naver.com/izziy, postdate=20240402]
//(R03_NaverBlogAPI.java:79) - Item [title=[연남동 빵집] 인생 마늘빵을 파는 줄서는 <b>홍대 맛집</b> 만동제과, link=https://blog.naver.com/khing311/223413636610, description=연남동 빵집 <b>홍대 맛집</b>/ 홍대 빵집 만동제과 주소 : 서울 서대문구 창천동 448 전화번호 : 02-6489-2334... 빵 만동제과 만동제과의 본점은 강릉에 있는데, 빵지순례맛집으로 유명하고, 특히 마늘빵이 맛있다고... , bloggername=초코맘의 불굴의 육아여행기, bloggerlink=blog.naver.com/khing311, postdate=20240412]
//(R03_NaverBlogAPI.java:79) - Item [title=<b>홍대</b> 근처 <b>맛집</b> 추천! 육회 탐라육해, link=https://blog.naver.com/dan-a_a/223398167205, description=육회 좋아하는 분들이라면 맛도리 보장하는 <b>홍대 맛집</b> 추천입니다❤ 탐라육해는 기존 홍대 육회 맛집과 메뉴 구성이나 주문방식부터 차별화된 독특한 <b>홍대 맛집</b>이었습니다. 육회, 홍대 연어, 참치, 해산물을... , bloggername=투어리스트 김단아, bloggerlink=blog.naver.com/dan-a_a, postdate=20240328]
//(R03_NaverBlogAPI.java:79) - Item [title=[마포] <b>홍대</b>/합정 이양권반상 <b>맛집</b> 추천, link=https://blog.naver.com/486minaya/223411388249, description=이양권반상 홍대점 ️ 주소 : 서울 마포구 와우산로29다길 10 (서교동) ⏰ 영업시간 : 11:00 ~ 21:00 (L.O : 20:30) 홍대에 위치한 맛집 이양권 반상 소개할께요! #<b>홍대맛집</b> 이라 소개하지만 이양권 반상은 4/21까지만... , bloggername=마포 / 여의도 위킹맘 라이프, bloggerlink=blog.naver.com/486minaya, postdate=20240410]
//(R03_NaverBlogAPI.java:79) - Item [title=<b>홍대</b> 고기집 추억의 냉삼겹살 <b>맛집</b> 88로타리집, link=https://blog.naver.com/jjumi1020/223413819647, description=홍대에 가서 고기가 땡긴다면 다양한 소스와 푸짐한 상차림을 더해 더욱 맛있는 고기를 먹을 수 있는곳 홍대 고기집 추억의 냉삼겹살 맛집인 88로타리집 홍대점을 추천해 본다. #<b>홍대맛집</b> #홍대삼겹살... , bloggername=감정의 교차점, bloggerlink=blog.naver.com/jjumi1020, postdate=20240412]
//(R03_NaverBlogAPI.java:79) - Item [title=홍대 조개구이 하와이조개 <b>홍대 맛집</b>, link=https://blog.naver.com/as06123/223403819495, description=스낵면으로 먹었는데 빨리 익어서 좋았어요 ㅋㅋㅋㅋㅋ 개인적으로 스낵면 추천드립니당 !!! ㅎㅎㅎㅎㅎ <b>홍대</b> 한복판에서 <b>홍대</b> 조개구이 먹기 성공적 ~~~ 다음번엔 또 다른 <b>맛집</b> 찾아 가보겠습니다 ~~!!, bloggername=Enjoy your life, bloggerlink=blog.naver.com/as06123, postdate=20240402]
//(R03_NaverBlogAPI.java:79) - Item [title=[<b>홍대</b>/연남동] 홍콩 중식당 추천 <b>맛집</b>! 내돈내산 찐리뷰! 고덕, link=https://blog.naver.com/yuj1203/223399392208, description=다음에는 한번 북경오리도 먹으러 방문해보고 싶답니다ㅎㅎㅎ (ෆ&gt;ᴗ&lt;ෆ) 위치 서울 마포구 동교로27길 61 1층 #연남동맛집 #홍대입구맛집 #<b>홍대맛집</b> #연남맛집 #홍대연남맛집 #고덕 #홍대고덕 #연남동고덕... , bloggername=유우띠로그, bloggerlink=blog.naver.com/yuj1203, postdate=20240329]
