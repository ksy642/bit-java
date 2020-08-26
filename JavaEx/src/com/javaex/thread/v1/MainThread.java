package com.javaex.thread.v1;

// Process : 실행중인 하나의 프로그램
// Thread : Process 내에서 실행되는 하나의 작업 흐름 = 쓰레드
// 하나의 프로세스가 실행되면 MainTread가 하나 생성된다.
public class MainThread {

	public static void main(String[] args) {
		// 메인 스레드와 별도로 다른 작업흐름이 필요하다
		// Thread 생성하여 실행
		Thread thread1 = new DigitThread();
		thread1.setName("DigitThread");
		// 쓰레드의 시작 : Runnable -> Running 상태변환
		thread1.start(); // 쓰레드 내부의 run 메소드는 직접 호출하지않도록 합니다! = 우회접근
		// 메인 스레드의 로직
		// A부터 Z까지 0.3초 간격으로 출력
		for (char ch = 'A'; ch<= 'Z'; ch++) {
			System.out.println("MainThread : " + ch);
			// 0.3 대기
			try {
			Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
