package com.javaex.basic;

public class CastingEx {
	public static void main(String[] args) {
		promotionEx();
		castingEx();
	}
	



	public static void promotionEx() {
		// implicit casting(암묵적 변함)
		// 표현 범위가 좁은 타입 -> 넓은 타입으로 변환
		
		byte b = 25; // 1바이트 정수형
		System.out.println("바이트 : "+ b);
		
		short s = b; // 2바이트 정수형
		System.out.println("short : " + s);
		
		int i = s; // 4바이트 정수형
		System.out.println("int : " + i);
		
		long l = i; // 8바이트 정수형
		System.out.println("long : " + l);
		
		float f = l; // 4바이트 실수형
		System.out.println("float : " + f); 
		
		System.out.println(); 
	}
	
	

	public static void castingEx() {
		// explicit casting(명시적 변환)
		// 표현 범위 넓은 타입 -> 좁은 타입으로 변환
		// ★★★★★★★★★★★★★★★★★★★★자료의 유실이 발생 가능!!
		// 개발자가 명시적으로 변환할 자료형을 지정
		float f = 1234.5678F;
		System.out.println("float : " + f);
		
//		long l = f; //f=4바이트 ,  l=8바이트 라서 에러가 남
		long l = (long)f; // 이렇게 개발자가 명시적으로 (long) 를 붙여준다
		System.out.println("-> long : " + l);
		
		
		
	}
	
}









