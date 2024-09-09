package com.pcwk.ehr.ed02;

import java.util.*;


public class R08_TreeSet {

	public static void main(String[] args) {
		TreeSet<Integer>  treeSet=new TreeSet<Integer>();
		
		//요소추가
		System.out.println(treeSet.add(18));
		System.out.println(treeSet.add(15));
		System.out.println(treeSet.add(13));
		System.out.println(treeSet.add(15));
		System.out.println(treeSet.add(16));
		
		//중복제거, sorting ASC
		System.out.println(treeSet);
		

	}

}
//true
//true
//true
//false
//true
//[13, 15, 16, 18]

