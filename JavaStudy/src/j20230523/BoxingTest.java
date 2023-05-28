package j20230523;

/*
 * 컬렉션(Collection) : 데이터(객체)를 저장할 수 있는 구조(List, Set, Map)
 *                     -> 객체만 저장
 * 기본자료형(8가지)은 컬렉션에 저장이 안됨 -> 객체가 아니기 때문에 저장이 안됨 
 * 											<-> 참조형(=객체형=클래스형)은 저장 가능
 * 기본자료형을 컬렉션에 저장하고 싶다. -> Wrapper
 */
public class BoxingTest {

	public static void main(String[] args) {
		System.out.println("자동 unboxing");
		// int obj = 10;
		
		// unboxing : 자바의 객체형(Wrapper) -> 기본자료형으로 변환됨
		Integer obj = new Integer(10);
		// int sum = obj.intValue() + 20;
		int sum = obj + 20; // Integer + int -> int + int = int(sum)
		System.out.println("sum : " + sum);
		
		// boxing : 기본자료형 -> 자바의 객체형(Wrapper)로 변환됨
		System.out.println("자동 boxing");
		/* Double d = new Double(123.45);
		printDouble(d);*/
		printDouble(new Double(123.45)); // 익명객체형태로 객체를 전달
		printDouble(143.67); // double -> new Double(143.67)
	}
	
	 
	
	static void printDouble(Double obj2) {
		System.out.println(obj2.toString()); // 소수점을 문자열로 변환해서 출력하는 메소드
	}
}