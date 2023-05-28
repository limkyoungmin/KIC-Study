package j20230524;

// 급여통장 (공유데이터) -> ATM(쓰레드) -> 공과금, 보험금, 대출이자...

class ATM implements Runnable {
	private long money = 10000;
	
	@Override
	public void run() {
		
		// 형식1) synchronized(공유할데이터){ 처리해야할 문구; } // DB연동
		synchronized (this) { // this -> ATM객체
			for (int i = 0; i < 5; i++) {
				try {
					Thread.sleep(1000); // 1000ms = 1초간격으로 휴식
				} catch (Exception e) {}
				
				if (getMoney() <= 0) {
					System.out.println("잔액이 부족 합니다. 더이상 출금이 안됩니다.");
					break; // 0원이 있으니 탈출
				}
				withDraw(1000);
			} // for
		} // syn
	}
	
	// 돈을 인출 = 수정
	public void withDraw(long howmuch) {
		
		// 양수인 경우(마이너스가 아닌경우)만 돈을 인출
		if (this.getMoney() > 0) {
			money -= howmuch; // money = money - howmuch
			System.out.println(Thread.currentThread().getName() + ", " + getMoney());
		} else {
			System.out.println("잔액이 부족 합니다.");
		}
	}
	
	// 잔액을 조회 -> 저장된 데이터를 꺼내와서 출력
	// getXXX
	public long getMoney() {
		return this.money;
	}
	
}
public class SyncTest {

	public static void main(String[] args) {
		
		ATM atm = new ATM();
		Thread t1 = new Thread(atm, "보험금"); // Thread 이름
		Thread t2 = new Thread(atm, "공과금");
		t1.start(); t2.start(); // run() -> withDraw()호출
	}
}