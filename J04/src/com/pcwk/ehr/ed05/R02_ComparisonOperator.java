package com.pcwk.ehr.ed05;

public class R02_ComparisonOperator {

	public static void main(String[] args) {
		//shift + tab -> 선택영역을 왼쪽으로 탭많큼 이동
//		10 == 10.f  -> true
//		0.1 == 0.1f -> false
//		(정수형과 달리 실수형은 근사값으로 저장되므로 오차가 발생할 수 있기 때문이다.)
		
		System.out.println(10.0 == 10.0f);//true
		
		float floatValue   = 0.1f;
		double doubleValue = 0.1;
		
		//실수형은 2진 근사값으로 저장되므로 오차가 발생
		System.out.printf("0.1==0.1f \t %b%n",(0.1==0.1f));
		System.out.println("-------------------------------------------------");
		
		//총자리수는 19자리
		//소숫점 이하 자리수는 17자리
		System.out.printf("floatValue=%19.17f%n",floatValue);  //floatValue=0.10000000149011612
		System.out.printf("doubleValue=%19.17f%n",doubleValue);//doubleValue=0.10000000000000000
		
	}

}
//true
//0.1==0.1f 	 false
//-------------------------------------------------
//floatValue=0.10000000149011612
//doubleValue=0.10000000000000000
