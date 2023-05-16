package j20230512; //같은 패키지에 불러올 클래스가 있으면 자동으로 불러옴

public class TVHandling {

	public static void main(String[] args) {
		// 1. TV객체(같은구조 지만 모양이 다름(size))
		TV smartTV = new TV(); // 객체생성 : 저장할 공간을 만듦
		
		// 2. 객체명.멤버변수 = 값
		System.out.println("smartTV : " + smartTV); // 주소
		smartTV.name = "삼성 smartTV s34";
		smartTV.maker = "삼성";
		smartTV.color = "red";
		smartTV.size = 50;
		
		// 3. 주문 -> 배송 -> 설치 : 객체명.호출할 메소드명() or (~)
		smartTV.turnOn();
		smartTV.channelUp(45); // 45값을 보내서 다시 받음(45번 채널로 감)
		smartTV.channelDown(15); // 45 - 15 = 30
		smartTV.speakChannel("ocn");
		
		// 전체채널 편성표
		smartTV.tvDisplay();
		smartTV.turnOff();
	}
}
