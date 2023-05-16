package j20230516;

public class ArrayDynamic {
	/*-
	 * 배열의 종류
	 * 1. 고정배열(처음부터 배열의 크기가 정해져 있는 배열) -> 중간에 크기변경X
	 * 2. 동적배열 : 배열에 값을 저장시키면 자동으로 크기가 증가, 감소(컬렉션)
	 */
	public static void main(String args[]) {
		
		int sum = 0;
		
		// 문자열 -> 숫자(Integer.parseInt("10") = 10
		// 숫자 -> 문자열(String) String.valueOf(10) = "10"
		
		int str = Integer.parseInt(args[0]);
		int str2 = Integer.parseInt(args[1]);
		int str3 = Integer.parseInt(args[2]);
		
		String str4 = String.valueOf(str); // int 10 -> String "10"
		double str5 = Double.parseDouble("10.5"); // 10.5
		/*
		String str = args[0]; // 10
		String str2 = args[1]; // 20
		String str3 = args[2]; // 30
		*/
		// 자료형이 서로 다르면 형변환이 안됨
		// sum = (int)str + (int)str2 + (int)str3;
		
		
		
		System.out.println("str : " + str);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
		System.out.println("str4 : " + str4);
		System.out.println("str5 : " + str5);
	}
}