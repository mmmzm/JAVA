package com.pcwk.ehr.ed01;

import java.util.Arrays;

public class R04_ArrayCopy {

	public static void main(String[] args) {
		//srcArray를 destArray로 복사
		int []srcArray = {1,2,3,4,5};
		int []destArray = {0,0,0,0,0};
		
		
		System.out.println("Copy전");
		System.out.println(Arrays.toString(srcArray));
		System.out.println(Arrays.toString(destArray));
		System.out.println("──────────────────────────────────────────────────");
		
		//배열 copy
		System.arraycopy(srcArray, 0, destArray, 0, srcArray.length);
		System.out.println("Copy이후");
		System.out.println(Arrays.toString(srcArray));
		System.out.println(Arrays.toString(destArray));
		System.out.println("──────────────────────────────────────────────────");
		//destArray: 0으로 초기화
		for(int i=0;i<destArray.length;i++) {
			destArray[i] = 0;
		}
		//일부만 복사
		System.out.println(Arrays.toString(destArray));//[0, 0, 0, 0, 0]
		
		//srcArray배열을 배열 인덱스 2번 부터, 복사는 3개 한다.
		//destArray배열에 배열 인덱스 2번 부터,  
		System.arraycopy(srcArray, 2, destArray, 2, 3);
		System.out.println(Arrays.toString(destArray));
			
	}

}
//Copy전
//[1, 2, 3, 4, 5]
//[0, 0, 0, 0, 0]
//──────────────────────────────────────────────────
//Copy이후
//[1, 2, 3, 4, 5]
//[1, 2, 3, 4, 5]
//──────────────────────────────────────────────────
//[0, 0, 0, 0, 0]
//[0, 0, 3, 4, 5]
