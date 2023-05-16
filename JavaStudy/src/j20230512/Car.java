package j20230512;

public class Car {
	/*-
	 * 추상화 : 새롭게 저장할 대상자(자동차, 학생, 건물...)를 저장할 목적으로 만들어진 설계도
	 * 
	 * 1.객체(car) : 저장하고 싶은 대상자(공통점)
	 * 1. 멤버변수 : 클래스 내부에서 선언된 변수 -> 초기값이 설정(8가지 기본 자료형)
	 */
	String name; // 자동차 이름(명사) Default : null
	int output; // 자동차 배기량 Default : 0, double : 0.0 초기화
	int year; // 자동차 만들어진 년도 Default : 0
	String color; // 자동차 색 Default : null

	//현재 상태
	int current_speed; // 자동차 속도
	// int sidong = 0; // 시동걸린 유무
	boolean sidong = false; // 시동 유무

	// 2. 공통기능(움직임) -> 메소드 구현(함수) -> 요구분석
	// 1) 시동걸기(단순 반복) : 매개변수 랑 반환값이 없음
	void startEngine() { // 멤버변수의 값을 저장하거나 불러오기
		sidong = true;
		System.out.println("시동이 걸림!!!");
	}
	
	// 2) 주차하기(단순 반복)
	void stop() {
		sidong = false;
		current_speed = 0;
		System.out.println("정상적으로 주차 완료");
	}
	
	// 기존의 데이터를 입력 받아서 저장, 계산, 출력
	// 3) 속도 증가시키기 = 매개변수는 다른 메서드에서 똑같이 사용이 가능함(지역변수이기 때문에)
	void speedUp(int speed) { // function speedUp(speed){}
		current_speed += speed; // += : current_speed = current_speed + speed
		System.out.println(speed + "km 만큼 속도가 증가됨");
	}
	
	// 4) 속도 감소시키기
	void speedDown(int speed) { // function speedUp(speed){}
		current_speed -= speed; // += : current_speed = current_speed - speed
		System.out.println(speed + "km 만큼 속도가 감소됨");
	}
	
	// 5) 차의 정보를 출력(단순 반복)
	void carInfoPrint() {
		System.out.println("==차의 정보 출력==");
		System.out.println("차의 시동유무 : " + sidong);
		System.out.println("차의 이름 : " + name);
		System.out.println("차의 배기량 : " + output);
		System.out.println("차의 연식 : " + year);
		System.out.println("차의 색깔 : " + color);
		System.out.println("차의 현재 속도 : " + current_speed);
	}
}
