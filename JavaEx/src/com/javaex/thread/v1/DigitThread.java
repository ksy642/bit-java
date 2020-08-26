package com.javaex.thread.v1;

// Working Thread를 만드는 방법1
// 쓰레드 상속 구현
public class DigitThread extends Thread{

	@Override
	public void run() {
		// 쓰레드의 로직을 run 메소드를 오버라이드하여 추가
		// 주의 : run 메소드를 직접 호출하면 멀티 스레드가 아니다!
		// 		start 메소드를 이용하여 우회접근
		// 숫자를 0부터 30까지 1증가 출력,  0.3초 대기
		for (int i=0; i<=30; i++) {
			System.out.printf("%s:%d%n", getName(), i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} super.run();
	}
	
}
