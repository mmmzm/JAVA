package com.pcwk.ehr.ed06;

public class R01_Init {
	int x;
	int y = x;
	
	
	void method() {
		int i =0 ;
		//The local variable i may not have been initialized
		//지역변수는 반드시 초기화 디어야 함.
		int j = i;
	}
	
	
}
