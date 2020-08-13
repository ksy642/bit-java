package com.javaex.oop.staticmembers;

// Scope 연습 ... 정적영역
public class StaticEx {
	public static int refCount; // 클래스 변수 : static
	public static String classVar; // 클래스 변수
	public String instanceVar; // 인스턴스 변수

	// static 영역의 초기화
	static {
		refCount = 0;
		classVar = "Static Member";
//		instaceVar = "Instance Member";
		// static 영역에서 instance 영억에 접근 불가
		// instance 영역에서 static 영역 접근 가능
		System.out.println("Static Block");
	}

	// 생성자
	public StaticEx() {
		refCount++; // static 영역이므로 모든 인스턴스에서 접근
		instanceVar = "Instance Member";
		System.out.println("refCount: " + refCount);
		System.out.println("인스턴스 생성");		
	}
	// 소명자
	@Override
	protected void finalize() throws Throwable {
		refCount--;
		super.finalize();
		System.out.println("소멸자 호출");

	}
}