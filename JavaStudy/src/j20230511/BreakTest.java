package j20230511;

public class BreakTest {

	public static void main(String[] args) {
		// break문
		System.out.println("레이블이 없는 break문(가장 가까운 loop탈출)");
		for (int a = 0; a < 5; a++) {
			for (int b = 0; b < 5; b++) {
				// b 의 카운트가 2가 됐을시(실제론 b는 0부터 시작하니 1) 강제로 종료됨
				if (b == 2) {
					// 가장 가까운 2번째 for문을 탈출함
					break;
				}
				System.out.println("a = " + a + ", b = " + b);
			}
			System.out.println("========================");
		}
		System.out.println("for문 종료");
	}
}
