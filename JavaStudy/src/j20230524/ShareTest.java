package j20230524;

import java.io.*;

// 입출력(RandomAccessFile) + Thread
// RandomAccessFile : 특정위치에 접근해서 정해진 파일을 생성해주는 클래스
public class ShareTest implements Runnable{
	
	RandomAccessFile raf = null;
	
	// 2개의 Thread를 생성해서 파일에 특정값을 저장
	public ShareTest() {
		try {
			// 1. 경로 포함해서 생성할 파일명 2. 모드(r,w, rw)
			// rw 가 없으면 생성, 동일한 파일명이 존재하면 덮어씌움
			raf = new RandomAccessFile("c:\\webtest\\readme8.txt", "rw");
			
			// 2. Thread 객체 생성
			Thread t1 = new Thread(this, "lys");
			Thread t2 = new Thread(this, "test");
			
			// 3. Thread 실행
			t1.start();
			t2.start();
			
		} catch (IOException e) {
			System.out.println("파일생성에 오류!!!!!!!!!!!");
			System.out.println("이유는 " + e); // e.toString();
		}
	}
	
	@Override
	public synchronized void run() {
		try {
			for (int i = 0; i < 1000; i++) {
				raf.writeBytes(Thread.currentThread().getName() + "[" + i + "]" + raf.getFilePointer() + "\n");
			}
		} catch (Exception e) {
			System.out.println("파일에 데이터 출력 오류 : " + e);
		}
	}
	
	public static void main(String[] args) {
		
		// 1. Runnable 객체 생성
		ShareTest st = new ShareTest();
		//st.run();
		// 보통은 데이터값을 저장 or 메소드 호출
		// 만약 객체만 호출하고 싶으면
		// new SharTest(); // 익명객체 -> 객체이름만 모름
		
	}
}