package j20230510;

public class Op4 {

	public static void main(String[] args) {
		// 삼항연산자 : 조건식에 따라서 변수에 저장된 값을 선택해서 저장시키는 연산자
		System.out.println("대입, 삼항연산자");

		int a = 5;
		int b = 7, x = 10, y = -10;
		// 형식 : 자료형 변수명 = (조건식)?참인값:거짓인값;

		// x가 0보다 크거나 같을경우 x의 값을 넣음
		int absX = (x >= 0) ? x : -x; // 절대값 10 -> 10, -(-10) = 10
		int absY = (y >= 0) ? y : -y; // 거짓이므로 -(-10) = 10
		System.out.println(absX);
		System.out.println(absY);

		 /*- 
		 대입연산자 : 자기변수에 값을 계산을 한 후 자기변수에 대입(저장)
		 산술, 대입 : 배정연산자 = 실행속도가 향상됨
		 ex) int c = a + b, a = a + 1, a = a - 1, a = a * 1, a = a / 1
		 a = a+1 -> a+= 1 -> a++
		 a = a+2 -> a+= 2
		 a = a+3 -> a+= 3
		 a = a-1 -> a-= 1 -> a--
		 a = a-2 -> a-= 2
		 a = a*2 -> a*= 2
		 a = a/2 -> a/= 2
		 */
		
		// int a = 5;
		// int b = 7;
		a+= b; // a = a+b
		System.out.println("a : " + a); // a = 5+7 = 12
		
		a-= b;
		System.out.println("a : " + a); // a = 12-7 = 5
		
		a*= b;
		System.out.println("a : " + a); // a = 5*7 = 35
		
		a/= b;
		System.out.println("a : " + a); // a = 35/7 = 5
		
	}
}
