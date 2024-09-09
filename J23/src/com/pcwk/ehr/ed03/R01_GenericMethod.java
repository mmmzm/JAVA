package com.pcwk.ehr.ed03;

public class R01_GenericMethod {
	
	/**
	 * 
	 * @param <T>
	 * @param arr
	 * @return
	 */
	public static <T> T printArray(T[] arr) {
		
		for(T n  :arr) {
			System.out.print(n+",");
		}
		
		System.out.println();
		
		return arr[0];
		
	}
	
	public static void main(String[] args) {
		
		Integer[] intArray= {13,15,18,48,52};
		
		printArray(intArray);
		
		Double[] doubleArray= {1.1,2.2,3.3};
		printArray(doubleArray);

		String[] strArray= {"one","two","three"};
		String strFirst = printArray(strArray);
		System.out.println("strFirst:"+strFirst);
	}

}
//13,15,18,48,52,
//1.1,2.2,3.3,
//one,two,three,
//strFirst:one
