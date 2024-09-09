package com.pcwk.ehr.ed01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class R03_SimpleDateFormatter {

	public static void main(String[] args) {
		Date date=new Date();
		
		//날짜 형식
		SimpleDateFormat  dateFormat=new SimpleDateFormat("yyyy/MM/dd");
		System.out.println("yyyy/MM/dd:"+dateFormat.format(date));
		
		//날짜 형식
		SimpleDateFormat  dateFormat02=new SimpleDateFormat("yyyy.MM.dd");
		System.out.println("yyyy.MM.dd:"+dateFormat02.format(date));
		
		//시간
		SimpleDateFormat  dateFormat03=new SimpleDateFormat("HH:mm:ss");
		System.out.println("HH:mm:ss:"+dateFormat03.format(date));
		
		//날짜와 시간
		SimpleDateFormat  dateTimeFormat=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println("yyyy/MM/dd HH:mm:ss=>"+dateTimeFormat.format(date));
	}

}
//yyyy/MM/dd:2024/04/04
//yyyy.MM.dd:2024.04.04
//HH:mm:ss:10:29:00
//yyyy/MM/dd HH:mm:ss=>2024/04/04 10:29:00