package j20230524;

// import java.lang.Thread 원래는 써야되지만 java.lang 에 소속된 패키지들은 자동으로 import 처리됨
public class ThreadTest {
	
	// 메인쓰레드 -> 메인메소드를 실행시켜주는 내부적인 쓰레드
	public static void main(String[] args) {
		// 현재 작동중인 쓰레드 객체 Thread.currentThread()
		System.out.println(Thread.currentThread().getName()); // .getname = 쓰레드 이름
		System.out.println(Thread.currentThread().getId()); // .getId = 구분 번호
		
		// 쓰레드 : 실시간으로 데이터전송(채팅), 게임, 실시간 전략
		while (true) { // 무한루프 -> 쓰레드의 한 부분
			System.out.println("main Thread 실행중...");
		}
	}
}