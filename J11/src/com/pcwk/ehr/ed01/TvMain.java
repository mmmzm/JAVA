package com.pcwk.ehr.ed01;

public class TvMain {

	public static void main(String[] args) {
		Tv tv01;//Tv인스턴스를 참조하기 위한 변수 tv01선언
		
		tv01=new Tv();//Tv 인스턴스를 생성한후, Tv인스턴스의 주소를 tv01 저장.
		
		//"."연산자
		//멤버변수 상태값 할당
		tv01.power   = true;
		tv01.channel = 3;
		
		//멤버변수 할당 값 다루기
		System.out.printf("전원:%b \t 채널:%d%n",tv01.power,tv01.channel);
		
		//"."연산자
		//메서드
		tv01.channelUp();
		System.out.printf("전원:%b \t 채널:%d%n",tv01.power,tv01.channel);
	}

}
