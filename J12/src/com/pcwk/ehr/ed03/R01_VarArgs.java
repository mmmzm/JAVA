package com.pcwk.ehr.ed03;

public class R01_VarArgs {

	public static void main(String[] args) {
		String [] strArr = {"13","15","18"};
		
		

		System.out.println(concatenate("-",strArr));
		System.out.println(concatenate("^",new String[]{"13"}));
		System.out.println(concatenate(strArr));
		


	}
	
	//The variable argument type String of the method concatenate must be the last parameter
	static String concatenate(String delim, String ... args) {
		String result = "";
		
		for(String str :args) {
			result += str + delim;
		}
		
		
		return result;
		
	}
	
	static String concatenate(String ... args) {
		return concatenate("",args);
	}
	
	

}
//13-15-18-
//13^
//131518
