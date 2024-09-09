package com.pcwk.ehr.t02;

public enum Day {
    // 요일 상수 값 정의
    MONDAY("Monday",1),
    TUESDAY("Tuesday",2),
    WEDNESDAY("Wednesday",3),
    THURSDAY("Thursday",4),
    FRIDAY("Friday",5),
    SATURDAY("Saturday",6),
    SUNDAY("Sunday",7);

    // 요일을 나타내는 문자열 필드
    private String displayName;
    private int    value;
    // 생성자
    Day(String displayName,int value) {
        this.displayName = displayName;
        this.value = value;
    }

    // 요일을 문자열로 반환하는 메서드
    public String getDisplayName() {
        return displayName;
    }
    
    // 요일을 문자열로 반환하는 메서드
    public int getDisplayValue() {
        return value;
    }
}
