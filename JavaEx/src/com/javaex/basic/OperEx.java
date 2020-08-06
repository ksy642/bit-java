package com.javaex.basic;

// 연산자 연습
public class OperEx {

	public static void main(String[] args) {
		arithOperEx();
		incDecOper();   // 8월 6일꺼!!
		logicalOper();
		bitOper();
		conditinalOper();
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
		
		
		
		
		
		
		
		
		
		
		
// 08월 06일 추가
		
		System.out.println();
		System.out.println();
		System.out.println("08월 06일 목요일");
		System.out.println();
	
		// 실수를 0으로 나눈다
		System.out.println("실수 / 0 = " + (4.0 / 0));
		// 결과값이 Infinity 무한대가 나온다.
		// 무한대에 산술 연산 -> 무한대
		System.out.println("무한대의 산술 = " + (4.0 / 0 + 10));
		// 연산 -> 계산할 수 없는 값 (NaN -> Not a Number)
		System.out.println("0.0 / 0.0 = " + (0.0 / 0.0));
		// NaN 포함된 산술 연산 -> NaN (계산 불가)
		System.out.println("NaN 산술 => " + (0.0 / 0.0 + 20));
		//유한수인지 확인하기
		System.out.println("유한수의 확인 : " + Double.isFinite(4.0 / 0));
		//NaN인지 확인
		System.out.println("NaN 확인 : " + Double.isNaN(0.0 / 0.0));
		
		System.out.println();
	}
	
	
	
	
		// 증가, 감소 연산자
		public static void incDecOper() {
			System.out.println("@@@ 증가, 감소 연산자 @@@");  
			
		// 순서가 중요!
			int a = 5;
			int b = 5;
			
			// 후위 연산자
			System.out.println(a);    // a = 5 이다.
			System.out.println(a++); // a 후 1을 증가 = 그대로 5
			System.out.println(a);   // 위에서 6이 됐으니 6 으로 나옴
			
			System.out.println();
			// 전위 연산자
			System.out.println(b);    // b = 5 이다.
			System.out.println(++b); // 1을 증가 후 b = 5
			System.out.println(b);   // b = 6		
	}
		
		
		
		
		
		public static void logicalOper() {
			System.out.println("@@@ 비교 연산자 @@@");  
			//비교 연산자 >, >=, <, <=
			//     ==(같다), != (같지 않다)
			
			// 논리연산자:  && (논리곱 : AND) 둘다만족해야한다.
			//           || (논리합 : OR)
			//           ! (논리부정 : NOT)
			int n = 5;
			// n 은 0초과, 10미만인가?
			//   조건 1: n>0 이고 (AND)
			//   조건 2: n<10
			boolean b1 = n > 0;
			boolean b2 = n < 10;
			boolean r = b1 && b2;
			System.out.println("a>0 and a<10 ? "+ r); 
			
			System.out.println();
			System.out.println("@@@ 비교 연산자...논리 부정 @@@");
			// n은 0이하이거나, 10이상인가?
			// 조건1 : n <=0 이거나 (OR)
			// 조건2 : n>= 10
			boolean c1 = n <= 0;
			boolean c2 = n >= 10;
			boolean t = c1 || c2;
			System.out.println("a<=0 and a>=10 ? "+ t); 
			
			boolean y = !r;
			System.out.println("논리 부정 : "+ y); 
			boolean u = !t;
			System.out.println("논리 부정 : "+ u); 
			
			System.out.println(); 
		}
		
		
		
		
		
		
		// 비트 연산자
		public static void bitOper() {
			System.out.println("@@@ 비트연산자 @@@");
			// and (&), or (|), nor (~)
			// 정수형 데이터를 비트 단위로 제어하는 연산자
			byte b1 = 0b1101; //  1 1 0 1
			byte b2 = 0b0111; //  0 1 1 1
			
			int result = b1 & b2;//bit and 연산
			System.out.println(Integer.toBinaryString(result)); 
			//   1 0 1 나오는데 결과값이...
			// 0 1 0 1 이게 맞는 결과값이다.
			// AND 연산자는 1-1 은 모두 1 / 나머지 1-0 조합은 죄다 0 이기때문
			
			result = b1 | b2; // bit or 연산
			System.out.println(Integer.toBinaryString(result)); 
			// 1 1 1 1 나와야됨.
			// | OR 연산자는 0-0=0 제외하고 모두 1 이다.
			
			result = ~b1; // bit not 연산 <-> 1
			System.out.println(Integer.toBinaryString(result));
			// 앞에 11111111 들은 빼버려   0010 맞는 표현
			System.out.println(result); 
			
			// 비트 시프트
			// << : 비트를 왼쪽으로 이동    (정수현 2의 배수의 곱)
			// >> : 비트를 오른쪽으로 이동 (정수형 2의 배수의 나눗셈)
			System.out.println("비트 쉬프트 좌우 이동하기");
			System.out.println("@@@ 1 을 << 1칸 옮겨보자! @@@");
			int val = 1;
	//		System.out.println(val); 
			System.out.println(Integer.toBinaryString(val << 1)); 
			System.out.println("@@@ 100 을 >> 2칸 옮겨보자! @@@");
			val = 0b100; // x 1 0 0
			// >> 2 옮겨보자!
			System.out.println(Integer.toBinaryString(val >> 2));
			// x x x 1 이렇게 나온다.
			System.out.println();
		}
		
		
		
		
		
		
		// 3항 연산자
		public static void conditinalOper() {
			System.out.println("@@@ 3항 연산자 @@@");
			
			// 논리비교 ? 참 일때 : 거짓 일때
			// 간단한 값의 제어, 코드 가독성을 높일 수 있다.
			int a = 10;
			// a가 짝수면 "짝수", 아니면 "홀수" 문자열
			String message = a % 2 ==0 ? "짝수" : "홀수";
			System.out.println("a 는 짝수입니까??? : '" + message + "' 입니다.");
					
			int score = 85;
			// 점수가 80 이상이면 Good
			// 점수가 50점 이상이면 Pass
			// 그렇지 않으면 Fail
			message = score >= 80 ? "Good" :
				score >= 50 ? "Pass" : "Fail";
			System.out.println("시험 결과 85점 : '" + message + "' 입니다.");			
			score = 70;
			System.out.println("시험 결과 70점 : '" + message + "' 입니다.");			
			score = 50;
			System.out.println("시험 결과 50점 : '" + message + "' 입니다.");
			score = 40;
			System.out.println("시험 결과 40점 : '" + message + "' 입니다.");
			// 중첩 가능하긴 하지만 가독성이 떨어지는 좋지않은 코드다...
			System.out.println("중첩 가능하긴 하지만 가독성이 떨어지는 좋지않은 코드다...");
			
			
			
			
			
		}		
}






















