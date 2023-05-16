package j20230510;

/*
 * 변수의 종류 
 * 지역변수 : 정해진 범위 내에서만 사용이 가능한 변수
 * 멤버변수 : 클래스 내부에 선언된 변수(클래스 편)
 */
public class VarTest5 {
	// 멤버변수 : 자바스크립트의 전역변수처럼 모든 메소드에서 사용 가능함(인스턴스 변수)
	int su3;

	public static void main(String[] args) {
		System.out.println("변수의 사용범위(scope)");
		/*-
		 * su1 = 지역변수 지역변수의 특징 
		 * 	1. 특정범위 내에서만 사용 
		 * 	2. 반드시 초기값을 넣어줘야 됨
		 */
		int su1 = 10;
		// 초기화 : 변수 만들고 맨 처음 저장된 값
		System.out.println("su1 = " + su1);
		
		// 블럭처리(어디서부터 더시까지 사용한다(범위지정))
		{
			int su2 = 20;
			System.out.println("su2 = " + su2);
		}
		// 에러 뜨는 이유는 su2가 있는 범위 바깥에서 사용하기 때문(참조)
		// System.out.println("su2 = " + su2);

		// su1은 범위 안에 있기 때문에 가능
		System.out.println("su1 = " + su1);
	}
}
