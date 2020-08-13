package com.javaex.oop.staticmembers;

public class Singleton {
	
	private static Singleton instance = new Singleton();
	//생성자
	private Singleton() {
		//절대 두번 호출되면 안된다.
	}
	//일종의 getter를 만들어서 우회 접근
	public static Singleton getInstance() {
		return instance;
	}

}
