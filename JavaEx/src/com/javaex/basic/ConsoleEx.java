// 20년도 8월 6일 목요일 수업
package com.javaex.basic;

import java.util.Scanner;

public class ConsoleEx {

	public static void main(String[] args) {
		consoleOutput();
		consoleInput();
		

	}
	
	// 콘솔 출력
	public static void consoleOutput() {
		// System.out.print -> 출력 후 개행 없음
		// System.out.println -> 출력 후 개행
		// System.out.printf -> 형식화된 출력 : String 할 때 정리 (TODO)
		
		System.out.print("Hello ");
		System.out.println("Java ");	
		// 이스케이프 문자 (시퀀스)
		//   \n : 개행 = 걍 한줄 띄우는거야
		//   \t : 탭
		//   \" : 쌍따옴표 ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★ 중요하다잉
 		//   \\ : \
		System.out.println();
		System.out.println("Hello \n Java");
		System.out.println();
		System.out.println("Hello \t Java");
		System.out.println("★★★ Hello, \"Java\" ★★★");
		
		String message = "Hello, \"Java\"";
		// 파일을 다뤄야 하는데
		// C:\mydir\myfile.txt
		String dir = "C:\\mydir\\myfile.txt";                     // 여기도 중요해!
		// 역슬래쉬 \\ 두개를 써줘야된다.  즉 \\ 2개는 \ 1개로 표시됨
	}

	
	
	
	
	
	// 콘솔 입력 (System.in)
	// Scanner 클래스를 이용하면 다양한 입력 소스로부터 데이터를 입력받을 수 있다.
	public static void consoleInput() {
		// Tip 1. Ctrl + Shift + O -> 자동 import
		// Tip 2. Ctrl + Space     -> code Assist
		Scanner scanner = new Scanner(System.in); // new 라는건 실제로 객체를 만들어서 메모리에 올려라!! 하는것
		// 이름은? -> 문자열 데이터 입력
		// 나이는? 이라고 묻고 정수데이터 입력
		// 출력 -> 이름, 나이는 0세
		System.out.print("이름은? ");
		String name = scanner.next();
		System.out.print("나이는? ");
		int age = scanner.nextInt();
		
		System.out.println("이름은 " + name + ", 나이는 " + age);
		// 시스템 자원을 사용하는 기능을 이용한 후헤는 반드시 닫아주자 : 중요
		scanner.close();
		
		
		
	}
	
	
}































