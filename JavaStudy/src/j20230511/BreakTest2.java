package j20230511;

public class BreakTest2 {

	public static void main(String[] args) {
		// break문
		System.out.println("레이블이 있는 break문(레이블과 가장 가까운 loop탈출)");
		
		A: // 레이블명:
		for (int a = 0; a < 5; a++) {
			for (int b = 0; b < 5; b++) {
				// 형식) 조건식 break 레이블명
				if (b == 2) {
					// b == 2 일시 A인 레이블명으로 탈출함
					break A;
				}
				System.out.println("a = " + a + ", b = " + b);
			}
			System.out.println("========================");
		}
		// A: 컴퓨터 입장으로 적어야 되기 때문에 레이블은 위에 적었지만 실제론 여기서 실행됨
		System.out.println("for문 종료");
	}
}
