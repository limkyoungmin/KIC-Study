package j20230511;

public class JavaQuestion {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("A");
			}
			System.out.println();
		}
		//char alphabet = 'A';
		System.out.println();
		int a = 65;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char)a);
				a++;
				//System.out.print(alphabet);
				//alphabet++;
			}
			System.out.println();	
		}
		System.out.println();
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 5; k >= i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
