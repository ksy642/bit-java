package com.javaex.basic;
// 8월 10일 월요일!!
import java.util.Scanner;
public class ConditionalEx {

	public static void main(String[] args) {
//		ifElseEx();
//		ifElseEx2();
//		ifElseEx3();;
//		switchEx();
//		switchEx2();
//		whileEx();  // 1~100까지의 합산
//		whileEx2(); // 구구단 만들기
//		whileEx3(); // 실행시키지마...끄기 힘듬ㅋㅋ 빨간버튼눌러서 종료
//		dowhileEx();
//		forEx();     // for문으로 만든 구구단
//		continueEx();
		breakEx();
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
			System.out.print("1:C, 2:C++, 3:Java, 4:Python - ");
			
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
		
		
		
		
	
		
		public static void switchEx() {
			// ifElseEx3 와 동일한 내용을 switch
			// switch는 전달받은 변수의 값을 이용해서 흐름을 제어 (==)
			Scanner scanner = new Scanner(System.in);
			System.out.print("1:C, 2:C++, 3:Java, 4:Python - ");
			
			int code = scanner.nextInt();
			switch(code) { // switch는 변수의 값을 비교  및  흐름제어
			case 1: //code == 1
				System.out.println("R101");
				break;                           // 항상 적어야됨!! break!!
			case 2: 
				System.out.println("R202");
				break;     
			case 3: 
				System.out.println("R303");
				break;  
			case 4: 
				System.out.println("R404");
				break;  
			default: // else 위에 case 문에서 일치하는 결과 없을 때
				System.out.println("관리자에게 문의");
			}
			scanner.close();
		}
		
		
		
		
		
		
		
		
		public static void switchEx2() {
			// 월정보 (정수) 입력
			// 1, 3, 5, 7, 9, 11 -> 31일
			// 2 -> 28일
			// 4, 6, 8, 10 ,12 -> 30일
			Scanner scanner = new Scanner(System.in);
			System.out.print("월 입력 : ");
			int month = scanner.nextInt();
			String days = "";
			
			switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				days = "31일";
				break;
			case 2:
				days = "28일";
			case 4:
			case 6:
			case 9:
			case 11:
				days = "30일";
				break;
			default:
				days = "?";
			}
			System.out.println(days);
			scanner.close();
		}
		
		
		
		
		
		
		

		public static void whileEx() {
			// 반복문을 사용, 1부터 100까지 숫자를 합산하여 출력
			int num = 1; // 시작값, 조건 비교
			int total = 0; // 합산 변후
			
			// while loop
			while (num<=100) { // num가 100 이하인 동안 반복
				total += num; // <- total = total + num
			// 주의 : while문은 반복 조건을 개발자가 직접 컨트롤 해줘야 한다.
				num++;
			}
			System.out.println("합산값: " +total);
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		public static void whileEx2() {
			// 단수를 입력, 해당 단의 곱셈표를 출력
			Scanner scanner = new Scanner(System.in);
			System.out.print("단을 입력: ");
			int dan = scanner.nextInt();
			// 제어용 변수
			int i = 1;
			
			while(i<=9) { // 9이하일 동안
				System.out.println(dan + " * " + i +  " = " +(dan*i));
				// 종료를 위한 제어변수를 잘 제어
				i++;
			}
			scanner.close();
		}
		
		
		
		
		
		
		
		
		
		
		
		public static void whileEx3() {
			// while은 종료를 위한 제어 변수를 잘 제어하여
			// 무한루프에 빠지지 않도록 해야한다.
			// 경우에 따라서는 의도적으로 무한루프를 사용하기도 한다.
			while(true) { // 조건이 참이면 항상 반복이 된다.
				System.out.println("무한루프...Ctrl+C to Quit");
			}	
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		public static void dowhileEx() {
			// 숫자를 입력 받아서 합산
			// 0을 입력 받으면 반복을 종료
			int num = 0;
			int total = 0; // 합산 변수
			
			Scanner scanner = new Scanner(System.in);
			
			// 최소 1번을 실행해야 하는 반복 do ~ while
			// or 반복 조건이 loop 문 내부에서 결정되는 경우 do ~ while
			do { // 일단 실행
				System.out.print("정수입력.[0이면 종료]");
				num = scanner.nextInt();
				total += num;
			} while (num != 0);
			System.out.println("합산값 : " + total);
			scanner.close();
		}
		
		
		
		
		
		
		
		
		
		
		
		public static void forEx() {
			// 문법 내에서 제어변수 초기화, 반복조건, 증감식을 모두 포함
			// 1. 반복 횟수가 정해져 있을 때
			// 2. 제어 변수를 for문의 해주기 떄문에 while 보다 안전
			
			// 단수를 입력, 해당 단의 곱셈표를 출력 (for 문 버전)		}
			Scanner scanner = new Scanner(System.in);
			System.out.print("단을 입력하세요.");
			int dan = scanner.nextInt();
			
			for(int i=1; i<=9; i++) {
				// 내용 출력
				System.out.println(dan + " * " + i + " = "
						+ (dan * i));
			}
			scanner.close();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		public static void continueEx() {
			// 1부터 100까지 for loop
			// 2의 배수이거나 3의 배수면 출력 안함
			// 나머지는 출력
			for (int i=1; i<=100; i++) {
				// 반복문 중간에 continue
				// 남은 구문은 실행하지 않고 다음번 루프 진행
				if ( i%2 == 0 || i%3 ==0 ) {
					// 아래 남은 코드는 실행되지 않고 다음 루프 진행
					continue;
				}
				System.out.println(i);
				
			}
		}
			
		
		
		
		
		
		
		
		
		
		
		
		public static void breakEx() {
			// 1부터 루프를 돌려서 6과 14로 모두 나누어 떨어지는 수는 얼마인가?
			// 어디까지 루프를 돌려야 할지 예측이 쉽지 않기 때문에 while 을 사용하도록 하자.
			int num=1;
			while(true) {
				if (num % 6 == 0 && num % 14 == 0) {
					break; // 루프 탈출
				} 
				num ++;
			}
			System.out.println(num);
		}
			
}
		















			
			
		
		
	




	