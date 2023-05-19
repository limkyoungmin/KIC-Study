package j20230519;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하시오 : ");
		String input = sc.nextLine(); // next()(단어), nextLine()(문장)
		// System.out.println("input : " + input);
		stringPrint(input);
		sc.close(); // 메모리를 해제시켜주는 메소드(프로그램 종료와 함께)
	}
	
	// 매개변수O 반환값X
	public static void stringPrint(String s) {
		
		// 1. concat : 문자열 결합
		System.out.println("s.concat('test') : " + s.concat("test"));
		
		// 2. substring(시작인덱스 번호(O), 종료 인덱스 -1(바로 앞번호 까지)
		System.out.println("s.substring(1, 4) : " + s.substring(1, 4));
		
		// 3. 시작인덱스번호 부터 문자열 끝까지 출력
		System.out.println("s.substring(1) : " + s.substring(1));
		
		// 4. toUpperCase(대문자로 변환) <-> toLowerCase(소문자로 변환)
		System.out.println("s.toUpperCase(대문자로변환) : " + s.toUpperCase());
		System.out.println("s.toLowerCase(소문자로변환) : " + s.toLowerCase());
		
		// 5. replace : 특정문자열을 변경(변경전 단어 -> 변경후 단어)
		System.out.println("s.replace('l', 't') 만약에 l이 있으면 t로 바꾸기 : " + s.replace('l', 't'));
		
		// 6. legnth : 문자열의 길이 / 배열명.length : 배열의 길이(메소드X)
		System.out.println("s.length : " + s.length());
		
		// 7. charAt(인덱스번호) : 문자열 중에서 특정위치에 있는 문자 출력
		System.out.println("s.charAt(2) : " + s.charAt(2));
		
		// 8. indexOf('문자') : 특정문자가 앞에서부터 몇번째 인덱스번호에 위치 하는지
		// 못찾으면 -1을 리턴
		System.out.println("s.indexOf('l' : " + s.indexOf('l'));
		
		// 9. lastIndexOf() : 특정문자가 뒤에서부터 몇번째 인덱스번호에 위치 하는지
		System.out.println("s.lastIndexOf('l') : " + s.lastIndexOf('l'));
		
		// 10. trim() : 공백을 제거 ('ab cd' -> 'abcd')
		System.out.println("s.trim().length(공백을 제거 하고나서 문자열 길이) : " + s.trim().length());
	}
	
}