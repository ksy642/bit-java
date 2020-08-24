package com.javaex.collection.list;
import java.util.*;
public class StackEx {

	public static void main(String[] args) {
		// 스택 자료형
		// 후입선출 : Last In First Out
		//		입출력 방향이 한방향
		
		// 스택 생성
		Stack<Integer> stack = new Stack<>();
		// 입력 : push (쌓기)
		
		for (int i=1; i<=10; ++i) {
			stack.push(i);
		} System.out.println("STACK : " + stack);
		
		// 출력 : pop(추출)
		int out = stack.pop();
		System.out.println("인출된 데이터 : " + out);
		System.out.println("STACK : " + stack);   // 10이 사라진다.
		
		// 가장 위쪾 데이터 참조 : peek(추출은 하지 않음)
		System.out.println("PEEK : " + stack.peek());
		System.out.println("STACK : " + stack);  // 9를 확인하고 냅둔다.
		
		// 루프를 돌면서 객체를 모두 pop 으로 !
		// 스택이 빈 상태에서 pop를 하면 예외가 발생을 한다.
		
		/*
		while(true) {
			System.out.println("인출 데이터 : " + stack.pop());
			System.out.println("STACK : " + stack);
			
		}
		*/
		// 위에 코드는 아래와 같이 변경 된다. 
		// 비어있을 때 참! 이다.
		// 하지만 우리가 원하는건 비어있지 않을 때 참 !stack 붙여준다.
		while(!stack.empty()) {
			System.out.println("인출 데이터 : " + stack.pop());
			System.out.println("STACK : " + stack);
			
		}
	}

	
	
	
	
	
}












