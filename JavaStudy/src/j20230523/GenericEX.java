package j20230523;

/*
 * 자주 사용이 되는 클래스도 import형태로 등록
 * 형식) import static 자주 불러서 사용하는 클래스명(패키지명....클래스명)
 * 제너릭 클래스 : 특정 자료형의 값만 입력받아서 저장, 조회, 계산, 출력 등
 *            적용) 멤버변수, 메소드의 매개변수에도 제너릭을 부여가능
 */

import static java.lang.System.out; // 메모리에 로딩

// 기능은 동일한데 서로 다른 자료형을 하나의 Type로 설계O (=추상화)
public class GenericEX <T> { // GenericEx클래스에 객체를 생성하면서 값을 저장할 Type에 대한 자료형만 받아서 처리함
	
	/*
	String v[];
	Double v2[];
	Integer v3[];
	*/
	
	T v[];
	
	public void set(T n[]) {
		v = n;
	}
	
	public void getPrint() {
		for(T s:v) {
			System.out.println(s);
		}
	}
	
	/*
	// 1. 배열의 값을 저장시킬 경우(setter)
	public void set(String n[]) {
		v = n;
	}
	
	public void set(Double n[]) {
		v2 = n;
	}
	
	public void set(Integer n[]) {
		v3 = n;
	}
	
	// 2. 배열의 값을 꺼내와서 출력(getter)
	public void getPrint() {
		for (String s:v) {
			System.out.println(s);
		}
	}
	
	public void getPrint2() {
		for (Double s:v2) {
			System.out.println(s);
		}
	}
	
	public void getPrint3() {
		for (Integer s:v3) {
			System.out.println(s);
		}
	}
	*/
	
	public static void main(String[] args) {
		out.println("자주 출력됨");
		
		// 제너릭 주의 : 객체명은 다르게 설정, 타입도 다르게 설정해서 생성 해야됨
		GenericEX<String> ge = new GenericEX<>();
		GenericEX<Double> ge2 = new GenericEX<>();
		GenericEX<Integer> ge3 = new GenericEX<>();
		
		
		String ss[] = {"제너릭", "제너릭의 종류", "제너릭 실습"};
		ge.set(ss);
		ge.getPrint();
		
		Double ss2[] = {3.4, 5.6, 7.8};
		ge2.set(ss2);
		ge2.getPrint();
		
		Integer ss3[] = {23, 43, 234};
		ge3.set(ss3);
		ge3.getPrint();
		
		/*
		String ss[] = {"제너릭", "제너릭의 종류", "제너릭 실습"};
		ge.set(ss);
		ge.getPrint();
		System.out.println("=======================");
		
		Double ss2[] = {3.4, 5.6, 7.8};
		ge.set(ss2);
		ge.getPrint2();
		System.out.println("=======================");
		
		Integer ss3[] = {23, 43, 234};
		ge.set(ss3);
		ge.getPrint3();
		*/
		
	}
}