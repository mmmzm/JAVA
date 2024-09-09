package com.pcwk.ehr.ed01;

public class TvMain03 {

	public static void main(String[] args) {
		//tv01,tv02 인스턴스 변수는 서로 다른 메모리 공간을 사용, 영향을 미치지 않는다.
		Tv tv01=new Tv();//0x100
		Tv tv02=new Tv();//0x200
		System.out.println("tv01:"+tv01);//tv01:com.pcwk.ehr.ed01.Tv@15db9742
		System.out.println("tv02:"+tv02);//tv02:com.pcwk.ehr.ed01.Tv@6d06d69c
		
		//멤버 변수 배열 초기화 데이터 타입의 초기값으로 초기화!
		System.out.println("tv01의 channel 값:"+tv01.channel);
		System.out.println("tv02의 channel 값:"+tv02.channel);
		
		tv01 = tv02;//0x100을 공유
		
		tv01.channel = 3;
		System.out.println("tv01.channel의 값 변경: 3");
		System.out.println("----------------------");
		System.out.println("tv01의 channel 값:"+tv01.channel);
		System.out.println("tv02의 channel 값:"+tv02.channel);
		
	}

}
//tv01:com.pcwk.ehr.ed01.Tv@15db9742
//tv02:com.pcwk.ehr.ed01.Tv@6d06d69c
//tv01의 channel 값:0
//tv02의 channel 값:0
//tv01.channel의 값 변경: 3
//----------------------
//tv01의 channel 값:3
//tv02의 channel 값:3