package com.pcwk.ehr.ed01;

public class R06_StringFunction {

	public static void main(String[] args) {
		String str = "ABCDE";
		
		//char charAt(int index)	
		//문자열에서 해당위치(index)에 있는 문자를 반환한다.
		char ch = str.charAt(3);
		//str.charAt(3):D
		System.out.println("str.charAt(3):"+ch);

		
		//String substring(int from, int to)	
		//문자열에서 해당범위(from≤ ~ < to)에 있는 문자열을 반환
		String result =str.substring(1, 4);
		System.out.println("result:"+result);
		
		//char[] -> String으로
		
		char[] chArray = {'S','P','R','I','N','G'};
		String resultString=new String(chArray);
		System.out.println("resultString:"+resultString);
		
		//String -> char[]
		char[] tmpChar =resultString.toCharArray();
		for(int i=0;i<tmpChar.length;i++) {
			System.out.printf("tmpChar[%d]=%c%n",i,tmpChar[i]);
		}

	}

}
//str.charAt(3):D
//result:BCD
//resultString:SPRING
//tmpChar[0]=S
//tmpChar[1]=P
//tmpChar[2]=R
//tmpChar[3]=I
//tmpChar[4]=N
//tmpChar[5]=G

