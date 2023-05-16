package j20230515;

public class ThreeTest {

	public static void main(String[] args) {

		ThreeTest tt = new ThreeTest();
		tt.getMaxPrint(12, 4, 19);
		
	}
	void getMaxPrint(int x, int y, int z) {
		if ((x > y) && (x > z)) {
			System.err.println("3개 수의 최대 값은 " + x + "입니다.");
		} else if ((y > x) && (y > z)) {
			System.err.println("3개 수의 최대 값은 " + y + "입니다.");
		} else {
			System.err.println("3개 수의 최대 값은 " + z + "입니다.");
		}
		
	}
}