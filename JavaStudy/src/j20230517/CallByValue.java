package j20230517;

/*
 * CallByValue(값에 의한 전달방법) : 매개변수에 전달(기본자료형 8가지)
 *                                   전달해서 메소드를 호출하는 방법(원본의 값을 복사해서 전달)
 * 									 내용은 변경 되더라도 원본의 내용은 변경 안됨
 * 
 */

public class CallByValue {

	public static void main(String[] args) {
		
		int r = -1, g = -1, b = -1; // css (rgb(0 ~ 255)) -> 255 * 255 * 255
		
		System.out.println("before rgb : " + r + " " + g + " " + b);
		
		// 중간에 메소드를 이용 -> 전달 -> 색깔이 변경
		change_color(r, g, b);
		System.out.println("after rgb : " + r + " " + g + " " + b);
	}
	
	// 색깔을 변경
	static void change_color(int r, int g, int b) {
		r += 10; // r = r + 10 = 9
		g += 50; // 49
		b += 100; // 99
		System.out.println("메소드 내부 rgb : " + r + " " + g + " " + b);
	}
}