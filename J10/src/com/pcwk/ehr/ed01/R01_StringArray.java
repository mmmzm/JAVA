package com.pcwk.ehr.ed01;

public class R01_StringArray {

	public static void main(String[] args) {
		String[] nameArray= {"박","이","김"};
		
		//for문으로 nameArray 데이터 출력
		for(int i=0;i<nameArray.length;i++) {
			System.out.printf("nameArray[%d]=%s%n",i,nameArray[i]);
		}
		
		System.out.println("─────────────────────────────────────────────────" );
		String name = nameArray[1];
		System.out.printf("name=%s%n",name);
		
		//값 변경
		nameArray[0] = "천";
		
		//향상된 for
		for(String str  : nameArray) {
			System.out.println(str);
		}
		
	}
}
//nameArray[0]=박
//nameArray[1]=이
//nameArray[2]=김
//─────────────────────────────────────────────────
//name=이
//천
//이
//김
