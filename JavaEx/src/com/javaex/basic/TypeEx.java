package com.javaex.basic;

public class TypeEx {

	public static void main(String[] args) {
		intLongTest();
		floatDoubleTest();
		booleanEx();
		charEx();
		constantEx();
	}

	
	
	
	
	
	
	// 정수형 연습
	// byte < short < int < long
	public static void intLongTest() {
		// 변수 선언
		// int -> 자바가 다루는 정수형의 가장 기본적인 형태
		int intVar1;
		intVar1 = 2020; // 초기화 작업
		int intVar2 = 3030; // 선언 + 초기화 작업
		
		System.out.println(intVar1);
		System.out.println(intVar2);
		
		long longVar1;
		longVar1 = 4040;
		long longVar2 = 123456789012345678L; // 맨뒤에 L을 붙여주자
		
		System.out.println(longVar1);
		System.out.println(longVar2);
		
		// 2진수=0과1 1bit만 사용, 8진수, 16진수
		int bin = 0b1100; // 2진수 0b로 시작
		int oct = 010;    // 8진수는 0으로 시작
		int hex = 0xFF;   // 16진수는 0x로 시작
		
		System.out.println(bin);
		System.out.println(oct);
		System.out.println(hex);
		System.out.println();
	}
	







	public static void floatDoubleTest() {
		float fVar = 3.14159F; // float는 마지막에 F 를 붙여준다.
		double dVar = 3.14159;
		
		// 정밀도 파악
		fVar = 0.1234567890123456789F;
		dVar = 0.1234567890123456789;
		
		System.out.println("float : " + fVar);
		System.out.println("double : " + dVar);
		
		// 지수 표기법
		fVar = 1234567890E-10F;
		System.out.println(fVar);
		// 결과값은 0.123456789 이렇게 나온다.
		
		// 실수 자료형의 처리는 정밀도가 떨어진다. (표현 범위를 넓힘)
		System.out.println(0.1 * 3);
		// 금융권 같은 정밀도를 요구하는 개발에는 float, double
		// 사용은 유의해야 한다.
		System.out.println();
	}
	
	
	
	
	
	
	public static void booleanEx() {
		// 논리값 true or false
		// 비교 연산, 논리 연산의 결과를 반환
		// 흐름 제어, 반복에서 흐름을 제어할 때 이 값을 사용한다.
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println(b1);
		System.out.println(b2);
		
		int v1 = 3;
		int v2 = 5;
		
		boolean result = v1 < v2;
		// 비교 연산, 논리 연산의 결과로 반환
		System.out.println("v1 < v2 ?? : " + result);
		System.out.println();
	}
	
	
	
	
	
	
	// char 캐릭터형 연습 
	// 2바이트 (부호 없음)
	// 유니코드 한 글자의 수치화된 코드!
	public static void charEx() {
		// ' <- char
		// "" <- String
		char ch1 = 'A';
		char ch2 = '한';
		System.out.println("A -> " + ch1); // A 지만 65 숫자로...
		System.out.println("한 -> " + ch2); // 얘는 정수형으로 몇이냐...???
		System.out.println(ch1 + ch2); // 결과값이 54685
		
		
		System.out.println();
	}
	
	
	
	
	
	
	// 상수 연습(Constant)
	public static void constantEx() {
		// 변하지 않는 데이터
		// final 을 선언부 앞에 붙이면 된다.
		// 상수 식별자는 모두 대문자, 여러 단어 결합시
		// 단어 사이에 _ 언더바를 추가해준다.
		final double PI = 3.14159;
		final int SPEED_LIMIT = 110;
		
		System.out.println("PI = " + PI);
		System.out.println("제한 속도 = " + SPEED_LIMIT);
		System.out.println("제한 속도 = " + SPEED_LIMIT);  
	}
	
	
}







