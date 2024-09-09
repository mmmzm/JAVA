package com.pcwk.ehr.q;

public class Q3 {

	public static void printGraph(int[] dataArr, char ch) {
		for(int i=0;i<dataArr.length;i++) {
			
			for(int j=0;j<dataArr[i];j++) {
				System.out.print(ch);
			}
			System.out.println(dataArr[i]);
		}
	}
	
	public static void main(String[] args) {
		printGraph(new int[] {13,15,18},'*');

	}

}
//*************13
//***************15
//******************18
