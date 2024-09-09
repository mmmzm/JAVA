package com.pcwk.ehr.ed02;

public class R01_MultArray {

	public static void main(String[] args) {
		int [][]score = { 
				 {100	,100,100}
				,{20	,20	, 20}
				,{30	,30	, 30}
				,{40	,40	, 40}
				,{50	,50	, 50}
			};
		
		System.out.println("행:"+score.length);
		System.out.println("열:"+score[0].length);
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[0].length;j++) {
				System.out.printf("score[%d][%d]=%3d ",i,j,score[i][j]);
			}
			System.out.println();
		}

	}

}
//행:5
//열:3
//score[0][0]=100 score[0][1]=100 score[0][2]=100 
//score[1][0]= 20 score[1][1]= 20 score[1][2]= 20 
//score[2][0]= 30 score[2][1]= 30 score[2][2]= 30 
//score[3][0]= 40 score[3][1]= 40 score[3][2]= 40 
//score[4][0]= 50 score[4][1]= 50 score[4][2]= 50 
