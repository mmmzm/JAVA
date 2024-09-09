package com.pcwk.ehr.ed01;

public class ExplicitCasting {

	public static void main(String[] args) {
		// 정수형간의 형변환

		int iNum  = 18;
		byte bNum = (byte) iNum;
		
		System.out.printf("iNum:%d\n",iNum);
		System.out.printf("bNum:%d%n",bNum);
		//세로 편집 : alt + shift + a
		
		//자음 + 한자 키(or 한자 키가 없다면 우측 Ctrl 키)
		//특수기호
		System.out.println("┌─────────────────────────────────────────────────────────────────┐");
		System.out.println("│                                                                 │");
		System.out.println("└─────────────────────────────────────────────────────────────────┘");
		                                                                                       
		
		System.out.println("-------------------------------------------------");
		System.out.println("─────────────────────────────────────────────────");
		iNum = 129;
		bNum = (byte)iNum;
		System.out.printf("iNum:%d\n",iNum);
		System.out.printf("bNum:%d%n",bNum);		
		
	}

}
