package j20230517.test;

// 간같은 패키지 안에 존재할지라도 private로 되어 있으면 접근X -> 값저장도 안됨X -> 메소드 호출도 안됨X
public class B {

	public static void main(String[] args) {
		A a = new A();
		/* private는 자기 클래스만 허용함
		a.i = 20;
		a.print();
		*/
		System.out.println("==default권한==");
		a.j = 300;
		a.print2();
		
		System.out.println("==protected권한==");
		a.k = 300;
		a.print3();
		
		System.out.println("==public권한==");
		a.m = 400;
		a.print4();
		
	}
}