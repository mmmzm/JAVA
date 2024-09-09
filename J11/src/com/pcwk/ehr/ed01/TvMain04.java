package com.pcwk.ehr.ed01;

public class TvMain04 {

	public static void main(String[] args) {
		// Tv 클래스를 배열로 선언
		Tv[] tvArray=new Tv[3];//크기가 3인 Tv객체 배열
		
		//Tv배열 객체 생성
		for(int i=0;i<tvArray.length;i++) {
			tvArray[i] = new Tv();
			//인스턴스 변수
			tvArray[i].channel = i+1;
		}
		
		
		//tvArray 배열의 채널 값 출력
		for(int i=0;i<tvArray.length;i++) {
			//메서드
			tvArray[i].channelUp();
			System.out.printf("tvArray[%d].channel=%d%n",i,tvArray[i].channel);
			
		}

	}

}
//tvArray[0].channel=2
//tvArray[1].channel=3
//tvArray[2].channel=4

