package com.pcwk.ehr.ed08;

public class Main {

	public static void main(String[] args) {
		Box<String> stringBox =new Box<String>();
		

		//String
		stringBox.setContent("오늘은 즐거운 투표 전날!");
		
		
		//casting
		String content = stringBox.getContent();
		System.out.println("content:"+content);

		
		//Integer Box
		Box<Integer> intBox =new Box<Integer>();
		intBox.setContent(410);
		
		System.out.println("content:"+intBox.getContent());
		
	}

}
//content:오늘은 즐거운 투표 전날!
//content:410