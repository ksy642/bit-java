package com.javaex.api.generics.v2;

public class BoxApp {

	public static void main(String[] args) {
		// 정수를 담을 수 있는 박스를 생성
//		Box<Integer> intBox = new Box<Integer>(); // 타입을 <Integer> 지정
		Box<Integer> intBox = new Box<>(); // 뒤의 것은 생략 OK
		intBox.setContent(2020); // OK
//		intBox.setContent("2020"); // 컴파일러가 Generics를 체크

		// 값을 꺼내와 봅니다.
		// 내부 데이터가 Integer임이 확실 -> 캐스팅 불필요
		int content = (int)intBox.getContent();
		System.out.println("박스의 내용물 : " + content);
		
		Box<String> strBox = new Box<>(); // 문자열을 받아보자! <String>
		strBox.setContent("Java"); // 가능(String 타입 지정)
		
		// 값을 꺼내와 봅시다.
		String strContent = strBox.getContent(); // 캐스팅 불필요
		System.out.println("박스의 내용물 : " + strContent);
		
		
		// 여기가 제일 중요함 !!!!!!!!!!!!!!!!!!!!!!!!!!!
		
		// 만약 캐스팅을 잘못하면?
		// 위험하다 (컴파일이 안된다.) = Generics 를 체크
		// 어차피 밑에 코딩 안되니깐 주석처리
		/*
		strContent = (String)intBox.getContent();
		System.out.println("박스의 내용물 : " + strContent);
		*/
		
		
	}

	
	
}




























