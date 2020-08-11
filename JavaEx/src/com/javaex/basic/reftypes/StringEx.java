package com.javaex.basic.reftypes;
// 8월 11일
public class StringEx {

	public static void main(String[] args) {
		stringBasic();
		stringFormat();
		
	}
	
	
	
	public static void stringBasic() {
		// 가장 기본적인 참조자료형을 이해
		String str; // 선언
		str = "Java"; // 할당
		String str2 = "Java"; // 선언 + 할당
		String str3 = new String("Java");
		
		// 참조 타입의 경우,
		// ==, != 은 주소 비고 (hashCode 비교)
		System.out.println(str == str2);   // true
		System.out.println(str2 == str3);  // false

		// 값의 비교
		// 객체 내부에 equals 라고 하는 메소드를 이용
		System.out.println(str.equals(str2)); // true
		System.out.println(str2.equals(str3)); // true
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void stringFormat() {
		// 포맷 문자
		// %d (10진)  , %s (문자열)  ,  %f (실수)
		// %n  (개행)  ,  %%(%)
		// 0 개의 0 중에서 0개를 먹었다.
		String fruit = "'과일'";
		int total = 10;
		int eat = 3;
		
		String fmt = "%d개의  %s중에서 %d개를 먹었다.%n";
		System.out.printf(fmt, total, fruit, eat);
			//	포맷지정에 주의하도록 하자
				
		// %n 은 한줄 띄우는 역할을 한다.
		
		// printf 에서만 사용하는 것이 아니고     ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
		// 새로운 문자열을 생성할 때 생성한다!!
		String res = String.format("파이상수는 %f 입니다.", Math.PI);
		System.out.println(res);
		// %f 의 경우 -> 소숫점 자리를 제한할 수 있다.
		res = String.format("파이상수는 %.3f 입니다.", Math.PI);
		System.out.println(res);
	}
	
	
	
	
	
	
	

}

























