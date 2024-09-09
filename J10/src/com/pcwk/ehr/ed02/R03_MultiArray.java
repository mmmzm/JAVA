package com.pcwk.ehr.ed02;

public class R03_MultiArray {

	public static void main(String[] args) {
		//가변 배열
		int [][]varArray=new int[3][];
		
		varArray[0] = new int[] {1,2,3};
		varArray[1] = new int[] {4,5};
		varArray[2] = new int[] {6,7,8,9};
		
		//가변 배열의 각요소 출력
		for(int i=0;i<varArray.length;i++) {
			
			for(int j=0;j<varArray[i].length;j++) {
				System.out.printf("[%d][%d]=%d, ",i,j,varArray[i][j]);
			}
			System.out.println();
		}

	}

}
//[0][0]=1, [0][1]=2, [0][2]=3, 
//[1][0]=4, [1][1]=5, 
//[2][0]=6, [2][1]=7, [2][2]=8, [2][3]=9, 