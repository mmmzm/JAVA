package com.pcwk.ehr.ed03;

public class R02_Break {

	public static void main(String[] args) {
		int i =0;
		int sum = 0;

		while(true){

			if(sum > 88){
				System.out.println("sum="+sum);
				System.out.println(i);
				break;
			}
			
			++i;
			sum +=i;
		}

	}

}
//sum=91
//13