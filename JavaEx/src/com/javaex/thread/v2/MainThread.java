package com.javaex.thread.v2;

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
	
		// Runnable을 이용한 작업 Thread
		Thread thread2 = new Thread(new AlphabetRunnable());
		thread2.start();
		
		// 메인 쓰레드가 종료되면 Working 쓰레드들을 통제할 수 없게 되므로
		// 작업 쓰레드의 흐름을 메인 쓰레드의 흐름에 합류시켜줘야 함!!
		
		try {
			thread1.join(); // 메인 메소드 흐름에 합류
			thread2.join(); // 메인 메소드 흐름에 합류
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// 메인 쓰레드의 로직
		System.out.println("메인쓰레드 종료");
	}
}
