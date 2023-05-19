package j20230518;

/*-
 * static(정적의)
 *  1. 정적멤버변수
 *  
 *  	멤버변수(인스턴스변수) : 클래스 내부에서 선언된 변수 -> 공유가 안됨X(독립적 저장)
 *  	정적멤버변수(클래스변수) : 모든 객체가 공유할 수 있도록 만들어진 변수
 *  						 형식) : 클래스명.정적멤버변수명 or 객체명.정적멤버변수명
 *  
 *  2. 정적메소드
 *  3. 초기화 블럭(static {범위})
 */

class Car {
	String color;	// c1.color("Red")
	String model;
	String owner; // 주문자
	
	// 차의 종류와 상관없이 차의 생산량의 합을 계산
	static int serialNumber; // static을 붙이면 공유가 됨(공유값)(ex. 단체가 사용할 프린터 1대)

	public Car(String color, String model, String owner) {
		super(); // class Car extends Object 때문에 super가 생성됨
		this.color = color;
		this.model = model;
		this.owner = owner;
		serialNumber++; // 공통적으로 모든 객체가 불러다 사용하고 싶을때(공유하고 싶을때)
	}
	
	public static int getNumber() {
		return serialNumber; // 정적메소드 내부에서는 멤버변수 사용이 안됨X
							 // this를 정적메소드 내부에서 사용할 수 없기 때문에 멤버변수 사용이 안됨X
	/*-
	 * public static String getNumber() {
	 * 		return color; // 사용이 안되는 이유는 color 앞에 this가 생략되어있는 상태(this때문에)때문
	 * 					  // static 붙은 변수만 사용 가능
	 * }
	 *              
	 */
	}
	// main() 보다 먼저 실행시킬 구분이 필요하다면 static 영역설정
	// 환경설정 -> DB연동
	static { // 초기화 블럭
		System.out.println("제일먼저 main() 보다 실행할 구문이 필요할때");
		System.out.println("DB접속을 먼저 가능하도록 설정하고 싶을때");
		System.out.println("1. static 정적변수 -> 2. main() 호출");
		System.out.println("3. 정적메소드 -> 4. 클래스 -> 순으로 메모리에 로딩");
	}
}

public class CarFactory {

	public static void main(String[] args) {
		
		Car c1 = new Car("Red", "SM5", "홍길동");
		Car c2 = new Car("Blue", "SONATA", "임꺽정");
		Car c3 = new Car("Pink", "morning", "홍길동2");
		System.out.println("차 생산량(객체명.정적변수) : " + Car.serialNumber);
		System.out.println("차 생산량(객체명.정적변수) : " + c2.serialNumber);
		System.out.println("차 생산량(객체명.정적변수) : " + Car.getNumber());
		System.out.println("차 생산량(객체명.정적변수) : " + c1.getNumber());
	}

}
