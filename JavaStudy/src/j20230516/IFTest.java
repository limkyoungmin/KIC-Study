package j20230516;

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
		
		// 단순, 보편적인 기능 -> 절대값, 최대값, 최소값 -> 정적메소드로 제공
		// java.lang.Math
		int abs = -500;
		abs = (abs < 0)?-abs:abs; // 직접코딩 -> 일반메소드 호출
		System.out.println("절대값 abs : " + abs);
		
		abs = Math.abs(-2500); // 클래스명.정적메소드명(~)
		System.out.println("절대값 abs : " + abs);
		
		int max = Math.max(34, 98);
		System.out.println("max : " + max);
	
		int min = Math.min(34, 98);
		System.out.println("min : " + min);
	}
}
