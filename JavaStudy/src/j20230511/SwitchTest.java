package j20230511;

public class SwitchTest {

	public static void main(String[] args) {
		System.out.println("switch 구문");

		int su = 50;

		// switch 조건식에 따라서 case 값이 적게 나올수 있도록 조건을 해줘야됨
		switch (su % 2) {
		case 0:
			System.out.println(su + " 은 짝수 입니다.");
			break;
		case 1:
			System.out.println(su + " 은 홀수 입니다.");
			break;
		}
		System.out.println("switch 구문 연습 종료");
		/*-
		if (su % 2 == 0) { // 조건식(변수, 연산자(관계, 논리))
			System.out.println(su + " 은 짝수 입니다.");
		} else {
			System.out.println(su + " 은 홀수 입니다.");
		}*/
	}
}
