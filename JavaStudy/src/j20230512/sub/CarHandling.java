package j20230512.sub;

public class CarHandling {

	public static void main(String[] args) {
		// 1. 객체생성 : 객체(저장할 대상자)를 저장할 수 있는 공간을 만듦
		// 형식) 클래스이름(설계도 이름) 객체명(변수) = new 클래스명()
		//int age; // 4byte 기억공간이 생성
		//Car morning; // 객체선언 -> 기억공간이 아직 생성된건 아님(예약된 상태)
		Car morning = new Car(); // 공간이 생성됨
		Car sonata = new Car(); // 서로 다른 공간이 생성됨

		// 객체는 4byte 기억공간
		// morning : j20230512(패키지명).Car(클래스명)@6f2b958e(데이터가 저장된 주소값)
		System.out.println("morning : " + morning);
		System.out.println("sonata : " + sonata);
		
		// (2) setter 메소드를 통해서 값을 저장(캡슐화)
		morning.setName("모닝");
		morning.setOutput(-1000);
		morning.setColor("red");
		morning.setYear(2027);
		/*
		 * // 엉터리값과 올바른값을 구분 못해서 안됨 
		 * morning.name = "모닝"; 
		 * morning.output = -1000;
		 * morning.color = "red"; 
		 * morning.year = 2023;
		 */

		// 3. 메소드 호출(운전) -> 기능 작동(리모컨의 버튼 클릭)
		morning.startEngine(); // 객체명.호출할 메소드명() or (~)
		// speedUp이란 메소드를 호출 하면서 int 150 값을 전달받음
		morning.speedUp(100);
		morning.speedDown(99); // 150 - 30 = 120
		// 객체명(저장된 위치).멤버변수
		System.out.println("차의 이름은 : " + morning.getName());
		System.out.println("차의 베기량은 : " + morning.getOutput());
		System.out.println("차의 현재 속도는 : " + morning.getCurrent_speed());

		// 자주 사용되고 반복적인 코드가 있으면 메소드를 만들어서 호출함
		// 장점 : 코드의 재사용성, 코딩양이 줄어듦(개발시간이 단축)
		//sonata.name = "소나타";
		
		morning.carInfoPrint();
		sonata.carInfoPrint(); // 같은 메소드라도 저장되는 위치가 다르다.
	}
}
