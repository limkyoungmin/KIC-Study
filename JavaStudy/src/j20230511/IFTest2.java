package j20230511;

public class IFTest2 {

	public static void main(String[] args) {
		// 중첩 IF문
		System.out.println("중첩 if문");

		// 조건1 su = 1 ~ 100 까지의 범위에 해당되는 숫자만 입력을 받음
		// 조건2 짝수, 홀수 판별(수/2 == 0(2의 배수) 수/3 != 0(3의 배수)
		int su = 101; // 사용자로부터 값을 입력받아 저장
		if ((su >= 1) && (su <= 100)) { // && : and
			if (su % 2 == 0) { // 조건식(변수, 연산자(관계, 논리))
				System.out.println(su + " 은 짝수 입니다.");
			} else {
				System.out.println(su + " 은 홀수 입니다.");
			}
		} else {
			System.out.println("100사이의 값을 입력 하세요.");
		}
		System.out.println("if문 종료");
		
		// 조건1 age = 12 이상인가
		// 조건2 부모랑 동반 했나
		int age = 11;
		//String result = "";
		boolean withParent = false;
		
		if(age >= 12) {
			System.out.println("관람가능");
		} else {
			if (withParent) {
				System.out.println("부모랑 관람가능");
			} else {
				System.out.println("불가");
			}
		}
	}
}