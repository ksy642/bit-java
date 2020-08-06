package com.javaex.basic;

// 연산자 연습
public class OperEx {

	public static void main(String[] args) {
		arithOperEx();
		incDecOper();   // 8월 6일꺼!!
		logicalOper();
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
		
//      08월 06일 추가
		
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
		}
}






















