package j20230524;

// 클래스 내부에서 특정객체를 한 개 만 생성 = 대여 -> 반납 (메모리 절약목적)
// 스프링 내부에서도 동일한 처리
public class Test {

	// 규칙
	// 1. 객체를 한 개 만 생성 -> 공유해서 사용할 수 있도록 -> 정적멤버변수(static)
	private static Test instance = null; // 공유객체
	//             Singleton instance = new Singleton();

	// 2. 객체를 생성 -> 자동으로 호출되는 메소드 : 생성자
	//                                   사용목적 : 초기화
	// 형식) private 생성자(){ } = 외부에서 객체생성X
	private Test() {
		System.out.println("인스턴스(=객체)");
	}

	// 3. 공유객체를 다른 모든 사람들에게 공유할수 있도록 정적메소드(static)로 제공한다.
	public static Test getInstance() {

		// 안 만들어져 있다면 하나생성 해서 요구하는 쪽에 만들어진 객체를 대여한다.
		if (instance == null) {

			// 만들고자 하는 객체를 공유객체로 등록
			// 형식) synchronized(클래스명.class) { 처리 구문; }
			synchronized (Test.class) {
				if (instance == null) {
					instance = new Test();
				}
			}
		} // outer if
		return instance;
	}
}
