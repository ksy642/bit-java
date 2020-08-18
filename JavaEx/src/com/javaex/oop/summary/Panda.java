package com.javaex.oop.summary;

public class Panda extends Animal {
	// 생성자
	public Panda(String name, int age) {
		// 부모 생성자 호출
		super(name, age);
	}
	// 추상 클래스로부터 상속을 받았으니...

	@Override
	public void say() {
		// abstract 메소드이므로 반드시 오버라이드 해야함!
		System.out.println("zzz...");
		
	}

	
	

}
