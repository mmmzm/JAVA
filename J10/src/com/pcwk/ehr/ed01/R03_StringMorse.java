package com.pcwk.ehr.ed01;

public class R03_StringMorse {

	public static void main(String[] args) {
		String source = "SOSHELP9";
		
		String []morse = {
				".-"    //A morse[0]
				,"-..."
				,"-.-."
				,"-.."
				,"."
				,"..-."
				,"--."
				,"...."
				,".."
				,".---"
				,"-.-"
				,".-.."
				,"--"
				,"-."
				,"---"
				,".--."
				,"--.-"
				,".-."
				,"..."
				,"-"
				,"..-"
				,"...-"
				,".--"
				,"-..-"
				,"-.--"
				,"--.."  //Z morse[25]
				,"-----" //0 morse[26]
				,".----" //1
				,"..---" //2
				,"...--"
				,"....-"
				,"....."
				,"-...."
				,"--..."
				,"---.."
				,"----." //9				
				
		};
		
		System.out.println("source.length():"+source.length());
		
		String result = "";
		
		System.out.println("source:"+source);
		for(int i=0;i<source.length();i++) {
			char ch = source.charAt(i);
			//System.out.printf("%c ",ch);
			//A에 배열위치 : morse[0]
			//0에 배열위치 : morse[26]
			
			if('A'<=ch && ch<='Z') {//알파벳 이면
				//System.out.printf("%c%n",ch);
				
				result += morse[(ch - 'A')]+" ";
				//System.out.println(ch+","+(ch - 'A')+","+result);
			}else if('0'<=ch && ch<='9') {
				//System.out.printf("%c%n",ch);
				//System.out.println((ch - '0')+26);
				result += morse[((ch - '0')+26)]+" ";
			}
			
		}
		
		System.out.println("result:"+result);
		
	}//--main 
}//--class













