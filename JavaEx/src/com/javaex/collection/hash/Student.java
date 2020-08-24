package com.javaex.collection.hash;

public class Student {
	// 필드
	private int code;
	private String name;
	
	// 생성자
	public Student(int code, String name) {
		this.code=code;
		this.name=name;
	}
		
	// toString
	@Override
	public String toString() {
		return "Student [code=" + code + ", name=" + name + "]";
	}

	// hashCode, equals 메서드 오버라이드
	
	@Override
	public int hashCode() {
//		return super.hashCode();
		return code;
		// 이걸로 인해서 결과값이
		// s1의 hashCode와 s3의 비교 : true 
	}

	
	@Override
	public boolean equals(Object obj) {
		// 체크 후 다운캐스팅!
		if (obj instanceof Student) {
			Student other = (Student)obj; //  다운 캐스팅
			return name.equals(other.name) && code == other.code;
		} // 결과값이 s1의 값과 s3의 값 비교 : true
		return super.equals(obj);
	}
	


	


















}








