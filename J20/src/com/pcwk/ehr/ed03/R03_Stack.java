package com.pcwk.ehr.ed03;

import java.util.*;

public class R03_Stack {
	public static void printStack(Stack<String>  stack) {
		while(!stack.empty()) {
			System.out.println(stack.pop());
		}		
		System.out.println("===================================");
	}
	public static void main(String[] args) {
		Stack<String>  stack=new Stack<String>();
		
		//요소추가 
		stack.push(new String("JAVA"));
		stack.push(new String("SQL"));
		stack.push(new String("HTML"));
		stack.push(new String("CSS"));
		stack.push(new String("JAVASCRIPT"));
		stack.push(new String("JSP"));
		
		//요소추출 : 데이터 stack에서 제거
		System.out.println("요소추출:"+stack.pop());//요소추출:JSP
		
		//요소추출 : 데이터 stack에서 보존
		System.out.println("요소추출 peek:"+stack.peek());//
		
		//요소찾기 :search
		//요소찾기:-1
		System.out.println("요소찾기:"+stack.search("SQL"));
		printStack(stack);
	}

}
//요소추출:JSP
//요소추출 peek:JAVASCRIPT
//요소찾기:4
//JAVASCRIPT
//CSS
//HTML
//SQL
//JAVA
//===================================
