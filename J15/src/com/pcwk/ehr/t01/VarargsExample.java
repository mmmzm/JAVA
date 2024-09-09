package com.pcwk.ehr.t01;

public class VarargsExample {
    // 가변 파라미터를 사용한 메서드
    public static void printNames(String... names) {
        System.out.println("Names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
    
    public static void main(String[] args) {
    	printNames("A","B","C");
    	System.out.println("────────────────────────────────");
    	printNames("A","B");
    	System.out.println("────────────────────────────────");
    	printNames();
    }
}
