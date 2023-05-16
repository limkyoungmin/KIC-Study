package j20230509;

public class VarTest {

	public static void main(String[] args) {
		System.out.println("변수의 개요 및 선언, 작성법");
		/*-
		 *  변수(Variable) : 메모리(RAM)에 문자, 숫자, 논리적인값 을 저장할 공간
		 *  형식(자바) : 자료형(데이터형 = type) 변수명=값
		 *  형식(자바스크립트) : var 변수명 = 값(자료형을 표시 X)
		 */
		int age; // var age; 정수값 변수선언(공간은 만들어 졌는데 아직 저장안함)
		age = 25;
		// int age = 25; 변수를 선언하면서 동시에 값을 25를 저장
		System.out.println("제 올해의 나이는 " + age + "살 입니다."); // 변수와 결합 할땐 + 를 씀
		int $test = 3; // $ 혹은 _ 만 가능함
		System.out.println($test);
		byte b = 23; // -128 ~ 127 까지만 가능
		short c = 12; // -32768 ~ 32767
		int sum = b + c; // sum = 35(b(23)+c(12))
							// 형변환 때문에 byte와 short 로 저장이 안됨
		System.out.println("sum : " + sum);

		// out of range : 저장 범위를 벗어난 경우
		long no = 1234567890000L; // long형 으로 저장하기 위해선 반드시 결과값 뒤쪽에 L or l 을 붙여야 된다.
		System.out.println("no : " + no);
	}

}
