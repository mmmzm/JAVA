package com.pcwk.ehr.ed02;

import java.util.Arrays;

public class Q5 {

	public static void main(String[] args) {
		// 정렬하기(sort) : 오름차순(1,2,3...), 내림차순(10,9,8....)
		// int []numArray=new int[10],임이의 값으로 배열 채우기: Math.random()
		// 0 ~ 9

//		int []numArray=new int[10];
		
//		for(int i=0;i<numArray.length;i++) {
//			int value=(int)(Math.random()*10);
//			//System.out.println(value);
//			numArray[i] = value;
//		}
//		
//		//초기화 : sort전
//		System.out.println(Arrays.toString(numArray));
		
	   int []list =new int[10];
	   
	   for(int i=0;i<list.length;i++) {
		   int value = (int)(Math.random()*10);
		   list[i]=value;
	   }
	   
	   
	   int n = list.length;
	   
	   System.out.println("Sort전 : "+Arrays.toString(list));
	   
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
//Sort전 : [3, 7, 5, 3, 2, 1, 5, 4, 5, 5]
//0:[3, 5, 3, 2, 1, 5, 4, 5, 5, 7]
//1:[3, 3, 2, 1, 5, 4, 5, 5, 5, 7]
//2:[3, 2, 1, 3, 4, 5, 5, 5, 5, 7]
//3:[2, 1, 3, 3, 4, 5, 5, 5, 5, 7]
//4:[1, 2, 3, 3, 4, 5, 5, 5, 5, 7]
//5:[1, 2, 3, 3, 4, 5, 5, 5, 5, 7]
//6:[1, 2, 3, 3, 4, 5, 5, 5, 5, 7]
//7:[1, 2, 3, 3, 4, 5, 5, 5, 5, 7]
//8:[1, 2, 3, 3, 4, 5, 5, 5, 5, 7]
//Sort ASC후 : [1, 2, 3, 3, 4, 5, 5, 5, 5, 7]