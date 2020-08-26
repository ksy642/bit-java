package com.javaex.thread.v3;

// Thread 생성 두번째 방법 : Runnalbe 인터페이스 구현
public class AlphabetRunnable implements Runnable {
// source -> 오버라이드 (첫번쨰꺼) -> run
	@Override
	public void run() {
		// Thread 내부의 start 메소드에서 호출될 쓰레드의 로직
		for (char ch = 'A'; ch<= 'Z'; ch++) {
			System.out.println("AlphabetRunnable : " + ch);
			// 0.3 대기
			try {
			Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
