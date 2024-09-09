package com.pcwk.ehr.t01;

public class Main {

	public static void main(String[] args) {
        // 제네릭 클래스 사용 예제
        Box<Integer> intBox = new Box<>(10);
        System.out.println("Box value: " + intBox.getValue());

        // 제네릭 메서드 사용 예제
        Utils.printValue("Hello, Generics!");

	}

}
