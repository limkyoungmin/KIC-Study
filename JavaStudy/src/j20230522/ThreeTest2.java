package j20230522;

import java.util.Scanner;

// 3개의 값을 입력받아서 최대값을 구하기
public class ThreeTest2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ThreeTest2 tt = new ThreeTest2();
		
		tt.setScan(sc);

		sc.close();
		
	}
	
	public void setScan(Scanner sc) {
		System.out.println("3개의 수를 입력");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		getScan(a, b, c);
	}
	
	// 반환값X 메소드 작성
	public void getScan(int a, int b, int c) {
		System.out.println("a : " + a + ", b : " + b + ", c : " + c);
		int max = (a > b)?a : b;
		max = (max > c)?max:c;	
		System.out.println("Max : " + max);
		
	}
	
}