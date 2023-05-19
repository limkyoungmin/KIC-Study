package j20230518;

// 3. 메소드의 반환형을 통해서 객체를 얻어오는 방법 : 자바의 메모리 사용량 확인
public class GCCollector {

	public static void main(String[] args) {
		// Runtime r = new Runtime(); // 생성자가 없음 = new 사용 X
		Runtime r = Runtime.getRuntime(); // 생성자가 없기 때문에 = class명.정적메소드명()
		System.out.println("r : " + r);

		byte test[] = new byte[1024]; // 1024개의 정수값 저장공간

		test[0] = 20;
		test[1] = 34;
		/*-
		... 
		test[1023] = 100;
		*/
		// 참조형 자료형: 클래스, 배열, 인터페이스
		System.out.println("test : " + test);

		// totalMemory : 전체 사용량  -  freeMemory : 현재 남은양 = 현재 사용중인 메모리양 (ex 100 - 40 = 60)
		System.out.println("before 사용량 : " + (r.totalMemory() - r.freeMemory()) / 1024 + "KB");
		
		// usb 인식X -> 외부손상
		// 자바의 특징 : 불필요로하는 메모리가 발생 -> 자동으로 메모리를 해제
		test = null; // 일부러 주소값을 지움 -> 데이터 공간낭비
		System.gc(); // 수동으로 해제하는 메소드
		
		// 1802KB -> 637KB
		System.out.println("after 사용량 : " + (r.totalMemory() - r.freeMemory()) / 1024 + "KB");
	}

}