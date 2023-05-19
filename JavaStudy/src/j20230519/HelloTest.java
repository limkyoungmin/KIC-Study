package j20230519;

// 예외처리
public class HelloTest {

	public static void main(String[] args) {
		
		int i = 0; // 첨자
		String greetings[] = {"객체형변환", "예외처리", "예외처리방법"};
		while (i < 4) { // 3 < 4 논리적인 에러 발생
			System.out.println(greetings[i]); // 논리적인 에러
			i++;
		}
	}

}
