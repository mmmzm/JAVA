package com.pcwk.ehr.ed02;

public class Outer {

	//instance inner class
	class InstanceInnerClass{
		
		int iv = 22;
		
		//static
		//static int newCv = 100;
		
		final static int CONST = 22;
	}
	
	//static inner class
	static class StaticInnerClass{
		int iv = 200;
		static int cv = 200;
	
	}
	
	void pcwkMethod() {
		//local inner class
		class LocalInnerClass{
			int iv = 300;
			//사용불가
			//static int sv = 150;
		}
	}
	
	
	
	
	
}
