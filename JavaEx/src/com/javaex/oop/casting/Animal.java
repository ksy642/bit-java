// 8월 18일
package com.javaex.oop.casting;
// 실행객체가 아님!
public class Animal {
	// 필드
	protected String name; // 프로텍티드는 자식에게도 물려줄 수 있다!
	
	// 생성자
	public Animal(String name) {
		this.name = name;
	}
	// 메소드
	public void eat() {	System.out.println(name + "는 먹고 있다");	}
	public void walk() { System.out.println(name + "는 걷고 있다."); }
	
}
