package j20230511;

public class ForTest {

	public static void main(String[] args) {
		// 1번째
		System.out.println("1. for문의 유형(c++)");

		/*-
		 * 형식) for(초기식;조건식;증감식)
		 *            실행구문
		 */

		//       1)    2)5)... 4)...
		for (int i = 1; i <= 5; i++) {
			//                                            3)6)...
			System.out.println("반복할 for문 연습 " + i + "번째");
		}

		// 2번째
		System.out.println("2. for문의 유형(C언어 유형)");
		// 초기식의 변수를 for문 밖에 선언(C언어)
		int k;

		for (k = 10; k > 5; k--) {
			System.out.println(k + "번째 테스트");
		}

		// 3번째
		System.out.println("3. 초기식이 생략된 for문의 유형");
		int j = 10;

		for (; j > 5; j--) {
			System.out.println(j + "번째 테스트");
		}
		System.out.println("3번째 종료");

		// 4번쨰
		System.out.println("4. 최소한의 for문 구성(증감식도 생략가능)");
		// 초기식은 for문 밖에 선언이 가능
		int l = 1;
		l++; // 증감식은 for문 바깥에서 선언할 수가 없음
		for (; l <= 20;) {
			System.out.println(l + "번째 테스트");
			l++;
		}

		// 5번째
		/*-
		 * System.out.println("5. for문 전부 생략"); 
		 * for(;;) // = while (true)
		 * 		System.out.println("무한루프");
		 */

		// 6번째
		System.out.println("6. 합계, 곱 을 동시에 구하기");
		// 1 ~ 100 까지의 합을 구하기
		int sum = 0;
		int gap = 1; // 곱하기(곱하기라 0은 안됨)

		for (int o = 1; o <= 100; o++) {
			sum += o; // sum = sum + o;
			gap *= o; // gap = gap * o;
		}
		System.out.println("1 ~ 100의 합계는 : " + sum);
		System.out.println("1 ~ 100의 곱은 : " + gap);
		
		// 1 ~ 100 까지의 짝수의 합을 구하기
		int sum1 = 0;
		int sum2 = 0;
		for(int p = 1; p <= 100; p++) {
			if (p % 2 == 0) {
				sum1 += p;
			} else {
				sum2 += p;
			}
		}
		System.out.println("1 ~ 100의 짝수의 합계는 : " + sum1);
		System.out.println("1 ~ 100의 홀수의 합계는 : " + sum2);
	}
}
