package j20230519;

import java.util.Scanner;

// 사용자로부터 값을 입력 받았다면 대문자 혹은 소문자로 변경
public class ConvertTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하시오 : ");
		String input = sc.nextLine(); // next()(단어), nextLine()(문장)
		System.out.println("input : " + input);
		
		// 1. System.out.println("input.length() : " + input.length());
		// 2. "abAG" -> 'a', 'b', 'A', 'G' -> 반복문
		/*
		 * 대, 소문자 판별 Character 클래스 -> isLowerCase('문자') -> true/false
		 * isUpperCase() : 대문자인지
		 * toLowerCase(char) : 소문자로 변환
		 * toUpperCase(char) : 대문자로 변환
		 * isWhiteSpace(char) : 공백 포함 유무 확인
		 */
		char ch; // 문자열에서 뽑아낸 문자를 저장
		for (int i = 0; i < input.length(); i++) {
			ch = input.charAt(i);
			// System.out.println("ch : " + ch + "\t");
			if (Character.isLowerCase(ch) == true) {
				System.out.print(Character.toUpperCase(ch));
			} else {
				System.out.print(Character.toLowerCase(ch));
			}
		}
	}

}
