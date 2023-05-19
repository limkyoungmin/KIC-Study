package j20230518;

class Parent {
	// 1. final + 멤버변수 or 지역변수 -> 상수화(변수의값 고정)(대문자로 사용)
	final int COUNT = 1; // 멤버변수 옆에 final을 붙이면 그 변수 값은 절대 변경 못함
						 // 관례로 final이 붙은 변수명은 대문자로 적음

	// 2. final + 메소드명 : 상속은 허용해주는데 오버라이딩 금지X
	// 메소드의 성격과 전혀 다른 내용으로 변경하면 안되는 경우
	public final void sum(int a, int b) {
		System.out.println("sum : " + (a + b));
	}
	
	// 3. final class명 : 상속금지 -> 내용을 변경하면 안되는 class에 부여(ex 시스템)
	// final class Parent {} -> public class FinalTest extends Parent (상속 불가능X)
}

public class FinalTest extends Parent {
	
	/*
	final 을 붙임으로써 오버라딩이 금지됨
	public void sum(int a, int b) {
		System.out.println("데이터 연습중");
	}
	*/
	
	// count = 1
	public static void main(String[] args) {
		Parent p = new Parent();
		FinalTest ft = new FinalTest();
		// p.count = 2;
		System.out.println("p.COUNT : " + p.COUNT);
		
		ft.sum(10, 10);
	}
}