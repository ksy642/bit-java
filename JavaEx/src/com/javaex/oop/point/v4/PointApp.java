package com.javaex.oop.point.v4;

// v4
public class PointApp {
	// 필드
	private int x;
	private int y;
	
	// getters/setters
	public int getX() {	return x; }
	public void setX(int x) { this.x = x; }
	public int getY() {	return y; }
	public void setY(int y) { this.y = y; }
	// 메서드
	public void draw() { System.out.printf("점(%d, %d)을 그렸습니다.%n", x, y); }
	
	public static void main(String[] args) {
		Point p1 = new Point(); // 인스턴스화
		p1.setX(10);
		p1.setY(20);
		
		Point p2 = new Point(); // 인스턴스화
//		p2.setX(20);
//		p2.setX(30);
		
		p1.draw();
		p2.draw();
		
		// 오버로딩된 메소드의 활용
		p1.draw(false);
		p2.draw(false);
	}
	
	// 자식 클래스 생성
	ColorPoint cp = new ColorPoint("red");
	ColorPoint cp2 = new ColorPoint(10,20,"blue");

}


















