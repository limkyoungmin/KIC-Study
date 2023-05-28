package j20230525;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Test222 {
	public static void main(String[] args) throws Exception{
		
		System.out.println("소문자를 대문자로, 대문자를 소문자로 변환하는 프로그램입니다.");
	
	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	while(true) {
	System.out.println("변환을 원하는 문자를 입력 해 주세요");
	 String firststr = input.readLine();
	
	 System.out.print("입력하신 문자가 변환됩니다.\n  : ");
	 
	 for (int i = 0; i < firststr.length(); i++) {
		char ch = firststr.charAt(i);
		if (Character.isLowerCase(ch)) {
			System.out.print(Character.toUpperCase(ch));
		}
		else if (Character.isUpperCase(ch)) {
			System.out.print(Character.toLowerCase(ch));
		}else {
			System.out.print(" ");
		}
	  }
	 
		System.out.println("\n\n다시 입력 하시겠습니까?(y/n)");
		if (input.read()=='y') {
			System.out.println("다시 입력받습니다.");
			input.readLine();
			continue;
		}else {
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
		}
	
	}
	}
}