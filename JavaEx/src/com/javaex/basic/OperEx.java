package com.javaex.basic;

// 연산자 연습
public class OperEx {

	public static void main(String[] args) {
		arithOperEx();

	}
	
	//산술 연산자
	public static void arithOperEx() {
		// 사칙연산 : +, -, *, /
		int a = 7;
		int b = 3;
		
		System.out.println("7 / 3 = " + (7 / 3));
		// int / int = int(몫)
		System.out.println("7 / 3 의 나머지 = " + (7 % 3));
		// 나머지 연산자 : %
		
		// 정확한 실수값을 얻으려면 int -> float 변환
		System.out.println("7 / 3 = (실수값) =" + ((float)a / (float)b));
		
		//정수를 0 으로 나누면?
//		System.out.println("정수 나누기 0 = " + (a / 0);
		// 에러가 나서 일단 주석
	}
}











