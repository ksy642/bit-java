package com.javaex.api;

import java.text.*;
import java.util.Date; // ctrl shift o -> java.util !!!!!!!!!

// Date 클래스와 Calendar 클래스를 연습
public class DateEx {
	
	public static void main(String[] args) {
	// 날짜 데이터의 획득
		Date now = new Date(); // 현재 날짜와 시간
		String nowStr = now.toString();
		
		System.out.println("현재 날짜 : "+ nowStr);
		System.out.println("현지화된 날짜 : "+ now.toLocaleString());
		// Deprecated된 메소드는 사라질 메소드 -> 다른 방식으로 교체 필수 !!!
		
		// 형식화된 출력
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println("FULL 포맷 : " + df.format(now));
		// FULL, LONG, MEDIUM, SHORT
		df = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println("Long 포맷 : " + df.format(now));
		// TODO : MEDIUM, SHORT 포맷으로 현재 날짜를 출력해 봅시다.
		
		// 자유로운 날짜 데이터 포매팅
		SimpleDateFormat sdf =
				new SimpleDateFormat("yyyy년 MM월 DD일 HH시 MM분 SS초");
		System.out.println("SDF : " + sdf.format(now));
		
		
	}

}















