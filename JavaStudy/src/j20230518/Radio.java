package j20230518;

/*
 *  자식인터페이스 extends 부모인터페이스
 *  자식클래스 extends 부모클래스
 *  자식클래스 implements 부모인터페이스1, 부모인터페이스2, .... 다중상속
 */
public class Radio implements AdvanceVolum {
	
	private int VolLevel; // 볼륨의 크기
	
	// 다형성 : 메소드명은 같지만 실제 내용은 다르다 -> 기능이 다 다르다
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Radio 음악프로그램을 turnOn-----");
		
	}
	
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Radio 음악프로그램을 turnOff-----");
	}
	
	@Override
	public void volumUp(int level) {
		// TODO Auto-generated method stub
		VolLevel += level;
		System.out.println("Radio 음악프로그램을 VolumUp을 " + level + "만큼 올림-----");
	}
	
	@Override
	public void volumDown(int level) {
		// TODO Auto-generated method stub
		VolLevel -= level;
		if (VolLevel < 0 ) {
			VolLevel = 0;
		}
		System.out.println("Radio 음악프로그램을 VolumDown을 " + level + "만큼 내림-----");
	}
	
	// Radio 에만 있는 다른기능은 각자 개발자에게 맡김
	
	
	
}
