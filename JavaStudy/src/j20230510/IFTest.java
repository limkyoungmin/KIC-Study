package j20230510;

public class IFTest {

	public static void main(String[] args) {
		// 입출력 -> 사용자로부터 값을 입력 -> Scanner 객체를 이용
		// 짝수, 홀수 판별(수/2 == 0(2의 배수) /3 != 0(3의 배수)
		int su = 31;
		if (su % 2 == 0) { // 조건식(변수, 연산자(관계, 논리))
			System.out.println(su + " 은 짝수 입니다.");
		} else {
			System.out.println(su + " 은 홀수 입니다.");
		}

		System.out.println("삼항연산자로 변경");
		String su2 = (su % 2 == 0) ? "짝수 입니다." : "홀수 입니다.";
		System.out.println("입력받은 값 (su2) = " + su2);
		System.out.println("if 연습중"); // 순차문
	}
}
