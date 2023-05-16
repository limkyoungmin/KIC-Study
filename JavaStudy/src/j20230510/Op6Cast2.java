package j20230510;

public class Op6Cast2 {

	public static void main(String[] args) {
		// 형변환2 + printf() 메소드
		/*
		 * printf(출력양식... 출력할 대상자)
		 * 
		 * decimal(%d 정수값), char(%c 문자), String(%s 문자열), float(%f 소수점)
		 */
		int num1 = 20, num2 = 30;
		System.out.printf("첫번째 숫자 = %d", num1); // 첫번째 숫자 = 20
		System.out.println(); // 출력할 값이 없기 때문에 그냥 줄바꿈만 일어남
		System.out.print('\n'); // \n : 줄바꿈 특수기호
		System.out.printf("첫번째 숫자 = %d, 두번째 숫자 = %d", num1, num2);

		// 형변환
		char ch = 'A'; // 65 : char -> int
		System.out.println();

		/*-
		 * 오타(물리적인 에러), 논리적인 에러 
		 * byte, short, int, long 은 음수(-)를 포함 
		 * char(0~65535) -> int(4byte)로 자동형변환이 안됨 = 예외조항(printf)
		 */
		System.out.printf("문자 %c의 유니코드값 %d\n", ch, (int) ch);
		int ch2 = ch; // char -> int(65)
		System.out.println(ch2);

		/*-
		 * 총점 구하기 
		 * 변수를 쓰는 경우
		 * 1. 계산할때, 2. 입출력 프로그램 작성시, 3. 현재 프로그램의 상태를 저장할때
		 */
		int java = 90;
		int jsp = 85;
		int oracle = 90;
		int sum = java + jsp + oracle;
		// sum = 265입니다.
		System.out.printf("sum = %d 입니다.\n", sum);
		
		// 평균
		double avg = sum / 3; // 88.0
								// sum / 3 이 int이기 때문에 값이 88인 상태에서 double로 바꿔봤자 소수점은 0으로 나옴
		double avg2 = (double) sum / 3; // 처음부터 나누는 값을 double로 형변환 시켜서 계산하면 소수점 까지 출력이됨
		System.out.println("avg = " + avg + " 입니다.");
		System.out.println("avg2 = " + avg2 + " 입니다.");
		
		// 원하는 소수점 자리수 출력
		 /*
		  * 형식) %f -> %전체자리수.소수점자리수
		  * ex) %.2f = 소수점 둘째 자리 까지
		  * 전체 자리수는 써도 되고 안써도 되는데 쓴 경우 출력X, 값은 공백으로 채움
		  */
		System.out.printf("평균(avg) : %5.2f\n", avg2);
		System.out.println("abc\t123\b456"); // \t 탭키 만큼 거리둬서 출력
		System.out.println("\"Hello, World!\""); // \ : 문자열 앞 뒤에 "" 표시 
	}
}
