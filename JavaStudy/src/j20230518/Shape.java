package j20230518;

// 원의 면적을 구해서 출력시켜주는 역활(추상클래스) 설계 + 메소드 제공
public abstract class Shape {
							 // 직사각형, 원(소수점), 삼각형
	public double res = 0.0; // 모든 도형에서 공통으로 사용할 변수(면적)
	
	// 원
	public abstract double area(int r); // 추상메소드(원의 반지름)
	
	//직사각형
	// public abstract int area(int x, int y);
	
	// 공통의 기능을 일반메소드로 만들면 상속 받아서 바로 사용할수 있음
	public void printArea() {
		System.out.println("도형의 총 넓이 : " + res);
	}
}
