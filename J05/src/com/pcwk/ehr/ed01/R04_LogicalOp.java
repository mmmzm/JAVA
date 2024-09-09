package com.pcwk.ehr.ed01;

public class R04_LogicalOp {

	public static void main(String[] args) {
		//논리 부정 연산자: !
		//논리 부정 연산자는 true이면 false를, false이면 true를 결과로 반환한다.
		
		boolean bValue = true;
		char    ch     = 'C';
		
		System.out.printf("bValue =%b%n",bValue);
		System.out.printf("!bValue=%b%n",!bValue);
		System.out.printf("!!bValue=%b%n",!!bValue);
		
		System.out.println("──────────────────────────────────────────────────");
		System.out.printf("ch=%c%n",ch);
		
		System.out.println(ch < 'a' || ch > 'z');//true
		System.out.println(!('a'<=ch && ch <='z'));
	}

}
//bValue =true
//!bValue=false
//!!bValue=true
//──────────────────────────────────────────────────
//ch=C
//true
//true
