package com.pcwk.ehr.ed02;
import java.util.*;


 
public class R03_Vector {

	public static void displayVector(Vector<String> vector) {
		System.out.println("vector:"+vector);
		System.out.println("vector.size():"+vector.size());// 실제 vector크기
		System.out.println("vector.capacity():"+vector.capacity());//담을수 있는 크기
		System.out.println("--------------------------------------------------");		
	}
	
	public static void main(String[] args) {
  
		//Vector생성
		Vector<String>  vector=new Vector<String>(3);
		
		//vector내용 출력
		displayVector(vector);
		
		vector.add("사과");
		vector.addElement("딸기");
		vector.addElement("딸기2");
		vector.addElement("딸기3");		
		//vector내용 출력
		displayVector(vector);
		
		//요소 사이즈에 capacity같게 처리
		//vector.trimToSize();

		displayVector(vector);
		
		
		//요소 삭제
		System.out.println(vector.removeElement("사과1"));
		System.out.println(vector.remove("사과"));
		displayVector(vector);
	}

}
//vector:[]
//vector.size():0
//vector.capacity():22
//--------------------------------------------------
//vector:[사과, 딸기]
//vector.size():2
//vector.capacity():22
//--------------------------------------------------
//vector:[사과, 딸기]
//vector.size():2
//vector.capacity():2
//--------------------------------------------------
//false
//true
//vector:[딸기]
//vector.size():1
//vector.capacity():2
//--------------------------------------------------
