package j20230517;

// 상속과 생성자
public class SuperTest {

	public static void main(String[] args) {
		
		C c = new C(); // (1) 객체 c를 생성하면서 문자열처리 생성자호출
		
	}
}

// A
// 자바의 모든 클래스는 기본적으로 Object 클래스의 자식임
// extends Object 는 기본적으로 생략
class A extends Object{
	public A() {
		super(); // (4)
		System.out.println("난 A의 생성자, 호출됨"); // (5)
	}
	
}

// B
// class B extends Object
class B extends A {
	public B() {
		super(); // (3)
		System.out.println("난 B의 생성자, 호출됨"); // (6)
	}
	
	//추가(인수가 있는 생성자를 호출하는 경우에는 부모클래스에 반드시
	//     인수에 따라 처리해주는 생성자가 반드시 있어야 호출이 가능하다.
	public B(String s) {
		System.out.println("s 호출됨, " + s);
	}
}

//C
class C extends B { // 상속관계
	public C() {
		System.out.println("난 C의 생성자, 호출됨");
	}
	
	public C(String s) { 
		// super(s) s 는 나중에 추가됨 -> //추가 확인
		super(s); // (2) 부모클래스의 기본생성자를 호출
		System.out.println(s); // (7)
	}
}