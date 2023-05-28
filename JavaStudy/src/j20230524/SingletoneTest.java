package j20230524;

public class SingletoneTest {

	public static void main(String[] args) {
		// Singleton ob1 = new Singleton(); // Singleton 이 private로 되어 있어서 그냥은 못가져옴
		Singleton ob1 = Singleton.getInstance();
		Singleton ob2 = Singleton.getInstance();
		Singleton ob3 = Singleton.getInstance();
		
		// 객체명은 3개 지만 실제 객체는 1개이다. -> 주소값 확인
		// 주소값이 하나고 객체명은 다른경우 -> 서로 공유(객체는 하나)
		System.out.println("ob1 : " + ob1 + "\n" + "ob2 : " + ob2 + "\n" + "ob3 : " + ob3);
		
		if (ob1 == ob2) {
			System.out.println("주소값이 같습니다.");
			System.out.println("ob1과 ob2는 같은 객체입니다.(주소가 같다)");
		} else {
			System.out.println("주소값이 다릅니다.");
		}
	}
}