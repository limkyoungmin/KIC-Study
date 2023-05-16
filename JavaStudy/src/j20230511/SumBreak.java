package j20230511;

public class SumBreak {

	public static void main(String[] args) {
		/*
		 * Question
		 * 1 ~ 100 까지의 합 중에서 3의 배수 또는 5의 배수의 합을 구한 값 중에서
		 * 합계가 200을 넘어가는 최소의 값을 구하시오.
		 */
		
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			if ((i % 3 == 0) || (i % 5 == 0) ) {
				sum += i;
				if (sum >= 200) {
					System.out.println(sum);
					break;
				}
			}
		}
	}
}
