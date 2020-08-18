package com.javaex.oop.shape2;
// 추상 클래스 abstract 넣으면 된다.

//		new 를 이용하여 인스턴스를 만들 수 없는 클래스
public abstract class Shape {
	// 필드
	protected int x;
	protected int y;
	
	// 생성자
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// 추상 메소드
	// 추상 클래스를 상속 받은 실제 클래스는
	// 반드시 부모의 추상 클래스를 구현 해줘야 한다.
	// -> 자식에게 특정 기능을 구현을 "강제" 하는 역할
	
	// interface로 분리
	
//	public abstract void draw();
	public abstract double area();
	
}











