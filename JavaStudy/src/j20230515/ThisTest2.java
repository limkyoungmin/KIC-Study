package j20230515;

// This 가 사용되는 경우
// 2. 현재 생성된 객체를 가리키는 예약어(키워드)로 사용
public class ThisTest2 {

	ThisTest2() {
		// 생성자 내부에서는 자기 클래스의 객체명을 사용할 수 가 없음
		System.out.println("현재 생성된 객체(this) : " + this );
	}

	public static void main(String[] args) {
		
		// ThisTest tt란 객체를 생성하면서 정수형 매개변수 1개짜리 생성자를 호출
		ThisTest2 aa = new ThisTest2();
		
		System.out.println("현재 생성된 객체이름(aa) : " + aa);
		System.out.println("======================================");
		
		ThisTest2 aa2 = new ThisTest2();
		System.out.println("현재 생성된 객체이름(aa2) : " + aa2);
	}
}