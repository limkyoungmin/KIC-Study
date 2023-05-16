package j20230511;

public class StarTest {

	public static void main(String[] args) {
		// a(행의수), b(행이 증가할 때마다 별도 같이 증가)
		for (int a = 1; a <= 5; a++) {
			//System.out.println("*");
			for (int b = 1; b <= 5; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
