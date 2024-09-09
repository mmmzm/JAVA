package com.pcwk.ehr.ed02;
import java.util.*;

public class R01_ArrayList {

	public static void disp(List list) {
		//순서보장
		for( int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}		
	}
	
	public static void main(String[] args) {
		//12개의 저장공간 확보
		ArrayList  list=new ArrayList(12);
		
		
		//요소 추가
		list.add("Apple");
		list.add("Pear");
		list.add("Banana");
		list.add("Apple"); //데이터 중복 허용
		
		System.out.println("list.size():"+list.size());
		disp(list);
		
		//요소수정
		list.set(1, "Watermelon");
		System.out.println("요소 변경========================");
		disp(list);

		//요소 존재 여부
		if(true==list.contains("Apple!")) {
			System.out.println("Apple이 있어요");
		}else {
			System.out.println("Apple이 없습니다.");
		}
		
		
		//sort
		Collections.sort(list);
		
		
		System.out.println("Sort이후=====================");
		disp(list);
		
		
	}

}
//list.size():4
//Apple
//Pear
//Banana
//Apple
//요소 변경========================
//Apple
//Watermelon
//Banana
//Apple
//Apple이 없습니다.
//Sort이후=====================
//Apple
//Apple
//Banana
//Watermelon
