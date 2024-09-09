package com.pcwk.ehr.t02;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MyAnnotation {
    String value() default "Default Value"; // 기본값을 "Default Value"로 설정
    int count(); // 매개변수가 없는 애너테이션 요소
    String[] tags(); // 배열 형태의 애너테이션 요소
}
