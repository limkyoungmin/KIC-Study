package j20230515;

class Test2 {
	void test() {
		System.out.println("다른 클래스의 객체명은 사용이 가능하다.");
	}
}

// 생성자 오버로딩 + 메소드 오버로딩
// 클래스를 작성하는 목적 : 객체생성을 위해
// 1) 데이터 저장목적, 2) 메소드 호출
public class PrintTest {
	
	// (3) 생성자 오버로딩 -> 3개까지 가능
	public PrintTest() {}
	public PrintTest(char a) { 
		this.print(a); // print('v') (2)
		
		// 생성자 또는 메소드 내부에서는 자기클래스의 객체명은 사용이 안됨
		// 생성자 내부에서는 다른클래스 객체명을 쓰고 메소드도 호출이 가능
		Test2 t2 = new Test2();
		t2.test();
		System.out.println("char 매개변수를 받아서 처리함");
	}
	
	public PrintTest(int a) {
		print(a);
	}
	
	public PrintTest(boolean a) {
		print(a);
	}
	// public PrintTest() {} -> 기본생성자가 없으면 만들어서 호출함
	// 기본생성자가 안만들어지는 경우
	// - 다른 생성자가 존재하는 경우
	/*- (1) 오버로딩 기법을 안썻을때
	void charPrint(char a) {
		System.out.println("a ====> " + a);
	}
	
	void intPrint(int a) {
		System.out.println("a ====> " + a);
	}
	
	void booleanPrint(boolean a) {
		System.out.println("a ====> " + a);
	}
	*/
	
	
	// (2) 메소드 오버로딩
	void print(char a) {
		System.out.println("a ====> " + a); // (3)
	}
	
	void print(int a) {
		System.out.println("a ====> " + a);
	}
	
	void print(boolean a) {
		System.out.println("a ====> " + a);
	}
	
	public static void main(String[] args) {
		
		
		/*- (1)
		pt.charPrint('V');
		pt.intPrint(2023);
		pt.booleanPrint('A' > 'Z');
		*/
		
		/*- (2) 메소드 오버로딩
		PrintTest pt = new PrintTest(); // 객체생성
		pt.print('V');
		pt.print(2023);
		pt.print('A' > 'Z');
		*/
		
		// (3) 생성자 오버로딩
		// PrintTest pt 객체를 생성하면서 인수 1개짜리 문자열처리생성자 호출
		PrintTest pt = new PrintTest('v'); // (1)
		PrintTest pt1 = new PrintTest(2023); // (5)
		PrintTest pt2 = new PrintTest(3 > 2); // true
		
	}

}
