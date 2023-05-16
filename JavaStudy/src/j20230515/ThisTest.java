package j20230515;

// This 가 사용되는 경우
// 1. 메소드(생성자 포함)를 작성할때
//    멤버변수와 매개변수가 서로 같을 때 구분하는 목적
public class ThisTest {

	private int a = 100; //2 (), (a)

	ThisTest(int a) {
		this.a = a; // 멤버변수 = 매개변수
	}
	
	public void setA(int a) {
		this.a = a;
	}
	
	public int getA() {
		return a;
	}

	public static void main(String[] args) {
		
		// ThisTest tt란 객체를 생성하면서 정수형 매개변수 1개짜리 생성자를 호출
		ThisTest tt = new ThisTest(200);
		tt.setA(400);
		System.out.println(tt.getA());
	}
}