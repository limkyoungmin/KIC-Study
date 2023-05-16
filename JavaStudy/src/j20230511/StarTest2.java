package j20230511;

public class StarTest2 {

	public static void main(String[] args) {
		// a(행의수), b(행이 증가할 때마다 별도 같이 증가)
		for (int a = 1; a <= 5; a++) {
			//System.out.println("*");
			for (int b = 1; b <= a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("\n\n\n");
		for (int a = 5; a >= 1; a--) {
			//System.out.println("*");
			for (int b = 1; b <= a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
