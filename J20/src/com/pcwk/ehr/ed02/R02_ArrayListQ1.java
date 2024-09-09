package com.pcwk.ehr.ed02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class R02_ArrayListQ1 {
	/**
	 * List내용을 순회하면서 모든 요소 출력!
	 * @param list
	 */
	public static void disp(List list) {
		//순서보장
		for( int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}		
	}
	
	
	
	public static void main(String[] args) {
		// 5명에 사람 이름을 입력 받아 ArrayList에 저장후 이들중 ‘김’ 씨 성을 가진 사람을 모두 출력하세요
		// 김현석, 이상무, 김승준, 박민상, 임강혁 입력 받기
		// 1. 5명 입력: Scanner
		// 2. ArrayList에 저장
		// 3. 데이터 순회하면처 김씨성을 가진 사람 찾기
		
		List nameList=new ArrayList();
		
		
		Scanner scanner=new Scanner(System.in);
		while(nameList.size() !=5) {
			System.out.print("이름을 입력 하세요>");
			String name = scanner.nextLine();
			
			nameList.add(name);
			System.out.println("입력 인원수:"+nameList.size());
		}
		//순서 보장
		disp(nameList);
		
		
		//김씨성을 가진 사람 찾기
		int cnt = 0;
		
		for(int i=0;i<nameList.size();i++ ) {
			//데이터 조회
			String name = (String) nameList.get(i);
			
			//이름 중 김씨 성을 가진 사람
			if(true == name.startsWith("김")) {
				cnt++;
				System.out.println(name+" 인원수:"+cnt);
			}
			
		}
		
		System.out.println("김씨 성을 가진 사람은 "+cnt+"명 입니다.");
		scanner.close();
	}

}
