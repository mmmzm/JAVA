package com.pcwk.ehr.ed07;

public class CaptionTvMain {

	public static void main(String[] args) {
		CaptionTv captionTv=new CaptionTv();
		captionTv.channel = 3;//Tv channel설정
		
		captionTv.channelUp();
		
		System.out.println("channel:"+captionTv.channel);
		
		
		captionTv.display("Hello, world!");//출력:X
		captionTv.caption = true;
		//Hello, world!!!
		captionTv.display("Hello, world!!!");
	}

}
//channel:4
//Hello, world!!!

