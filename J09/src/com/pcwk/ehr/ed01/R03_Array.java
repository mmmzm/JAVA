package com.pcwk.ehr.ed01;

import java.util.Arrays;

public class R03_Array {

	public static void main(String[] args) {
		//배열의 복사: 기존 배열의 2배로 복사
		//
		int []nums = { 13,15,18,48,52};					
		int []numCopy = new int[nums.length*2];
		
		//numCopy:[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
		System.out.println("numCopy:"+Arrays.toString(numCopy));
		//nums -> numCopy 값을 복사
		for(int i=0;i<nums.length;i++) {
			numCopy[i] = nums[i];
		}
		
		//옯겨온 데이터 확인
		//nums:[13, 15, 18, 48, 52]
		System.out.println("nums:"+Arrays.toString(nums));
		//numCopy:[13, 15, 18, 48, 52, 0, 0, 0, 0, 0]
		System.out.println("numCopy:"+Arrays.toString(numCopy));
		
		//nums -> numCopy 주소병경
		nums = numCopy;
		//nums:[13, 15, 18, 48, 52, 0, 0, 0, 0, 0]
		System.out.println("nums:"+Arrays.toString(nums));

	}

}
