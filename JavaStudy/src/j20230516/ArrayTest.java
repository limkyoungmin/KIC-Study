package j20230516;

public class ArrayTest {

	public static void main(String[] args) {
		// int su, su2, su3;
		// 형식) 자료형 배열명[] = new 자료형[개수]
		// int -> 0, double -> 0.0, boolean -> false 로 자동 초기화

		int su[] = new int[3]; // 0,1,2 -> 3개의 공간을 생성
		System.out.println("su : " + su);

		su[0] = 10;
		su[1] = 20;
		su[2] = 30;
		System.out.println("su [0] : " + su[0]);
		System.out.println("su [1] : " + su[1]);

		int su4 = 23; // 지역변수는 반드시 초기값을 줘야 출력이 된다.
		System.out.println(su4);
		
		/*
		 * int c[] = new int[13]; 
		 * c[0] = 10; c[1] = 20; ,,, c[12] = 130; 
		 * 배열명.length -> 배열의 길이를 자동으로 계산
		 */

		//형식2) 자료형 배열명[] = {값1,값2,값3....} 배열생성 및 초기화
		int c[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130 };
		
		// 배열의 첨자(index 번호)를 계산해서 원하는 데이터를 자세하게 출력하고 싶을때
		// 주의 : 첨자를 잘못 계산하면 논리적인 에러(문법은 이상 없지만 실행하면 오류뜸)가 발생함
		for (int i = 0; i < 13; i++) {
			System.out.println("c[" + i + "] = " +c[i]);
		}
		
		// 확장 for문(향상된 for문) -> 단순히 배열, 객체의 저장된 값을 꺼내와서 출력(확인용)
		// 형식) for(배열의 자료형 출력변수명 : 출력대상자(배열 or 컬렉션객체)
		for (int num:c)
			System.out.println("num : " + num + "\t");
	}

}