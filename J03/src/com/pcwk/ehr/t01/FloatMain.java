/**
 * 파일   : FloatMain.java
 * 작성자 : acorn
 * 작성일 : 2024-03-13
 */
package com.pcwk.ehr.t01;

public class FloatMain {
    public static void main(String[] args) {
        // 큰 정밀도의 실수형 데이터
        double bigDouble = 123.456789;
        // 작은 정밀도의 실수형 데이터
        float smallFloat = 0.0f;
        
        // 큰 정밀도의 실수형에서 작은 정밀도의 실수형으로 명시적 형변환
        smallFloat = (float) bigDouble;
        System.out.println("smallFloat: " + smallFloat);
        
        // 작은 정밀도의 실수형에서 큰 정밀도의 실수형으로 자동 형변환
        double bigDouble2 = smallFloat;
        System.out.println("bigDouble2: " + bigDouble2);
    }
}
//smallFloat: 123.45679
//bigDouble2: 123.456787109375
