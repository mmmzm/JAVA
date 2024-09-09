package com.pcwk.ehr.ed05;

import com.pcwk.ehr.cmn.PLog;

public class R01_StringBuilder {

	public static void main(String[] args) {
		//thread unsafe : 속도는 빠르다.
		StringBuilder sb=new StringBuilder();//
		System.out.println("sb.capacity():"+sb.capacity());
		System.out.println("sb.length():"+sb.length());

		System.out.println("========================================");
		//문자열 담기
		sb.append("12345678901234567\n");
		
		System.out.println("sb.capacity():"+sb.capacity());
		System.out.println("sb.length():"+sb.length());		
		sb.append(" SELECT no         \n");
		sb.append("        ,name      \n");
		sb.append("        ,age       \n");
		sb.append(" FROM members      \n");
		sb.append(" WHERE name ='kim' \n");
		
		System.out.println(sb.toString());
		
	}

}
//sb.capacity():16
//sb.length():0
//========================================
//sb.capacity():34
//sb.length():18
//12345678901234567
// SELECT no         
//        ,name      
//        ,age       
// FROM members      
// WHERE name ='kim' 


