package com.pcwk.ehr.ed06;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class HtmlParsing {

	static final String T_URL           = "http://www.cgv.co.kr/movies/?lt=1&ft=0";
	static final int   VIEW_MOVIES      = 7;
			
	public static void main(String[] args) {
		
		try { 
			
			Document  doc = Jsoup.connect(T_URL).get();//읽을 웹 페이지 text
		    
			//System.out.println(doc.toString());
			// . : html.stylesheet
		    //div:html, box-contents :stylesheet,
			//' ':다른 html 태그
			//strong.title :<strong class="title">댓글부대</strong>
			Elements titles = doc.select("div.box-contents strong.title");//제목들
			
			Elements reRates = doc.select("div.score strong span");//예매율
			
			//포스터
			Elements posters = doc.select("div.box-image span.thumb-image img");
			
			for(int i=0;i<VIEW_MOVIES;i++) {
				Element titleElement=titles.get(i);
				Element rate = reRates.get(i);
				//<img src="https://img.cgv.co.kr/Movie/Thumbnail/Poster/000088/88077/88077_320.jpg" alt="댓글부대 포스터" onerror="errorImage(this)">
				String posterURL = posters.get(i).attr("src");//img 태그 내의 src 속성을 추출
				
				System.out.println((i+1)+"."+titleElement.text()+
						"\t\t\t 예매율:"+rate.text()+
						"\t\t\t 포스터:"+posterURL
						);
			}
			
		}catch(IOException e) {
			System.out.println("----------------------------------------------");
			System.out.println("IOException--"+e.getMessage());
			System.out.println("----------------------------------------------");
		}
		
		System.out.println("----------------------------------------------");
		System.out.println("프로그램 종료");
		System.out.println("----------------------------------------------");		

	}

}
//1.댓글부대			 예매율:16.7%			 포스터:https://img.cgv.co.kr/Movie/Thumbnail/Poster/000088/88077/88077_320.jpg
//2.고질라 X 콩-뉴 엠파이어			 예매율:16.5%			 포스터:https://img.cgv.co.kr/Movie/Thumbnail/Poster/000088/88135/88135_320.jpg
//3.듄-파트2			 예매율:14.1%			 포스터:https://img.cgv.co.kr/Movie/Thumbnail/Poster/000087/87947/87947_320.jpg
//4.슈가│어거스트 디 투어 ‘디-데이’ 더 무비			 예매율:12.8%			 포스터:https://img.cgv.co.kr/Movie/Thumbnail/Poster/000088/88110/88110_320.jpg
//5.파묘			 예매율:8.9%			 포스터:https://img.cgv.co.kr/Movie/Thumbnail/Poster/000088/88012/88012_320.jpg
//6.유미의 세포들 더 무비			 예매율:4.8%			 포스터:https://img.cgv.co.kr/Movie/Thumbnail/Poster/000088/88092/88092_320.jpg
//7.기동전사 건담 시드 프리덤			 예매율:4.2%			 포스터:https://img.cgv.co.kr/Movie/Thumbnail/Poster/000088/88086/88086_320.jpg
//----------------------------------------------
//프로그램 종료
//----------------------------------------------
