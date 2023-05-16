package j20230510;

public class Op1 {

	public static void main(String[] args) {
		/*-
		System.out.println("산술, 증감연산자");
		
		int a = 3, b = 4;
		
		// 연산의 기본 단위 : int
		int c = a + b;
		System.out.println("c : " + c);
		*/
		// +, -, *, / 의 결과 값이 int 범위를 벗어나지 않는 한 기본자료형은 int로 고정
		double area = 5 * 5 * 3.141592;
		System.out.println("area = " + area);

		// ++, -- : 증감
		/*-
		 * int b = a; -> int b = 4;
		 * 2 = a + 1; -> a = 4 + 1; -> a = 5;
		 */
		int a = 4;
		int b = a++;
		System.out.println("a의 중간값 : " + a + ", b의 중간값 : " + b);
		/*-
		 * a = a+1; -> a = 5 + 1 -> a = 6
		 * int c = a; int c = 6;
		 */
		int c = ++a;
		System.out.println("a = " + a + ", b = " + b + ", c = " + c);
	}

}
