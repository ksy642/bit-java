package com.javaex.collection.hash;
import java.util.*;
public class HashSetEx {

	
	public static void main(String[] args) {
//		basicHashSet();
		customHashSet();
	}
	
	
	private static void basicHashSet() {
		// HashSet
		// 		순서가 중요하지 않고, 중복허용X , 집합으로서의 자료형
		
		HashSet<String> hs = new HashSet<>();
		
		// 객체의 추가 : add
		hs.add("Java");
		hs.add("C");
		hs.add("C++");
		hs.add("Python");
		hs.add("Java");  // 중복 데이터
		
		System.out.println("SET : " + hs);
		System.out.println("Set의 크기 : " + hs.size());
		// 자바를 두번 입력했지만 중복되어 있기에 마지막껀 씹힌다.
		
		// 포함 여부의 확인 : contains
		System.out.println("C++를 포함? : " + hs.contains("C++"));
		System.out.println("Linux를 포함? : " + hs.contains("Linux"));
		
		// 삭제 : 인덱스 없으므로 객체 삭제만 가능
		hs.remove("C++");
		System.out.println("SET : " + hs);
		
		hs.remove("C++");
		System.out.println("SET : " + hs);
	}


	
	private static void customHashSet() {
		// 사용자 정의 클래스의 Hash 자료형에서의 사용
		HashSet<Student> hs = new HashSet<>();
		
		Student s1 = new Student(10, "홍길동");
		// 	public Student(int code, String name) 이거때문에 순서가 코드부터
		Student s2 = new Student(20, "장길산");
		Student s3 = new Student(10, "홍길동"); // 일부로 중복되게 씀		
		
		
		// 추가
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		
		System.out.println("학생 명부 : " + hs);
		
		// 해시코드의 확인
		System.out.println("s1의 hashCode : " + s1.hashCode());
		System.out.println("s3의 hashCode : " + s3.hashCode());
		
		System.out.println("s1의 hashCode와 s3의 비교 : " 
				+ (s1.hashCode() == s3.hashCode()));
		System.out.println("s1의 값과 s3의 값 비교 : "
				+ s1.equals(s3));
				
	}







	
}








