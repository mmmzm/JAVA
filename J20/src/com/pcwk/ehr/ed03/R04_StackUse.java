package com.pcwk.ehr.ed03;

import java.util.*;

public class R04_StackUse {
	/**
	 * 괄호 일치 여부
	 * 
	 * @param expression
	 * @return true(일치)/false(불 일치)
	 */
	public static boolean isBalanced(String expression) {
		boolean isBalanced = false;

		char[] chArray = expression.toCharArray();
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < chArray.length; i++) {

			char ch = chArray[i];
			//닫는 괄호로 시작하면 return false
			if ((i == 0  && ch == ')' ) || (i == 0  && ch == '}')) {return false;}
			
			//괄호가 아니면 continue
			if( !('(' == ch || ')'== ch || '{' == ch || '}'== ch  )) { continue;}
			
			if ('(' == ch || '{' == ch) {
				stack.add(ch);
			} else if (!stack.isEmpty() && ')' == ch && stack.peek() == '(') {
				stack.pop();
			} else if (!stack.isEmpty() && '}' == ch && stack.peek() == '{') {
				stack.pop();
			} else {
				return false;
			}
			

		}
		System.out.println("stack :" + stack.toString());
		if (stack.isEmpty()) {
			isBalanced = true;
		}

		return isBalanced;
	}

	public static void main(String[] args) {
		// 소괄호만 사용!
		String expression = "({2+3}) * 1 + 3";

		boolean flag = isBalanced(expression);
		if (flag == true) {
			System.out.println("괄호 일치 ");
		} else {
			System.out.println("괄호 불 일치 ");
		}
	}

}
