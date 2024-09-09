package com.pcwk.ehr.ed04;

public class Q5 {

	public static void main(String[] args) {
//		[문항5] 보기 문자열 데이터를 읽어 학생별 성적을 아래와 같이 출력하세요.
//		(' | '기호는 학생 구분자 입니다.)
		String data = "1,Alice,80,90,95|2,Bob,80,90,95|3,Charlie,80,90,95";

		int firstIdx = data.indexOf("|");// 첫번째 |
		//System.out.println(firstIdx);// 16
		int lastIdx = data.lastIndexOf("|");// 두번째 |
		//System.out.println(lastIdx);// 31

		String temp01 = data.substring(0, firstIdx);
		String temp02 = data.substring(firstIdx + 1, lastIdx);
		String temp03 = data.substring(lastIdx + 1);

		String[] score = { temp01, temp02, temp03 };
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t");
		System.out.println("=====================================================");

		for (String str : score) {
			String[] user = str.split(",");
			
			String num = user[0];
			String name = user[1];
			int kor = Integer.parseInt(user[2]);
			int eng = Integer.parseInt(user[3]);
			int math = Integer.parseInt(user[4]);
			int sum = kor + eng + math;
			double avg = sum / (3 * 1.0);
			avg = Math.round(avg * 10) / 10.0;// 소수 2째 자리에서 반올림

			System.out.println(num + "\t" + name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + sum + "\t" + avg);
		}//for

	}// main

}// class
