package com.javaex.oop.summary;

public class KungfuPanda extends Panda implements Kungfu {
		// Panda 는 abstract 반드시!!
	
	// 생성자
	public KungfuPanda(String name, int age) {
		super(name, age);
	}
	// 추상 메소드는 반드시 Override
	// say 는 Animal 의 추상 메소드
	// -> Panda 가 이미 오바라이드를 하였따.
	
	// 인터페이스 내의 모든 메소드는 반드시 오버라이드
	
	@Override
	public void kungfu() {
		System.out.printf("%s: 아뵤~%n" , name);
		
	}
	
}
