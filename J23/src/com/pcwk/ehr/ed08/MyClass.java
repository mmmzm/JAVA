package com.pcwk.ehr.ed08;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyClass {

	@MyAnnotation(count = 13,tags = {"tag1","tag2","tag3"})
	public void myMethod() {
		System.out.println("myMethod()");
	}
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		// 리플렉션
		Method method=MyClass.class.getMethod("myMethod");

		MyAnnotation myAnnotation=method.getAnnotation(MyAnnotation.class);
		
		//애너테이션 요소 값 출력
		System.out.println("value():"+myAnnotation.value());
		System.out.println("count():"+myAnnotation.count());
		System.out.print("tags: ");
		for(String tag :myAnnotation.tags()) {
			System.out.print(tag+" ");
		}
		System.out.println();
		MyClass  main=new MyClass();
		method.invoke(main);
	}

}
//value():기본값
//count():13
//tags: tag1 tag2 tag3 
//myMethod()