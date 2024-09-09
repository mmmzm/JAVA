package com.pcwk.ehr.ed01;

public class R01_LogicalOperators {

	public static void main(String[] args) {
		int   x = 0;
		char ch = ' ';
		
		//x는 10보다 크고 20보다 작다.
		x = 12;
		
		//x=12 	 (10<x && x<20=true )
		System.out.printf("x=[%3d] \t (10<x && x<20=%b)%n",x,(10<x && x<20) );
				
		x = 9;
		//2의배수 또는 3의 배수이다.
		//형식문자열에 %사용은 : %% -> %
		//x=[9  ] 	 (x % 2 == 0 || x % 3 ==0 =>true)  
		System.out.printf("x=[%-3d] \t (x %% 2 == 0 || x %% 3 ==0 =>%b)  %n",x,(x % 2 == 0 || x % 3 == 0) );

		
		//문자 ch는 숫자(’0’ ~ ‘9’)
		ch = '2';
		System.out.printf("ch=[%-2c] \t ('0'<=ch && ch<='9' => %b) \n",ch,('0'<=ch && ch<='9'));
		
	}

}
//x=[ 12] 	 (10<x && x<20=true)
//x=[9  ] 	 (x % 2 == 0 || x % 3 ==0 =>true)  
//ch=[2 ] 	 ('0'<=ch && ch<='9' => true) 
