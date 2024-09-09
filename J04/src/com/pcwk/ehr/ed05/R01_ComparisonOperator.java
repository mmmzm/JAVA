package com.pcwk.ehr.ed05;

public class R01_ComparisonOperator {

	public static void main(String[] args) {
		//이항 연산자이므로 연산을 수행하기 전에 형변환을 통해 두 피연산자의 
		//타입을 같이 맞춘 다음 피연산자를 비교
		
		//float == float
		//15.0f == 15.0f
		System.out.printf("15 == 15.0f \t %b%n",(15 == 15.0f));
		
		//int == int
		//48  == 0
		System.out.printf("'0' == 0 \t %b%n",('0' == 0));

		//int == int
		//65  == 65
		System.out.printf("'A' == 65 \t %b%n",('A' == 65));
		
		//int > int
		//65  > 66
		System.out.printf("'A' > 'B' \t %b%n",('A' > 'B'));
		//int != int
		//65+1 != 66
		System.out.printf("'A'+1 != 'B' \t %b%n",('A'+1 != 'B'));
		
	}

}
//15 == 15.0f 	 true
//'0' == 0 	     false
//'A' == 65 	 true
//'A' > 'B' 	 false
//'A'+1 != 'B' 	 false