package com.pcwk.ehr.ed02;

public class Ex01 {
	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A' 65
		//3<<33
		System.out.println( (1+x)<<33);//+,shift연산자 보다 높다,6
		
		//true||(false && false)
		//true|| false
		//true
		System.out.println(y>=5 || ( x<0 && x > 2) );//true
		
		//y= y + (10-x++)
		//(10-x++) -> (10-2) -> 8
		//y = y + 8;
		System.out.println(y+=10 - x++);//13
		//x=3
		
		//x = x+2
		System.out.println(x+=2);//5
		
		//!(true && true)
		//!(true)
		//false
		System.out.println(!('A'<=c && c<='Z'));//false
		
		//67-65
		System.out.println('C' -c);//2
		//53 - 48
		System.out.println('5'-'0');//5
		//char + int
		//int(65)  + int(1)
		System.out.println(c+1);//66
		
		//B
		System.out.println(++c);
		
		System.out.println(c++);//B
		System.out.println(c);//C
	}
}
