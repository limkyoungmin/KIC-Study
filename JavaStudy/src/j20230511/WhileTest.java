package j20230511;

public class WhileTest {

	public static void main(String[] args) {
		/*-
		 * 반복문 : 특정 조건에 따라서 반복해서 실행이 되는 문장(반복해서 문장사용)
		 * 
		 * 1. 반복할 횟수가 정해져 있는 경우 : for, while
		 * 2. 반복할 횟수가 정해져 있지 않은 경우 : for(X), while(O)(입출력 프로그램)
		 * 
		 */
		// 단순하고 반복적인 문장 (1) 반복할 횟수 (2) 반복해서 수행할 문장
		/*-
		 * System.out.println("while구문 연습1"); // 시작값 : 1
		 * System.out.println("while구문 연습2"); 
		 * System.out.println("while구문 연습3");
		 * System.out.println("while구문 연습4"); 
		 * System.out.println("while구문 연습5"); // 종료값 : 5
		 */
		// (2) while문 - 끝나는 문장이 없을시 무한루프에 빠짐
		// 조건 먼저 확인하고, 조건이 거짓이 될 때까지 반복
		int i = 1;
		while (i <= 5) {
			System.out.println("while구문 연습" + i);
			i++; // i = i+1
		}
		System.out.println("while구문 종료");

		// (3) do-while
		// 먼저 실행 후 조건은 나중에 봄
		int j = 1;
		do {
			System.out.println("do구문 연습" + j);
			j++; // i = i+1
		} while (j <= 5);
		System.out.println("do구문 종료");
	}
}
