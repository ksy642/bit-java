package com.javaex.collection.list;
import java.util.*;
public class QueueEx {

	public static void main(String[] args) {
		// Queue 자료형
		// First In First Out (선입선출)
		// 큐는 인터페이스만 제공
		// 		실체 클래스는 List 클래스를 이용한다.
		Queue<Integer> queue = new LinkedList<>();
		
		// 데이터의 제공(enqueue) : offer
		for(int i=1; i<=10; i++) {
			queue.offer(i);
		} System.out.println("QUEUE : " + queue);
		
		// 인출 : 방향의 확인
		System.out.println("dequeue : " + queue.poll()); // 데이터인출
		System.out.println("QUEUE : " + queue);
		
		System.out.println("peek :" + queue.peek()); // 확인 : 삭제 안함
		System.out.println("QUEUE :" + queue);
		
		// 전체 데이터의 인출
		// poll 할 때는 isEmpty로 체크 필수
		while(!queue.isEmpty()) { // 큐가 비어있지 않다면! 루프
			System.out.println("POLL : " + queue.poll());
			
		}
		
		
	}

	

	

	
	
}












