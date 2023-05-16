package j20230510;

public class Op5Cast {

	public static void main(String[] args) {
		// 묵시적인 형변환
		System.out.println("자동 형변환");

		// 1. 적은 데이터값이 큰 데이터공간으로 들어갈때 : 자료형의 크기에 맞춰서 형변환 O
		// 단점 : 저장되는것은 문제가 없지만 메모리 낭비가 발생이 된다.
		byte s = 12; // 2진수 00001100 -> 8421 부호비트 = 0(양수) or 1(음수)
		short ss = 12; // 2진수 00000000 00001100
		int n = s; // 2진수 00000000 00000000 00000000 00001100

		// 2. 계산 중간에 자료형이 변환 될때 : 적은 데이터가 큰 데이터로 변환
		char c = 'A'; // 65
		int n2 = c + 1; // char(2byte) + int(4byte) = 소+대 -> 대+대(int + int) = int
		System.out.println("n2 : " + n2); // 65 + 1 = 66
		System.out.println("(char)n2 : " + (char) n2); // 66 = B

		// 명시적인 형변환(강제형변환)
		// 단점 : 데이터 손실이 일어남
		int su = (int) 3.5; // int는 정수여서 소수점인 0.5가 저장이 안됨
		System.out.println(su); // 3
		
		int x = 123;
		float y = x + 12.3f; // int + float : 적은 데이터 + 큰 데이터 -> float + float -> float -> 123.0f + 12.3f
		System.out.println(y);
		
		// 강제형변환 주의점
		System.out.println("강제형 변환 주의할 점");
		
		byte s2 = 12;
		short s3 = 45;
		int result = s2 + s3; 	// byte + short = short + short = short(X)
								// byte + short = int + int(O)
								// +, -, *, / 는 강제로 int형으로 바뀜
		System.out.println(result);
		
		// 주의 : 수식값을 형변환 할때에는 수식 전체를 () 로 묶어줘야 한다.
		short re2 = (short) (s2+s3);
		System.out.println(re2);
	}
}
