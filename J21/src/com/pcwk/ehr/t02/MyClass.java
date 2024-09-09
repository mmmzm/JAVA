package com.pcwk.ehr.t02;

import java.lang.reflect.Method;

public class MyClass {

	@MyAnnotation(count = 5,tags = {"tag1","tag2"})
    public void myMethod() {
        // 메서드 내용
    }
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
        // MyClass 클래스의 myMethod() 메서드에 대한 애너테이션 정보 가져오기
        Method method = MyClass.class.getMethod("myMethod");
        MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);

        // 애너테이션 요소 값 출력
        System.out.println("Value: " + annotation.value());
        System.out.println("Count: " + annotation.count());
        System.out.print("Tags: ");
        for (String tag : annotation.tags()) {
            System.out.print(tag + " ");
        }

	}

}
//Value: Default Value
//Count: 5
//Tags: tag1 tag2 
