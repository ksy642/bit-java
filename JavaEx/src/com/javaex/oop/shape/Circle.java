package com.javaex.oop.shape;
// 8월 18일

// 1. 생성자의 문제
// 2. 추상 메소드 구현의 문제
public class Circle extends Shape {
	// x, y 필드와 draw, area 메소드를 상속
	// 자신만의 필드
	protected double radius; // 반지름
	
	// 생성자
	public Circle(int x, int y, double radius) {
		// 부모 생성자 호출
		super(x, y);
		this.radius = radius;		
	}
	
	// 추상 클래스를 상속받은 자식 클래스는 추상 메소드를 "반드시" 구현해줘야 한다.
	@Override
	public void draw() {
		System.out.printf("원(x=%d, y=%d, r=%f, area=%f)을 그렸습니다.%n",
				x, y, radius, area());
		
	}
	
	@Override
	public double area() {
		// 면적 구하기
		double result = Math.PI * Math.pow(radius, 2);  // pow 는 2를 씀으로 제곱을 뜻한다
		return result;
	}
}













