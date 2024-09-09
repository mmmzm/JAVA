package com.pcwk.ehr.ed04;

public class FactorialMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result = factorial(5);
		
		System.out.println("5!="+result);
	}
	/**
	 * 팩토리얼은 양의 정수의 곱을 의미한다. 
	 * 어떤 양의 정수 n의 팩토리얼은 n부터 1까지 모든 양의 정수를 곱한 값입니다.
	 * 
	 * 5! = 5 * 4 * 3 * 2 * 1;//120
     * n! = n * (n-1) * (n-2) * ...*2*1;
	 * @param n
	 * @return
	 */
	static int factorial(int n) {
		int result = 0;
		
		if(n == 1) {
			System.out.printf("%d%n",n);
			return 1;
		}else {
			result = n * factorial(n-1);
			System.out.printf("%d=%d * factorial(%d-1)%n",result,n,n);
		}
		//5 * factorial(5-1)
		//4 * factorial(4-1)
		//3 * factorial(3-1)
		//2 * factorial(2-1)
		//1 
		
		//Exception in thread "main" java.lang.StackOverflowError
		
		return result;
	}

}
//1
//2=2 * factorial(2-1)
//6=3 * factorial(3-1)
//24=4 * factorial(4-1)
//120=5 * factorial(5-1)
//5!=120
