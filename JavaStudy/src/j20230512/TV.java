package j20230512;

public class TV {
	// 1. 공통의 저장할 특성, 특징
	String maker; // 제조사 -> default : null
	String name; // 모델명
	String color; // 색깔
	int size; // 인치 -> default : 0, boolean default : false, double default : 0.0
	
	// 상태
	boolean power; // 전원 상태
	int channel; // 채널
	
	// 2. TV기능
	// 1) 리모콘으로 전원 on(단순, 반복) -> 매개변수X, 반환값X
	void turnOn() {
		power = !power; // power = true;
		System.out.println("TV 전원 ON, 로딩중...");
	}
	
	// 2) 전원 off
	void turnOff() {
		power = !power; // power =! true; -> false
		System.out.println("TV 전원 OFF");
	}
	
	// 3) 채널 change -> up(매개변수 O), 반환값X
	void channelUp(int ch) {
		channel = ch; // channel++;
		System.out.println("현재 변경된 채널은 : " + channel + "입니다.");
	}
	
	// 4) 채널 change -> down
	void channelDown(int ch) {
		channel -= ch; // channel--;
		System.out.println("현재 변경된 채널은 : " + channel + "입니다.");
	}
	
	// 5) TV채널정보 -> 채널 편성표
	void tvDisplay() {
		System.out.println("== TV정보 출력 ==");
		System.out.println("모델명 : " + name);
		System.out.println("색상 : " + color);
		System.out.println("메이커 : " + maker);
		System.out.println("현재 채널 : " + channel);
		System.out.println("전원 상태 : " + power);
	}
	
	// 6) 말하면 채널변경기능 -> 매개변수 O -> 말 (String), 반환값X
	void speakChannel(String ch) { // "ocn"(35번 채널), "sbs sports"(121번 채널)
		//String 객체 -> 문자열을 비교(equals("비교할 문자열")) 대,소문자 구분O
		//                          equalsIgnoreCase : 대소문자 구분X
		if (ch.equals("ocn")) {
			channel = 35;
		} else if (ch.contentEquals("sbs sports")) {
			channel = 121;
		} else if (ch.equals("tvn")) {
			channel = 3;
		}
		System.out.println("현재 선택한 채널은 " + channel + "로 이동중");
		
	}
}
