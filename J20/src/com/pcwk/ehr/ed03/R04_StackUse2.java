package com.pcwk.ehr.ed03;

import java.util.*;

public class R04_StackUse2 {
	/**
	 * 괄호 일치 여부 
	 * @param expression
	 * @return true(일치)/false(불 일치)
	 */
	public static boolean isBalanced(String expression) {
		boolean isBalanced = false;
		
		char[] chArray = expression.toCharArray();
		Stack<Character> stackMiddle=new Stack<Character>();
		
		Stack<Character> stackSmall=new Stack<Character>();
		
		
		for(char ch  :chArray) {
			//System.out.println(ch);
			//여는 괄호가 있으면 stack추가
			
			if('{' ==ch || '(' ==ch || '}' ==ch || ')' ==ch) {
			
				if( '{' == ch || '('==ch) {
					
					if('{' == ch) {
						stackMiddle.add(ch);
					}
					
					if('(' == ch) {
						stackSmall.add(ch);
					}					
					
				}else if(!stackMiddle.isEmpty() &&'}'==ch && stackMiddle.search('{') !=-1) {
					stackMiddle.pop();
				}else if(!stackSmall.isEmpty() &&')'==ch && stackSmall.search('(') !=-1) {
					stackSmall.pop();
				}else {
					return false;
				}
			}
			
			
			
		}
		System.out.println("stackMiddle stack:"+stackMiddle.toString());
		System.out.println("stackSmall stack:"+stackSmall.toString());
		if(stackMiddle.isEmpty() && stackSmall.isEmpty()) {
			isBalanced = true;
		}
		
		return isBalanced;
	}

	public static void main(String[] args) {
		String expression = "{(2+3) * 1} + 3";

		boolean flag = isBalanced(expression);
		if (flag == true) {
			System.out.println("괄호 일치 ");
		} else {
			System.out.println("괄호 불 일치 ");
		}
	}

}
