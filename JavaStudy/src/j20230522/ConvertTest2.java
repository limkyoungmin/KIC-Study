package j20230522;

import java.util.Scanner;

public class ConvertTest2 {

	public static void main(String[] args) {

		ConvertTest2 ct = new ConvertTest2();
		Scanner sc = new Scanner(System.in);
		
		char ch;
		
		while(true) {
			System.out.println("문자를 입력해 주세요.");
			String input = sc.nextLine();
			
			for (int i = 0; i < input.length(); i++) {
				ch = input.charAt(i);
				if (Character.isDigit(ch) == true) {
					System.out.println("숫자만 가능하므로 종료합니다.");
					System.exit(0);
				} else {
					if (input.equals("e") || input.equals("E")) {
						System.out.println("e 혹은 E를 눌렀으므로 종료합니다.");
						System.exit(0);
					} else { 
						ct.print(ch);
					}
						
				}
			}
		}

	}
	
	public void print(Character ch) {
		if (Character.isLowerCase(ch) == true) {
			System.out.print(Character.toUpperCase(ch));
		} else {
			System.out.print(Character.toLowerCase(ch));
		}
	}

}
