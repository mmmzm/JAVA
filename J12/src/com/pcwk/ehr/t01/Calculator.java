package com.pcwk.ehr.t01;

public class Calculator {
	// 두 개의 정수를 더하는 메서드
	public int add(int a, int b) {
		return a + b;
	}

	// 두 개의 정수를 빼는 메서드
	public int subtract(int a, int b) {
		return a - b;
	}

	// 두 개의 정수를 곱하는 메서드
	public int multiply(int a, int b) {
		return a * b;
	}

	// 두 개의 정수를 나누는 메서드
	public double divide(int a, int b) {
		if (b == 0) {
			throw new IllegalArgumentException("Divisor cannot be zero");
		}
		return (double) a / b;
	}

	public static void main(String[] args) {
		Calculator calculator = new Calculator();

		// 덧셈 결과 출력
		System.out.println("Addition: " + calculator.add(5, 3));

		// 뺄셈 결과 출력
		System.out.println("Subtraction: " + calculator.subtract(5, 3));

		// 곱셈 결과 출력
		System.out.println("Multiplication: " + calculator.multiply(5, 3));

		// 나눗셈 결과 출력
		System.out.println("Division: " + calculator.divide(10, 2));
	}
}
//Addition: 8
//Subtraction: 2
//Multiplication: 15
//Division: 5.0