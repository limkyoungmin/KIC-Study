package j20230517.test2;

 import j20230517.test.A;

//public class C {
public class C extends A{
	public static void main(String[] args) {
		A a = new A();
		
		/*
		a.i = 20;
		a.print();
		
		System.out.println("==default권한이 안되는 이유는 다른 패키지에 있어서==");
		a.j = 200;
		a.print2();
		
		System.out.println("== 상속을 받은 자식클래스의 객체도 접근X == ");
		C c = new C();
		c.j = 300;
		c.print2();
		
		System.out.println("==protected권한이 안되는 이유는 다른 패키지에 있어서==");
		a.k = 300;
		a.print3();
		*/
		
		/*
		System.out.println("상속을 받은 자식클래스의 객체면 접근 O");
		C c = new C();
		c.k = 400;
		c.print3();
		*/
		
		System.out.println("==public권한==");
		a.m = 400;
		a.print4();
		
		// 자식
		C c = new C();
		c.m = 600;
		c.print4();
	}
}