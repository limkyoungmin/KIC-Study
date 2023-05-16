package j20230516;

// 동적배열 + 오버로딩 = 매개변수의 자료형이 하나, 개수가 달라야한다.
public class VarArgTest {
	
	/*
	public void print(String a) {
		System.out.println("a : " + a);
	}
	
	public void print(String a, String b) {
		System.out.println("a : " + a + ", b : " + b);
	}
	
	public void print(String a, String b, String c) {
		System.out.println("a : " + a + ", b : " + b + ", c : " + c);
	}
	*/
	// public void print(String ... names, String str)(X)
	// public void print(String str2, String ...names) {} // 동적배열은 맨 나중에
	public void print(String ... names) { // 매개변수의 개수와 상관없이 메소드 하나로 통합
		/*
		 * int params[] = {1,2,3,4,5}
		 * String names[] = {"홍길동"}
		 * String names[] = {"홍길동", "홍길동2"}
		 * String names[] = {"홍길동", "홍길동2", "홍길동3"}
		 */
		for (String str:names)
			System.out.print(str + "\t");
		System.out.println();
	}
	
	public void print2(String names[]) { // 배열의 주소값을 전달(객체전달)
		for (int i = 0; i < names.length; i++) {
			System.out.print (names[i] + "\t"); // 가로로 출력
		}
		System.out.println();
	}
	public static void main(String[] args) {
		VarArgTest va = new VarArgTest();
		
		String str[] = {"배열의 활용", "동적배열", "API문서 참조하는 방법"};
		va.print2(str);
		
		va.print("홍길동");
		va.print("홍길동", "홍길동2");
		va.print("홍길동", "홍길동2", "홍길동3");
		va.print("홍길동", "홍길동2", "홍길동3", "홍길동4", "홍길동5");
		
		// 매개변수 4개짜리가 없어서 오류
		//va.print("홍길동", "홍길동2", "홍길동3", "홍길동4");
	}
}