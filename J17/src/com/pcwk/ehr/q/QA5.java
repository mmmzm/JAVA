package com.pcwk.ehr.q;

public class QA5 {

	public static String fillZero(String src, int length) {
		System.out.printf("src=%s, length=%d\n",src,length);
		if(null == src || src.length() == length ) {
			return src;
		}else if(length <=0) {
			return "";
		}else if(src.length() > length) {
			return src.substring(0, length);
		}
		
		char ch[]=new char[length];
		
		for(int i=0;i<ch.length;i++) {
			ch[i]='0';
		}
		//src:['1']['2']['3']['4']['5'],
		//ch :['0']['0']['0']['0']['0']['0']['0']['0']['0']['0']
		//==> ['0']['0']['0']['0']['0']['1']['2']['3']['4']['5']
		//length -src.length() => 5
		//src.length() =>
		System.arraycopy(src.toCharArray(), 0, ch, length -src.length(), src.length());
		
		return new String(ch);
	}
	
	public static void main(String[] args) {
		String src = "12345";
		System.out.println("1>"+fillZero(src,10));
		System.out.println("2>"+fillZero(src,-1));
		System.out.println("3>"+fillZero(src,3));

	}

}
//src=12345, length=10
//1>0000012345
//src=12345, length=-1
//2>||
//src=12345, length=3
//3>123
