package com.javaex.oop.goods.v4;

// v4.
// point v1을 복사해서 v2로...
// Goods 객체를 생성하여 사용하는 클래스
public class GoodApp {

	public static void main(String[] args) {
		// Goods 클래스 사용
//		Goods notebook = new Goods(); // 인스턴스화 -> 생성자가 없어서 주석처리
		// 필드에 접근
		
		Goods notebook = new Goods("LG Gram", 150000);
		//생성자를 통해 초기화가 된다
		
		/*
		notebook.name = "LG Gram";
		notebook.price = 1500000;
		
		System.out.printf("%s, %d원%n",
				notebook.name, notebook.price);
		*/
		
		// setter를 이용한 우회 접근
		notebook.setName("LG Gram");
		notebook.setPrice(1500000);
		// 메서드 호출
		notebook.showInfo();
		
//		Goods smartphone = new Goods(); // 생성자가 없어서 주석처리
		
		Goods smartphone = new Goods("iPhone SE", 600000);
		
	/*
		smartphone.setName("Phone SE");
		smartphone.setPrice(600000);
	*/	smartphone.showInfo();
	
	}

}





