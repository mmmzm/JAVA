package com.pcwk.ehr.q;

public class Q5 {

	
	public static String fillZero(String src, int length) {
		String result ="";
		
		if(src == null || src.length() == length) {
			return  src;
		}else if(length <= 0) {
			return  "";
		}else if(src.length() > length) {
		    return  src.substring(0,length); 	
		}
		
		char ch[]=new char[length];
		for(int i=0;i<ch.length;i++) {
			ch[i]='0';
		}
		//length-src.length()=> 10 - 5
		//src.length() => 5
		System.arraycopy(src.toCharArray(), 0, ch, length-src.length(), src.length());;
		
		return new String(ch);
	}
	
	
	public static void main(String[] args) {
		String src = "12345";
		System.out.println(fillZero(src,10));
		System.out.println("-1>"+fillZero(src,-1));
		System.out.println("3>"+fillZero(src,3));

	}

}
