package j20230518;

public class VolTest {

	public static void main(String[] args) {
		System.out.println("설계한 대로 실행체크(단위테스트)");
		
		// 객체는 다르지만 공통적으로 사용하는 메소드는 같음(통일성 부여)
		TV t = new TV();
		Radio ra = new Radio();
		
		t.turnOn();
		ra.turnOn();
		
		t.volumUp(80);
		ra.volumUp(70);
		
		// 비슷한 기능을 가진 메소드 작성 -> 메소드명을 통일(오버로딩)의 확장판(모든 클래스 단위로 설계)
		
	}
}