package com.javaex.oop.point.v2;

// v2.
// 생성자 연습
public class Point {
   // 필드
   private int x;
   private int y;
   
   // 사용자 정의 생성자가 있을 경우
   // JVM은 기본생성자를 만들지 않는다.
   
   // 사용자 정의 생성자
   // 에러가 나는 이유는 기본 생성자가 없어졌기 때문
   public Point() {}
   public Point(int x, int y) {
	   this.x=x;
	   this.y=y;
   }
	     
   
   
   public int getX() {
      return x;
   }
   public void setX(int x) {
      this.x = x;
   }
   public int getY() {
      return y;
   }
   public void setY(int y) {
      this.y = y;
   }
   
   // 메서드
   public void draw() {
      System.out.printf("점(%d, %d)을 그렸습니다.%n", x,y);
   }

}