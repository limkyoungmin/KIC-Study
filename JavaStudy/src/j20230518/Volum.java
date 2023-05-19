package j20230518;

/*
 * interface : +전체 프로그램에 사용되는 모든 공통적인 기능(업무분석)을 가지고
 * 추상메소드를 선언
 * 누구나 접근이 가능하도록 public interface로 작성 
 */
public interface Volum {
	// 1. 볼륨을 올리기 -> 수정 -> 매개변수O 반환값X
		public void volumUp(int level);
	
	// 2. 볼륨을 내리기 -> 수정 -> 매개변수O 반환값X
		public void volumDown(int level);

	// 3, 4 turnOn turnOff
		
}
