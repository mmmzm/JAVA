package com.pcwk.ehr.ed02;

import java.util.Arrays;
import java.util.Collection;

public class Q04 {

	public static void main(String[] args) {
		// 정렬하기(sort) : 오름차순(1,2,3...), 내림차순(10,9,8....)
		// int []numArray=new int[10],임이의 값으로 배열 채우기: Math.random()
		// 0 ~ 9

		
	   int []list = {7,4,5,1,3};
	   
	  
	   
	   
	   int n = list.length;
	   
	   System.out.println("Sort전 : "+Arrays.toString(list));
	   Arrays.sort(list);
	   
	   
	   for(int i=0;i<n-1;i++) {
		   
		   for(int j=0;j<n-i-1;j++) {
			   // > : asc
			   // < : desc
			   if(list[j] > list[j+1]) {//앞과 뒤 요소를 비교해 뒤 요소의 값이 크면 자리를 교환한다.
				   int temp = list[j];
				   list[j]  = list[j+1];
				   list[j+1]= temp; 
			   }
		   }//for j
		   System.out.println(i+":"+Arrays.toString(list));
	   }// for i
	   
	   //Sort ASC후 : [1, 3, 4, 5, 7]
	   //Sort DSC후 : [7, 5, 4, 3, 1]
	   System.out.println("Sort ASC후 : "+Arrays.toString(list));	
		
	}

}
//Sort전 : [7, 4, 5, 1, 3]
//0:[4, 5, 1, 3, 7]
//1:[4, 1, 3, 5, 7]
//2:[1, 3, 4, 5, 7]
//3:[1, 3, 4, 5, 7]
//Sort ASC후 : [1, 3, 4, 5, 7]