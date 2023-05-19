package j20230518;

// 자식 인터페이스명 extends 부모인터페이스명
public interface AdvanceVolum extends Volum {

	/*-
	 * 부모로부터 물려받은 추상메소드를 이미 가진 상태
	 * public void volumUp(int level);
	 * public void volumDown(int level);
	 */
	public void turnOn(); // 프로그램 전원 ON
	public void turnOff(); // 프로그램 전원 OFF

}
