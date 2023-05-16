package j20230511;

public class SwitchTest2 {

	public static void main(String[] args) {
		System.out.println("switch 구문(범위지정)");

		// 0 ~ 10 까지만 입력을 받는 경우
		int su = 11;

		// switch 조건식에 따라서 case 값이 적게 나올수 있도록 조건을 해줘야됨
		switch (su) {
		// case 1 ~ 10 : case의 범위를 지정할 때 사용
		case 0:
		case 2:
		case 4:
		case 6:
		case 8:
		case 10:
			System.out.println(su + " 은 짝수 입니다.");
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 9:
			System.out.println(su + " 은 홀수 입니다.");
			break;
		// if문의 else if 구문의 맨 마지막 else구문
		default:
			System.out.println("입력받을 수 있는 값은 1 ~ 10 까지만");
			break;
		}
		System.out.println("switch 구문 연습 종료");
	}
}
