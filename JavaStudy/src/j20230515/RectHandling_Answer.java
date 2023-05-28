package j20230515;

// 추상화 -> 직사각형의 면적(객체)를 공통속성, 공통기능 -> 새로운 자료형
class Rect3 {
	// 1. 공통멤버변수
	private int x;
	private int y = 10; // 가로, 세로
	private int area; // 면적(사각형의 넓이) -> double area; // 삼각형 또는 원의 면적

	public void setX(int a) { // int a = 매개변수
		if (a < 0) {
			System.out.println("X값은 음수 입력 불가");
			x = 20; // 값을 입력을 못받기 때문에 초기값 설정
			return;
		}
		x = a; // 멤버변수 = 매개변수
				// else 안쓰면 return 해서 나가야됨
	}

	public void setY(int b) {
		if (b < 0) {
			System.out.println("Y의 값은 음수 입력 불가");

		} else {
			y = b;
		}
	}

	// public 반환형 getXXX() { return 꺼내올 멤버변수명;}
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	// 2. 공통기능(메소드) 면적을 구하는 메소드
	// 1) 매개변수X, 반환값X : 단순, 반복 -> 똑같은 문장 여러번 반복
	void print() {
		System.out.println("x의 값은 = " + x);
		System.out.println("y의 값은 = " + y);
		System.out.println("x * y = " + (x * y));
	}
	
	// 2) 매개변수O, 반환값X : 입력 -> 출력, 계산, 저장
	void area(int a, int b) {
		x = a;
		y = b;
		System.out.println("x * y = " + (x * y));
	}
	
	// 3) 매개변수O, 반환값O : 계산, 웹프로그래밍 방식
	// 반환값 : 호출되는 메소드가 계산한 결과값 -> 메소드 자체에서 처리X
	//			호출하는 caller에서 처리하는 계산값 : 보고O 반환값O
	int area2(int a, int b) {
		int result = a * b;
		return result; // return 계산 결과값(변수) or 수식 or 객체
	}

}

public class RectHandling_Answer {

	public static void main(String[] args) {

		Rect3 r = new Rect3(); // 객체 생성(계산할 공간을 생성)
		System.out.println("r : " + r);

		//r.x = 10; // 2. 객체명.멤버변수 -> 값(X)
		r.setX(-20); // x = 20
		r.setY(30); // y = 30;
		
		// 3. 객체명.호출할 메소드명() or (~)
		r.print();
		
		// 4. 매개변수를 전달 -> 계산 -> 출력
		r.area(20, 40); // area라는 메소를 호출 하면서 매개변수 20,40을 전달
		
		// 5. 반환값이 있는 메소드 호출
		// 형식) 반환받는 변수명 = 객체명.호출할 메소드명
		int reply = r.area2(60, 40);
		System.out.println("계산받은 결과값(reply) : " + reply);
		System.out.println("==================================");
		System.out.println("r.area2(30, 40) : " + r.area2(30, 40));

		
	}

}