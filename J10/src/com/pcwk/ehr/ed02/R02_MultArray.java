package com.pcwk.ehr.ed02;

public class R02_MultArray {

	public static void main(String[] args) {
		//5행3열
		int [][]score = { 
				 {100,100,100}
				,{20 ,20 , 20}
				,{30 ,30 , 30}
				,{40 ,40 , 40}
				,{50 ,50 , 50}
			};

		//과목별 총점
		int korTotal  = 0;//국어
		int engTotal  = 0;//영어
		int mathTotal = 0;//수학
		
		//국어	영어	수학	총점	평균
		String space = "     ";
		System.out.printf(" 번호%s 국어%s영어%s수학%s총점%s평균%s\n",space,space,
				                                            space,space,space,space);
		System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
		for(int i=0;i<score.length;i++) {//행(5)
			int    sum = 0;   //개인별 총점
			double avg = 0.0d;//개인별 평균
			
			korTotal += score[i][0];
			engTotal += score[i][1];
			mathTotal += score[i][2];
			
			//행(번호)
			System.out.printf("%5d",i+1);
			for(int j=0;j<score[i].length;j++) {//열(3)
				sum += score[i][j];//개인별 총점
				System.out.printf("%5d",score[i][j]);
			}//for j(열)
			avg = sum / (score[i].length * 1.0d);
			System.out.printf(" %5d  %5.1f%n",sum,avg);
		}//for i(행)
		
		System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
		System.out.printf("총점 : %5d%5d%5d \n",korTotal,engTotal,mathTotal);
	}//--main

}//--class
//번호      국어     영어     수학     총점     평균     
//〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓
//   1  100  100  100   300  100.0
//   2   20   20   20    60   20.0
//   3   30   30   30    90   30.0
//   4   40   40   40   120   40.0
//   5   50   50   50   150   50.0
//〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓
//총점 :   240  240  240 

