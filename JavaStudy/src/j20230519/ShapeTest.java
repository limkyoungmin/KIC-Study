package j20230519;

public class ShapeTest {

	public static void main(String[] args) {
		System.out.println("객체자동형변환 연습");
		Shape s = new Shape();
		Point p = new Point();
		Line l = new Line();
		Square sq = new Square();
		
		s.shapeDraw();
		p.pointDraw();
		l.lineDraw();
		sq.squareDraw();
		
		System.out.println("== 객체 자동형변환 ==");
		
		Shape sh[] = new Shape[4]; // Shape형의 객체만 저장
		sh[0] = s;
		sh[1] = p; // 자식클래스의 객체 -> 자동으로 부모형으로 변환 -> 저장
		// sh[1] = new point(); // 익명개체
		// Shape s = new Point();
		sh[2] = l; // 부모형 < 자식형 -> 부모의 멤버, 메소드를 모두 가지고 있다
		sh[3] = sq; // 직원(부모) = 팀장(자식) (직원의기능(부모) + 팀장의기능(자식))
	
		for(int i = 0; i < sh.length; i++) {
			sh[i].draw(); // 메소드명은 같지만 객체가 다르기에 다른기능 구현
			whoAreYou(sh[i]);
		}
	}
	
	// 혈연관계
	// 형식) 객체명 instanceof 부모클래스명 = true(자식 OK), false(자식 X)
	static void whoAreYou(Shape sh) {
		// Shape 자손인지 확인
		if (sh instanceof Shape) {
			System.out.println("Shape인걸 확인 했습니다.");
			System.out.println("즉 Shape의 자손이 맞습니다.");
			
		} else {
			System.out.println("Shape가 아닌걸 확인 했습니다.");
		}
		
		// Point 자손인지 확인
		if (sh instanceof Point) {
			System.out.println("Point인걸 확인 했습니다.");
			System.out.println("즉 Shape의 자손이 맞습니다.");
		} else {
			System.out.println("Point가 아닌걸 확인 했습니다.");
		}
		
		// Line 자손인지 확인
		if (sh instanceof Line) {
			System.out.println("Line인걸 확인 했습니다.");
			System.out.println("즉 Shape의 자손이 맞습니다.");
		} else {
			System.out.println("Line가 아닌걸 확인 했습니다.");
		}
		
		// Square 자손인지 확인
		if (sh instanceof Square) {
			System.out.println("Square인걸 확인 했습니다.");
			System.out.println("즉 Shape의 자손이 맞습니다.");
		} else {
			System.out.println("Square가 아닌걸 확인 했습니다.");
		}	System.out.println("===============================");
	
	}
}

// 상속관계(Shape -> Point -> Line -> Square)
class Shape {
	
	// shape 에서만 사용하는 메소드
	void shapeDraw() {
		System.out.println("Shape");
	}
	
	// 모든 도형에 공통으로 사용하는 메소드
	void draw() {
		System.out.println("draw -> Shape");
	}
}

// 상속받은 자식 클래스 : Point(점)
// 상속의 조건은 is a 관계성립(draw, shapeDraw + pointDraw)
class Point extends Shape {
	void pointDraw() {
		System.out.println("Point");
	
	}
	
	// 오버라이딩
	void draw() {
		System.out.println("draw -> Point");
	}
}

// Line = 점(Point)들이 모이면 직선이됨
// Point 의 메소드(3개) + Line 메소드(1개)
class Line extends Point {
	
	void lineDraw() {
		System.out.println("lineDraw");
	}
	
	// 오버라이딩
	void draw() {
		System.out.println("draw -> line");
	}
}

// Square -> Line(4개) + 1개 -> 5개
// 다형성 : 같은 메소드를 호출 했을때 처리 결과가 다르다(문화차이)
class Square extends Line {
	void squareDraw() {
		System.out.println("squareDraw");
	}
	
	// 오버라이딩
	void draw() {
		System.out.println("draw -> squareDraw");
	}
}