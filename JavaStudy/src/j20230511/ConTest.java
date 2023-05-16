package j20230511;

public class ConTest {

	public static void main(String[] args) {
		// continue
		System.out.println("레이블이 없는 continue");
		// A:
		for (int a = 0; a < 5; a++) {
			for (int b = 0; b < 5; b++) {
				// 
				if (b == 2) {
					// b == 2 일시 continue에 의해서 skip이 됨
					continue;
					//continue A;
				}
				System.out.println("a = " + a + ", b = " + b);
			}
			System.out.println("========================");
		}
		// A: 컴퓨터 입장으로 적어야 되기 때문에 레이블은 위에 적었지만 실제론 여기서 실행됨
		System.out.println("for문 종료");
	}
}
