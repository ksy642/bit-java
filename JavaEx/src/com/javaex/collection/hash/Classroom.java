package com.javaex.collection.hash;

public class Classroom {
	// 필드
	private String roomName;
	private String subject;
	
	// 생성자
	public Classroom(String subject) {
		this.subject = subject;
		
	}
	
	// 두 번째 생성자
	public Classroom(String subject, String roomName) {
		this.subject = subject;
		this.roomName = roomName;
	}
	
	
	// toString 오버라이드

	@Override
	public String toString() {
		return "Classroom [roomName=" + roomName + ", subject=" + subject + "]";
	}

	@Override
	public int hashCode() {
		// 과목명이 같으면 해시코드를 반환한다.
		return subject.hashCode();
//		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Classroom) {
			return hashCode() == obj.hashCode();
		}
		return super.equals(obj);
	}

	









	
	
}












