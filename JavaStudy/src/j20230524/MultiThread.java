package j20230524;

// 1. Thread를 만드는 방법 (Thread클래스를 상속받아서 작성)
// Thread를 상속받는 이유 = run() 기능 메소드 때문에
public class MultiThread extends Thread {
	
	public MultiThread(String s) {
		super(s); // 부모의 쓰레드 이름을 대신 써주는 생성자 호출
		// this.setName(s); <-> this.getName();
	}
	
	// Thread의 기능을 작성
	@Override
	public void run() {
		
		// 알파벳 찍기
		for (char i = 'A'; i <= 'Z'; i++) { // 아스키코드 65번값 부터 시작
			try {
				Thread.sleep(500); // 1000 -> 1초 동안 멈췄다 실행(500 -> 500ms)
				System.out.println(i);
				System.out.println("Thread 이름은 : " + this.getName());
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}
	
	public static void main(String[] args) {
		
		// 1) Thread 클래스의 상속을 받기
		// 2) run() 메소드 재정의 하기
		// 3) Thread 객체 생성
		// 4) 가동
		
		MultiThread mt = new MultiThread("임시"); // 부여
		
		// mt.run() 도 가능하지만 run을 직접적으로 호출하는건 추천 안함
		// 이유는 프로그램의 안정성 때문 -> 안정성을 보장할 수 없다.
		// run = callback method
		// callback method : 운영체제가 내부적으로 불러다 사용하는 메소드
		mt.start();
		
		System.out.println("main쓰레드를 계속 사용할 수 있는지 없는지 판단");
	}

}
