package com.pcwk.ehr.ed06;

public class R02_InitBlock {

	static { //클래스 초기화 블럭
		System.out.println("static Block");
		
	}
	
	{   //인스턴스 초기화 블럭
		System.out.println("인스턴스 Block");
		
	}
	
	public R02_InitBlock() {
		System.out.println("default생성자");
	}
	
	
	public static void main(String[] args) {
		R02_InitBlock r02=new R02_InitBlock();
		System.out.println("--------------------------------------------------");
		
		R02_InitBlock r03=new R02_InitBlock();
	}

}
//static Block
//인스턴스 Block
//default생성자
//--------------------------------------------------
//인스턴스 Block
//default생성자