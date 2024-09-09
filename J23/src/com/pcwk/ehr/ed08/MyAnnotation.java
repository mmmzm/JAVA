package com.pcwk.ehr.ed08;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MyAnnotation {
	//@Retention
	//SOURCE : 소스파일에만 존재, 클래스파일에 X
	//CLASS  : 클래스파일 존재, 실행시 사용불가
	//RUNTIME: 클래스파일 존재, 실행시 사용가능
	
	String value() default "기본값"; //기본값을 : 기본값
	int count(); //매개변수가 없는 애너테이션
	String[] tags();//매열 형태의 애너테이션
	
	
}
