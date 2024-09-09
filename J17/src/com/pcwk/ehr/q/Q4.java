package com.pcwk.ehr.q;

public class Q4 {

	//src="12345AB12AB345AB",
	//target = "AB"
	public static int count(String src, String target) {
		int count = 0;//찾은 회수
		int pos   = 0;//찾기 시작할 위치
		
		
		
		while(true) {
			//System.out.println("pos:"+pos);
			
			//1.src에서 target을 pos위치 부터 찾기
			pos = src.indexOf(target,pos);
			
			//2. 찾는 값 없으면 -1을 return 한다.
			if(pos != -1) {
				count++;
				pos += target.length();
				//System.out.printf("count:%d \t post:%d%n",count,pos);
			}else {
				break;
			}
			
			
		}
		
		return count;
	}
	public static void main(String[] args) {
		System.out.println(count("12345AB12AB345AB","AB"));
		System.out.println(count("12345","AB"));
	}

}
