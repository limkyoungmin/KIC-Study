package j20230510;

// 변수 : 자료형(종류, 크기를 지정해 주는것) -> 변수, 상수의 특성
public class Vartest4 {

	public static void main(String[] args) {
		// 변수선언 : 같은 자료형의 변수를 여러개 동시에 선언하고 싶다.
		// int num; int num2; int num3;
		// 선언하면서 값도 같이 저장 -> ,로 나열함
		int num, num2 = 3, num3 = 4;
		num = 23;
		System.out.println(num);

		// 변수는 중간에 값이 변경되기 때문에 맨 마지막 값만 저장됨
		num = 45;
		System.out.println(num);
		// 상수(constant)는 값이 정해지면 중간에 값이 변경되지 않음
		int num4 = 5, num5 = 6;

		/*-
		 * 상수화된 변수는 일단 값을 저장하게 되면 중간에 값이 변경 안됨
		 * 변수 앞에 final을 붙이면 상수화된 변수가 됨
		 * 상수화된 변수는 전부 대문자로 사용함
		 */
		final int NUM6 = 90;

		// NUM6 = 100; : 이미 상수화 됐기 때문에 에러남
		/*-
		 * 서로 다른 변수에 똑같은 값을 반복적으로 넣어줄때 편하게 값을 저장할 수 있음 
		 * num2 = 70; 
		 * num3 = 70; 
		 * num4 = 70;
		 * num5 = 70;
		 */
		num2 = NUM6; 
		num3 = NUM6;
		num4 = NUM6;
		num5 = NUM6;

		System.out.println("num = " + num + ", NUM6 = " + NUM6);
	}

}
