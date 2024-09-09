package com.pcwk.ehr.ed01;

public class R02_StringHex {

	public static void main(String[] args) {
		char [] hex = {'C','A','F','E','2'};//16진수
		
		String [] binary = {//2진수
				 "0000"
				,"0001"
				,"0010"
				,"0011"
				,"0100"
				,"0101"
				,"0110"
				,"0111"
				,"1000"
				,"1001"
				,"1010"
				,"1011"
				,"1100"
				,"1101"
				,"1110"
				,"1111"				
				
		};
		
		String result = "";
		
		for(int i=0;i<hex.length;i++) {
			
			if('A'<= hex[i] && hex[i]<='Z') {//영문 대문자
				System.out.println(hex[i]+","+(hex[i] - 'A'+10));
				
				result+=binary[hex[i] - 'A'+10]+",";
			}else if('0'<=hex[i] && hex[i]<='9') {//숫자
				//hex[i]-'0'=> '2' - '0'
				System.out.println(hex[i]+","+(hex[i]-'0'));//
				result +=binary[hex[i]-'0'];
			}
			
			
		}
		
		System.out.println("result:"+result);
		
	}

}
//C,12
//A,10
//F,15
//E,14
//2,2
//result:1100,1010,1111,1110,0010













