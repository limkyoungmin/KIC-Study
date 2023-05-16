package j20230512;

public class TwoTest {

	public static void main(String[] args) {
		/*-
		 * 1. 사용자로부터 값을 입력받아서(2개) 최대값을 구하기 <-> 최소값은 구하기
		 * 2. 최대값을 구해주는 메소드(MAX)를 작성해서 최대값을 구하기
		 * 3. 최소값을 구해주는 메소드(MIN)를 작성해서 최소값을 구하기
		 */
		// 지역변수 이기 때문에
		int x = 12;
		int y = 67;

		/*- 비 효율적인 코딩방식(단순, 반복적인 문장)
		if (x > y) {
			System.out.println("큰 값은 : " + x + "입니다.");
		} else {
			System.out.println("큰 값은 : " + y + "입니다.");
		}
		
		int a = 56;
		int b = 97;
		
		if (a > b) {
			System.out.println("큰 값은 : " + a + "입니다.");
		} else {
			System.out.println("큰 값은 : " + b + "입니다.");
		}
		*/

		TwoTest tt = new TwoTest(); // max 와 min이 호출하기 위해서 만듦
		tt.max(x, y); // max라는 메소드를 호출하면서 x,y값을 전달함
		tt.max(100, 1);
		System.out.println("=================");
		tt.min(x, y);
		tt.min(34, 14);
	}

	// 부하직원 (최대값)
	void max(int x, int y) {
		if (x > y) {
			System.out.println("큰 값은 : " + x + "입니다.");
		} else {
			System.out.println("큰 값은 : " + y + "입니다.");
		}
	}

	// 부하직원 (최소값)
	void min(int x, int y) {
		if (x > y) {
			System.out.println("적은 값은 : " + y + "입니다.");
		} else {
			System.out.println("적은 값은 : " + x + "입니다.");
		}
	}
}