package com.pcwk.ehr.ed01;
import java.util.*;


public class R01_Queue {

	public static void main(String[] args) {
		System.out.println("좋은 아침!");
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		//큐에 추가
		queue.offer(new Integer(18));
		queue.offer(15);
		queue.offer(13);
		
		queue.add(22);
		queue.add(23);
		
		//toString()
		System.out.println(queue.toString());//[18, 15, 13, 22, 23]
		
		//큐에 데이터 추출: 데이터 삭제
		System.out.println(queue.poll());//18
		System.out.println(queue.toString());//[15, 13, 22, 23]
		
		//큐에 데이터 추출: 데이터 보존
		System.out.println(queue.peek());//15
		System.out.println(queue);//[15, 13, 22, 23]
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
//		15
//		13
//		22
//		23
	}

}
