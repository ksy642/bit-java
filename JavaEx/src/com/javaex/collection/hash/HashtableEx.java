package com.javaex.collection.hash;
import java.util.*;
public class HashtableEx {

	public static void main(String[] args) {
		// Hashtable : Map형 자료형이다
		// key - 값의 쌍으로 데이터를 관리
		// key는 중복될 수 없다!!
		Hashtable<String, Classroom> map = new Hashtable<>();
		
		// 데이터 넣기
		map.put("101", new Classroom("Java", "R101"));
		map.put("102", new Classroom("C", "R202"));
		map.put("103", new Classroom("Python", "R303"));
		map.put("104", new Classroom("Linux", "R404"));
		
		System.out.println("강의 출력 : " + map); // 순서는 없다 (중요x)
		
		// 데이터 가져오기 : get
		System.out.println("303 강의실 강의 : " + map.get("303"));
		
		// 데이터 변경 : put
		// 이미 있는 key 라면 데이터 덮어쓰기
		map.put("202", new Classroom("C#", "R202"));
		System.out.println("202 강의실 강의 : " + map);
		
		// 키가 있는지 확인 : containsKey()
		System.out.println("key에 202가 있는가? : " + map.containsKey("202"));
		System.out.println("key에 505가 있는가? : " + map.containsKey("505"));
		
		// 값의 검색
		System.out.println("Java : " + map.containsValue("Java"));
		System.out.println("Java 강의가 포함되어있는가 ? " 
				+ map.containsValue(new Classroom("Java")));
		// 해쉬코드, equals 가 적절히 오버라이드 되어 있어야 정상 작동한다.
		
		
		// Iterator를 이용한 자료의 순회
		Iterator<String> it = map.keySet().iterator();
		
		// 순회
		while(it.hasNext()) { // 뒤에 내용이 더 있는가?
			Classroom room = map.get(it.next()); // 키를 이용한 데이터 추출
			System.out.println("강의실 : " + room);
		}
		
		
		// 맵 지우기
		map.clear();
		System.out.println("MAP : " + map);
	}


	

	
}




