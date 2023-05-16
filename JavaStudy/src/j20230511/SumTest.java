package j20230511;

public class SumTest { // 프로그램 -> 회사

	// 객체를 왜 생성하는가?
	// 1. 데이터를 저장하기 위한 목적
	// 2. 메소드를 호출하기 위해
	// 지금은 2번
	public static void main(String[] args) {
		/*
		 * 2개의 값을 입력 받아서 사칙연산 하는 프로그램(+, -, *, /) 작성
		 */

		// 지역변수(멤버변수가 아님)
		int a = 100;
		int b = 50;
		
		// 1) 단순, 반복적인 구문을 메소드로 작성
		/*System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " + (a - b));
		System.out.println("a * b = " + (a * b));
		System.out.println("a / b = " + (a / b));*/
		
		SumTest st = new SumTest(); // 객체생성 -> 메소드 호출 목적
		// 재사용성, 중복코드 제거
		st.calculate(a, b); // 객체명.호출메서드(매개변수....)
		st.calculate(78, 90);
		st.calculate(23, 45);
		st.calculate(12, 78);
		
		for (int i = 1; i <= 10; i++) {
			st.calculate(90, 9);
		}
	}
	
	// work method
	// 매개변수가 없는 메소드
	void calculate(int a, int b) {
		System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " + (a - b));
		System.out.println("a * b = " + (a * b));
		System.out.println("a / b = " + (a / b));
		System.out.println("===========================");
	}
}