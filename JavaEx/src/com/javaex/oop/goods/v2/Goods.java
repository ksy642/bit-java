package com.javaex.oop.goods.v2;

// v2
// 접근 제한자의 이해
// getter와 setter
public class Goods {
	// 필드(속성)
	
	// 접근자 없으면 default
	// 클래스 내부 or 동일 패키지 내에서 접근 가능
/*
	String name;
	int price;
*/
	
	// public > protected > default > private
	private String name; // 인스턴스 변수
	private int price;	// 인스턴스 변수
	
	// Getter / Setter
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		// this : 해당 인스턴스 자신을 가리키는
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	// 메서드
	public void showInfo() {
		// 내부 필드의 정보를 출력
		System.out.printf("%s, 가격 %d원%n",
				name, price);
	}
}














