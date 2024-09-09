package com.pcwk.ehr.ed02;

import java.text.DecimalFormat;


public class R01_DecimalFormat {

	public static void main(String[] args) {
//		0	숫자를 나타내는 자릿수(없으면 0으로 채움)
//		#	숫자를 나타내는 자릿수(없으면 표시하지 않음 )
//		,	그룹 구분 기호(숫자를 천 단위로 그룹화)
//		.	소수점 구분 기호
//		-	음수 기호
//		%	백분률로 표시
//		E	지수표기법(과학적 표기법)		
		
		double num = 12_345.6789;
		System.out.println("num:"+num);
		
		DecimalFormat  decimalFormat=new DecimalFormat("0,000.00");
		//소수점 3째 자리에서 반올림
		System.out.println("0,000.00 =>"+decimalFormat.format(num));
		
		DecimalFormat  groupedFormat = new DecimalFormat("#,###.00");
		System.out.println("#,###.00 =>"+groupedFormat.format(num));
		
		//통화
		DecimalFormat  currencyFormat = new DecimalFormat("\u00A4#,###.##");
		System.out.println("\u00A4#,###.## =>"+currencyFormat.format(num));
		
		//통화$
		DecimalFormat  dCurrencyFormat = new DecimalFormat("$#,###.##");
		System.out.println("$#,###.## =>"+dCurrencyFormat.format(num));
		
		//백분율
		//백분율(百分率, 문화어: 백분률) 또는 퍼센트(percent)는 수를 100과의 비로 나타내는 방법이다. 
		//비율에 100을 곱한 값이며 기호는 %이다. 예를 들어 32.1%는 0.321
		
		DecimalFormat  percentFormat =new DecimalFormat("0.00%");
		System.out.println("0.00% =>"+percentFormat.format(num));//1234567.89%
		
		
		
	}

}
//num:12345.6789
//0,000.00 =>12,345.68
//#,###.00 =>12,345.68
//¤#,###.## =>￦12,345.68
//$#,###.## =>$12,345.68
//0.00% =>1234567.89%
