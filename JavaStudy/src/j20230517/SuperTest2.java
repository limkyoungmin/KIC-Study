package j20230517;

// super 키워드 <-> this 키워드(자식클래스의 객체를 가리키는 예약어)
// 부모클래스의 객체를 가리키는 예약어
class Person{
	String name; // null 상태
	int age = 20;
	
	void print() {
		System.out.println("Person 메소드(name) : " + name);
	}
}

// 기능을 Person 에게서 물려받음(상속)
class Man extends Person {
	
	// public Man() {} 없으면 만들어줆(생략되서 보임)
	
	// 상속을 받은 멤버변수와 이름이 같은 변수를 자식클래스에 또 선언이 가능
	int age = 40;
	/*-
	 * String name; // null 상태
		int age = 20;
	
	 	void print() {
			System.out.println("Person 메소드(name) : " + name);
		} 
		
		자식클래스에 부모와 동일한 멤버변수가 있는 경우
		super.멤버변수
		super.부모의 메소드를 호출
	 */
	
	// 오버라이딩(자식에게 맞게 내용을 수정)
	void print() {
		System.out.println("자식클래스의 age : " + age); // 40
		System.out.println("부모클래스의 age : " + super.age); // 20
		//System.out.println("Person 메소드(name) : " + name);
		super.print();
	}
}

public class SuperTest2 {
	
	public static void main(String[] args) {
		Man m = new Man();
		m.name = "홍길동";
		m.print();
	}
}