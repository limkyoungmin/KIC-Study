package j20230515;

// 3개의 값을 입력받아서 최대값을 구하기
public class ThreeTest_Answer {

	public static void main(String[] args) {
		int a = 12;
		int b = 4;
		int c = 19;
		// int max; // 최대값
		
		/*//    12 > 4(참)
		max = (a > b)?a : b;	// max = 12;
		//     12 > 19(거짓) 이므로 c가 더큼
		max = (max > c)?max:c;	// max = 19;
		System.out.println("max : " + max);*/
		ThreeTest_Answer tt = new ThreeTest_Answer();
		tt.getMaxPrint(a, b, c);
		tt.getMaxPrint(20, 30, 40);
		tt.getMaxPrint(40, 20, 30);
		System.out.println("==================");
		System.out.println("tt.getMaxPrint2(34, 12, 99)" +tt.getMaxPrint2(34, 12, 99));
	}
	
	void getMaxPrint(int a, int b, int c) {
		int max = (a > b)?a : b;
		max = (max > c)?max:c;
		System.out.println("max : " + max);
	}
	
	// 반환값O 메소드 작성
	int getMaxPrint2(int a, int b, int c) {
		int max = (a > b)?a : b;
		max = (max > c)?max:c;
		return max;
	}
}