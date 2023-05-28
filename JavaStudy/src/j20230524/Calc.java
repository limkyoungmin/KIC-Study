package j20230524;

public interface Calc {
	double PI = 3.141592;
	
	public void go();
	
	public default void test() {
		System.out.println("일반메소드 연습");
	}
}
