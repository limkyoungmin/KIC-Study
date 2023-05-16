package j20230511;

public class ForTest2 {

	public static void main(String[] args) {
		// 제어문에 또 다른 제어문 -> 중첩 for문 (=이중 for문)
		System.out.println("중첩 for문");
		for (int a = 0; a < 5; a++) { // outer for문
			for (int b = 0; b < 5; b++) { // inner for문
				System.out.println("a = " + a + ", b = " + b);
			}
			System.out.println("========================");
		}
		System.out.println("for문 종료");
	}
}
