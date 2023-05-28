package j20230524;

import java.io.*;

// 3. Thread의 작성방법(멀티쓰레드 : 한 개 이상의 쓰레드를 실행시키는 것)
public class MultiThread2 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("실행시킬 단을 입력 : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int dan = Integer.parseInt(br.readLine());
		
		// 1. Runnable 객체 생성
		GooGoo gg = new GooGoo(dan);
		
		// 2. Thread 객체 생성 해서 생성자 인수로 gg 전달
		Thread t = new Thread(gg);
		
		// 3. Thread객체 start()호출
		// 2개의 Thread를 동시에 실행하게 되면 서로 경쟁적으로 실행하기 때문에 실행 결과는 섞어져서 나온다.
		// 그래서 우선순위를 정해야된다.
		// 10 > 5 > 1
		PrintThread pt = new PrintThread();
		t.setPriority(10); // Thread.MAX_PRIORITY
		pt.setPriority(Thread.MIN_PRIORITY); // 1
		t.start(); pt.run();
		
		// GooGoo gg = new GooGoo();
		// gg.run();
		
	}
}

// 2. 구구단을 출력 -> Runnable 인터페이스를 상속
class GooGoo implements Runnable {
	
	private int dan;
	
	public GooGoo(int dan) {
		super();
		this.dan = dan;
	}
	
	@Override
	public void run() {
		
		for (int i = 1; i <= 9; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(dan + "단 : " + dan + " * " + i + " = " + dan * i);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

// 1. Thread를 직접 상속받아서 작성
class PrintThread extends Thread {
	@Override
	public void run() {
		
		for (int i = 1; i <= 9; i++) {
			try {
				/*
				long sleeptime = (int)(Math.random()*1000+1); // 난수 때문에 0 ~ 999 까지만 떠서 +1 해줘야된다.
				System.out.println(i);
				System.out.println("sleep time : " + sleeptime);
				Thread.sleep(sleeptime);
				*/
				Thread.sleep(1000);
				System.out.println(i);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} // for
	} // run
}