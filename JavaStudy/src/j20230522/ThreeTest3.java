package j20230522;

import java.util.Scanner;

class MaxSu {
	private int a;
	private int b;
	private int c;
	
	public int getScanA() {
		return a;
	}
	public void setScanA(int a) {
		if (a < 0) {
			System.out.println("a 값은 음수 안됩니다.");
		} this.a = a;
	}
	public int getScanB() {
		return b;
	}
	public void setScanB(int b) {
		if (b < 0) {
			System.out.println("b 값은 음수 안됩니다.");
		} this.b = b;
	}
	public int getScanC() {
		return c;
	}
	public void setScanC(int c) {
		if (c < 0) {
			System.out.println("c 값은 음수 안됩니다.");
		} this.c = c;
	}
	
	public void getMaxPrint() {
		if (this.a < 0 || this.b < 0 || this.c < 0) {
			System.out.println("어느 하나라도 음수는 안됩니다.");
		} else {
			System.out.println("Max의 값은 : " + (Math.max(Math.max(this.a, this.b), this.c)));
		}
	}
	
}
// 3개의 값을 입력받아서 최대값을 구하기
public class ThreeTest3 {

	public static void main(String[] args) {
		MaxSu ms = new MaxSu();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("a의 수를 입력하세요.");
		int a = sc.nextInt();
		System.out.println("b의 수를 입력하세요.");
		int b = sc.nextInt();
		System.out.println("c의 수를 입력하세요.");
		int c = sc.nextInt();
		
		ms.setScanA(a);
		ms.setScanB(b);
		ms.setScanC(c);
		
		ms.getMaxPrint();
		
		sc.close();
	}
}