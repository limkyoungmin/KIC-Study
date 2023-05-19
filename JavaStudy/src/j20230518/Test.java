package j20230518;

abstract class ImTest { // 추상메소드가 하나라도 있으면 해당 클래스는 추상클래스가 된다.
	
	public static int sum(int x, int y) {
		return (x + y);
	}
	
	// 추상메소드 : 메소드의 선언만 되어있는 메소드
	// 형식) 메소드명();
	// 형식) abstract 메소드명();
	public abstract void draw();
	abstract public void go();
	public void go2() {}; // 일반 메소드
}

public class Test extends ImTest {
	public void draw() {
		
		/* 생략되어있지만 그대로 가지고 있음
		 * 1. 상속을 알고 있어야 된다.
		 * 2. 메소드 호출방법도 알고 있어야 된다.
		 * public static int sum(int x, int y) {
		 * return (x + y);
		 * }
		 */
		
		
		// stack 선언
		int result = sum(10, 20);
		System.out.println("result : " + result);
	}
	public void go() {} // 내용이 없더라도 오버라이딩은 반드시 해줘야됨
	
	public static void main(String[] args) {
		Test t = new Test();
		t.draw();
		System.out.println("result : " + sum(30, 40)); // 정적메소드 안에서는 일반메소드는 그냥 못불러서 객체를 생성해서 불러야됨
	}
}