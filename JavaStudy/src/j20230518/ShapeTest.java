package j20230518;

import java.util.Scanner;

// 자식클래스명 extends 추상클래스 implements 인터페이스명.....
public class ShapeTest extends Shape implements Drawable {
	
	// public double res = 0.0;
	// print Area();
	@Override
	public void draw() {
		System.out.println("원을 그려서 원의 면적 구하기");
	}

	@Override
	public double area(int r) {
		// java.lang.Math.PI(정적상수)
		return (r * r * Math.PI);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("원의 반지름을 입력하세요.");
		int r = sc.nextInt();
		ShapeTest st = new ShapeTest();
		st.res = st.area(r);
		st.printArea(); // 저장된 면적을 출력
		
		sc.close();
	}

}
