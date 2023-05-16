package j20230512.sub;

public class Car {
	/*-
	 * 추상화 : 새롭게 저장할 대상자(자동차, 학생, 건물...)를 저장할 목적으로 만들어진 설계도
	 * 
	 * 1.객체(car) : 저장하고 싶은 대상자(공통점)
	 * 1. 멤버변수 : 클래스 내부에서 선언된 변수 -> 초기값이 설정(8가지 기본 자료형)
	 */
	private String name; // 자동차 이름(명사) Default : null
	private int output; // 자동차 배기량 Default : 0, double : 0.0 초기화
	private int year; // 자동차 만들어진 년도 Default : 0
	private String color; // 자동차 색 Default : null

	//현재 상태
	private int current_speed; // 자동차 속도
	// int sidong = 0; // 시동걸린 유무
	private boolean sidong = false; // 시동 유무
	
	// 2. setXXX(매개변수){}
	public void setName(String n) {
		if (n != null) {
			name = n;
		} else {
			System.out.println("name 값은 반드시 입력해야 합니다.");
		}
		/* 
		 * if (n != null)
		 * 	name = n;
		 * else
		 *  System.out.println("name 값은 반드시 입력해야 합니다.");
		 */
		
	}
	public void setOutput (int ou) { // -1000
		if (ou < 0 || ou > 5000) {
			System.out.println("0 ~ 5000 사이의 허용 범위를 넘었습니다.");
			output = 1000; // 정상적으로 입력 안될시 기본값 설정
			return; // 탈출문 return 변수 or 수식 or 객체(반환값이 있는 경우
		}
		output = ou;
					
	}
	public void setYear (int y) {
		if (y < 0 || y > 2023) {
			System.out.println("년도는 음수이거나 2023올해보다 클 수 없음");
		} else {
			year = y;
		}
	}
	public void setColor (String c) {
		color = c;
	}
	public void setCurrentspeed (int cu) {
		current_speed = cu;
	}
	public void setSidong (boolean si) {
		sidong = si;
	}
	
	// getter method : 저장된 데이터를 불러와서 화면에 출력
	// 형식) public 반환형(자료형) getXXX(멤버변수){ return 멤버변수 }
	public String getName() {
		return name;
	}
	public int getOutput() {
		return output;
	}
	public int getYear() {
		return year;
	}
	public String getColor() {
		return color;
	}
	public int getCurrent_speed() {
		return current_speed;
	}
	public boolean getSidong() {
		return sidong;
	}

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
	// 속도가 음수 이거나 170km 이상 안나오게 설정
	void speedUp(int speed) { // function speedUp(speed){}
		// 시동이 걸린상태
		if(sidong == true) {
			if ((speed < 0) || (current_speed + speed >= 170)) {
				System.out.println("정상적인 범위가 아닙니다. 음수 혹은 170 이상이면 안됩니다.");
				current_speed = 120; // 정상적인 범위가 아니기 때문에 정상적인 속도로 고정시킴
			} else {
				current_speed += speed; // += : current_speed = current_speed + speed
				System.out.println(speed + "km 만큼 속도가 증가됨");
			}	
		} else { // 시동이 안걸린상태
			System.out.println("시동이 안걸렸습니다. 시동을 걸어 주세요.");
			
		}
		
	}
	
	// 4) 속도 감소시키기
	void speedDown(int speed) { // function speedUp(speed){}
		if(sidong == true) {
			if ((current_speed - speed < 0) || speed >= 171) {
				System.out.println("정상적인 속도 감소가 아닙니다. 음수 혹은 171이상이면 안됩니다.");
			} else {
				current_speed -= speed; // += : current_speed = current_speed - speed
				System.out.println(speed + "km 만큼 속도가 감소됨");
			}
		} else {
			System.out.println("시동이 안걸렸습니다. 시동을 걸어 주세요.");
		}
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
