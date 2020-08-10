package com.javaex.basic;
// 8월 10일 월요일!!
import java.util.Scanner;
public class ConditionalEx {

	public static void main(String[] args) {
//		ifElseEx();
//		ifElseEx2();
		ifElseEx3();;
	}
	
		public static void ifElseEx() {
		// Scanner로 점수를 입력
		// 점수가 60점 이상이면 "합격"
		// 그렇지 않다(60점 미만이면) "불합격"
		Scanner scanner = new Scanner((System.in));
		int score = scanner.nextInt();
		
		if(score>=60) {
			// 비교 값이 true 일때 상황
			System.out.println("합격!");
		} else {
			// 비교 값이 false 일때 상황
			System.out.println("불합격!");
		}
	}
		
		
		
		
		
		
		
		public static void ifElseEx2() {
			// 정수 입력
			// 0보다 크면 양수, 0이면 0, 0보다 작으면 음수 출력
			// if ~ else if ~ else
			Scanner scanner = new Scanner(System.in);
			System.out.print("정수를 입력 : ");
			int num = scanner.nextInt();
			/*
			if(num > 0) 
				System.out.println("양수 입니다.");
			else if (num ==0 )
				System.out.println("0입니다.");
			else
				System.out.println("음수니다.");
			*/
			
			
			
			
			// 중첩 if : 1차로 필터링
			//    내부 블록 안쪽에서 2차로 조건 판별 가능
			if (num == 0) {
				// 0 일때
			} else {
				// 0 아닐때
				if (num > 0) {
					// 양수
					System.out.println("양수입니다.");
				} else {
					// 음수
					System.out.println("음수입니다.");
				}
			}
			scanner.close();
		}
		
		
		
		
		
		
		
		
		
		public static void ifElseEx3() {
			// 과목 번호 입력
			// 1 -> R101, 2 -> R202
			// 3 -> R303, 4 -> R404
			// 나머지 -> 관리자 문의
			Scanner scanner = new Scanner(System.in);
			System.out.print("1:C, 2:C++, 3:Java, 4:Python - ");;
			
			int code = scanner.nextInt();
			if (code == 1) {
				System.out.println("R101");
			} else if (code == 2) {
				System.out.println("R202");
			} else if (code == 3) {
				System.out.println("R303");
			} else if (code == 4) {
				System.out.println("R404");
			} else {
				System.out.println("관리자에게 문의");
			}
			scanner.close();			
		}
		
		
		
		
	
		
		
		
}












	