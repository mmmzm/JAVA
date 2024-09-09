package com.pcwk.ehr.ed03;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;


public class R05_Collections {

	public static void main(String[] args) {
		//정렬
		List<Integer>   ages = new ArrayList<Integer>();
		ages.add(18);
		ages.add(13);
		ages.add(15);
		ages.add(51);
		ages.add(47);
		

		//리스트 정렬
		
		System.out.println(ages);
		
		
		System.out.println("리스트 정렬");
		Collections.sort(ages);//ASC
		System.out.println(ages);
		
		//이진 탐색으로 요소 찾기: sort() ASC된 상태에서 수행 가능
		int target = 19;
		int index = Collections.binarySearch(ages, target);
		if(index>=0) {
			System.out.println(target+" found at index "+index);
		}else {
			System.out.println(target+" 없음! "+index);
		}
		
		System.out.println("-------------------------------------------------");
		//최대값, 최소값
		Collections.sort(ages);
		System.out.println("최소값:"+Collections.min(ages));
		System.out.println("최대값:"+Collections.max(ages));
		
		//리스트 뒤집기
		Collections.reverse(ages);
		System.out.println("리스트 뒤집기:"+ages);

		//요소 섞기
		Collections.shuffle(ages);
		System.out.println("요소 섞기:"+ages);
		
		//Collection동기화
		Collections.synchronizedList(ages);
		System.out.println("Collection동기화:"+ages);
	}

}
//[18, 13, 15, 51, 47]
//리스트 정렬
//[13, 15, 18, 47, 51]
//19 없음! -4
//-------------------------------------------------
//최소값:13
//최대값:51
//리스트 뒤집기:[51, 47, 18, 15, 13]
//요소 섞기:[51, 47, 18, 15, 13]
//Collection동기화:[51, 47, 18, 15, 13]
