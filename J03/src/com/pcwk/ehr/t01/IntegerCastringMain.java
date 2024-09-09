/**
 * 파일   : IntegerCastringMain.java
 * 작성자 : acorn
 * 작성일 : 2024-03-13
 */
package com.pcwk.ehr.t01;

/**
 * @author acorn
 *
 */
public class IntegerCastringMain {
    public static void main(String[] args) {
        int intValue = 100;
        long longValue = 200L;
        
        // int를 long으로 형변환 (작은 정수형에서 큰 정수형으로 형변환)
        longValue = intValue;
        System.out.println("longValue: " + longValue);
        
        long longValue2 = 300L;
        int intValue2;
        
        // long을 int로 형변환 (큰 정수형에서 작은 정수형으로 형변환)
        intValue2 = (int) longValue2;
        System.out.println("intValue2: " + intValue2);
    }
}

//longValue: 100
//intValue2: 300
