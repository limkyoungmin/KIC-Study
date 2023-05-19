package j20230519;

// 예외처리
public class HelloTest2 {

	public static void main(String[] args) {
		
		/* (1)
		int i = 0; // 첨자
		String greetings[] = {"객체형변환", "예외처리", "예외처리방법"};
		while (i < 3) {
			System.out.println(greetings[i]); // 논리적인 에러
			i++;
		}
		*/
		try {
			HelloTest2 ht = new HelloTest2();
			ht.go();
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 첨자계산이 잘못 되었습니다.");
			System.out.println(e.getMessage()); // 초간단 에러메세지
			System.out.println(e.toString()); // e.getMessage 보다 더 자세하게보여줌
			e.printStackTrace(); // 에러에 관련된 모든 클래스 추적해서 보여줌
			
		}
	}
	
	public void go() throws ArrayIndexOutOfBoundsException { // work
		
		int i = 0; // 첨자
		String greetings[] = {"객체형변환", "예외처리", "예외처리방법"};
		while (i < 4) {
			System.out.println(greetings[i]); // 논리적인 에러
			i++;
		}
	}
}
