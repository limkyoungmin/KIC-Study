package j20230517;

/*
 * CallByRef(주소에 의한 전달방법) : 매개변수에 전달(객체(주소))해서 메소드를 호출하는 방법(원본의 값을 전달)
 * 									 내용을 변경O -> 원본의 내용도 변경O
 * 									 객체를 전달 -> 객체의 주소값을 전달
 * 									 주소(저장할 위치) = 포인터(pointer)
 * 
 */

class RGBColor {
	int r, g, b;
	
	public RGBColor(int r, int g, int b) {
		this.r = r;
		this.g = g;
		this.b = b;
	}
}

public class CallByRef {

	public static void main(String[] args) {
		
		RGBColor color = new RGBColor(-1, -1, -1);
		System.out.println("color : " + color);
		//int r = -1, g = -1, b = -1; // css (rgb(0 ~ 255)) -> 255 * 255 * 255
		
		System.out.println("before rgb : " + color.r + " " + color.g + " " + color.b);
		
		// 중간에 메소드를 이용 -> 전달 -> 색깔이 변경
		change_color(color);
		System.out.println("after rgb : " + color.r + " " + color.g + " " + color.b);
	}
	
	// 색깔을 변경 work method(RGBColor(자료형) color2(객체명)
	static void change_color(RGBColor color2) {
		System.out.println("color2 : " + color2);
		color2.r += 10; // r = r + 10 = 9
		color2.g += 50; // 49
		color2.b += 100; // 99
		System.out.println("메소드 내부 rgb : " + color2.r + " " + color2.g + " " + color2.b);
	}
}