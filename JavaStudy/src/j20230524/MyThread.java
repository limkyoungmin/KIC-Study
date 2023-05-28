package j20230524;

class Test2 {
	String name;
}

// 2. Runnable 인터페이스를 상속받아서 작성 -> run() 기능
public class MyThread extends Test2 implements Runnable {
	
	
	// Thread의 기능을 작성
	@Override
	public void run() {
		
		// 알파벳 찍기
		while (true) { // 아스키코드 65번값 부터 시작
				System.out.println("is Running");
			try {
				Thread.sleep(500); // 1000 -> 1초 동안 멈췄다 실행(500 -> 500ms)
				System.out.println("Thread 이름은 : " + Thread.currentThread().getName());
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}
	
	public static void main(String[] args) {

		// 1. Runnable 인터페이스를 상속받은 자식클래스의 객체를 생성
		MyThread mt = new MyThread(); // 부여
		
		// 2. Thread객체를 생성 -> 생성자내부에 매개변수로 자식클래스 객체 전달
		// t.setName("테스트") 도 가능
		Thread t = new Thread(mt, "테스트");

		// 3. start() -> run() 호출
		t.start();
		
	}
}
