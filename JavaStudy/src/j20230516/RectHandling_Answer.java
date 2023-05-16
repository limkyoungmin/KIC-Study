package j20230516;

// 추상화 -> 직사각형의 면적(객체)를 공통속성, 공통기능 -> 새로운 자료형
// 캡슐화 -> 다형성(생성자 오버로딩)
class Rect {
	// 1. 공통멤버변수
	private int x;
	private int y = 10; // 가로, 세로
	//private int area; // 면적(사각형의 넓이) -> double area; // 삼각형 또는 원의 면적
	//-----------------------------------추가된 영역---------------------------------------------------
	//(), (x), (y), (x, y)
	// 기본생성자 : 매개변수X, 내용X
	Rect() {
		// 생성자내부 에서는 자기클래스의 객체명을 사용X -> this 로 써준다.
		//this.x = 20; // r.x = 20;
		//this.y = 30; // r.y = 30;
		this(20,50); // (2)
		System.out.println("기본생성자의 목적 : 멤버변수의 초기화");
	}
	
	Rect(int x) {
		if (x < 0) {
			System.out.println("X값은 음수 입력 불가");
			x = 20; // 값을 입력을 못받기 때문에 초기값 설정
			return;
		}
		this.x = x;
		System.out.println("난 매개변수 1개짜리 생성자 호출됨(this.x) " + this.x);
	}
	
	Rect(double y) { // int -> double (자동형변환)
		this.y = (int)y; // int <- double (명시적인 형변환)
	}
	
	Rect(int x, int y) { // (3)
		this.x = x; // r.x = 20
		this.y = y; // r.y = 50
		System.out.println("난 매개변수 2개짜리 생성자 호출됨(this.x, this.y)"); // (4)
	}
	
	
	
	
	
	
	
	//-----------------------------------추가된 영역---------------------------------------------------
	public void setX(int x) { // int a = 매개변수
		if (x < 0) {
			System.out.println("X값은 음수 입력 불가");
			this.x = 20; // 값을 입력을 못받기 때문에 초기값 설정
			return;
		}
		this.x = x; // 멤버변수 = 매개변수
				// else 안쓰면 return 해서 나가야됨
	}

	public void setY(int y) {
		if (y < 0) {
			System.out.println("Y의 값은 음수 입력 불가");

		} else {
			this.y = y;
		}
	}

	// public 반환형 getXXX() { return 꺼내올 멤버변수명;}
	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	// 2. 공통기능(메소드) 면적을 구하는 메소드
	// 1) 매개변수X, 반환값X : 단순, 반복 -> 똑같은 문장 여러번 반복
	void print() {
		System.out.println("x의 값은 = " + this.x);
		System.out.println("y의 값은 = " + this.y);
		System.out.println("x * y = " + (this.x * this.y));
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

		Rect r = new Rect(); // (1)
		System.out.println("r : " + r);

		//r.x = 10; // 2. 객체명.멤버변수 -> 값(X)
		//r.setX(-20); // x = 20
		//r.setY(30); // y = 30;
		
		// 3. 객체명.호출할 메소드명() or (~)
		r.print();
		
		Rect r2 = new Rect(30); // r2 객체를 생성하면서 인수 1개짜리 생성자 호출
		r2.setY(40);
		r2.print();
		
		Rect r3 = new Rect(50, 60); // r3 객체를 생성하면서 인수 2개짜리 생성자 호출
		r3.print();
		
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