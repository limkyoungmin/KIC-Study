package j20230517.test;

public class A {
//class A {

	private int i = 10; // 1. 멤버변수에 부여 -> 객체명.멤버변수 = 값(x)
						// public void setI (int i) { this.i = i; }

	// 추가
	int j; // 접근지정자(ex.private, public)가 없으면 default(기본생략) 접근지정자를 부여
	
	protected int k;
	
	public int m;

	// 2. 메소드 앞에 부여 -> 외부(같은 패키지 또는 다른 패키지)에서 접근이 안됨(X)
	private void print() {
		System.out.println("private i = " + i);
	}

	// 추가1
	void print2() {
		System.out.println("j(default) : " + j);
	}
	
	// 추가2
	protected void print3() {
		System.out.println("protected k : " + k);
	}
	
	// 추가3
	public void print4() {
		System.out.println("public m : " + m);
	}

	public static void main(String[] args) {
		A a = new A();
		a.i = 20;
		a.print();
		System.out.println("==default권한==");
		a.j = 200;
		a.print2();
		
		System.out.println("==protected권한==");
		a.k = 300;
		a.print3();
		
		System.out.println("==public권한==");
		a.m = 400;
		a.print4();
	}

}