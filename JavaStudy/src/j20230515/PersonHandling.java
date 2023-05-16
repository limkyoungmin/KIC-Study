package j20230515;

// 아파트, 빌라에 거주하는 사람들의 정보를 저장(추상화, 캡슐화, 생성자오버로딩 + this)
class Person {
	// 1. 멤버변수
	private String name;
	private int age;
	// private String address, job....
	//(), (name), (age), (name, age)
	//(), (name), (age), (address), (name, age), (age, address), (name, address), (name, age, address)
	
	// 생성자는 보통 멤버변수 다음에 씀
	public Person() {  // 기본 생성자
		this.name = "홍길동"; // setName("홍길동");
		this.age = 23; // setAge(23);
	}
	
	// 오버로딩
	// Person p2 = new Person("테스트");
	public Person(String name) {
		this.name = name;
		age = 24;
		System.out.println("난 매개변수 1개짜리 문자열처리 생성자 호출됨");
	}
	
	// Person p3 = new Person(24);
	public Person(int age) {
		this.age = age;
		name = "테스트 김";
		System.out.println("난 매개변수 1개짜리 정수형처리 생성자 호출됨");
	}
	
	// Person p4 = new Person("임시", 27);
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("난 매개변수 2개짜리 생성자 호출됨");
	}
	
	public void setName(String name) {
		this.name = name; // p1.name = "김길동";
	}
	
	public void setAge(int age) {
		if(age < 0) {
			System.out.println("나이의 음수는 안됩니다.");
			this.age = 23; // 음수 일시 default 값으로 23 설정
			return;
		}
		this.age = age;
	}
	
	/*
	 * public String getName() { return name; } public int getAge() { return age; }
	 */
	
	// 단순, 반복
	// this -> 현재 생성된 객체의 주소값을 대신 받아서 값을 저장시켜주는 역활
	void print() {
		System.out.println("이름 : " + this.name); // p1.name
		System.out.println("나이 : " + this.age); // p1.name
		System.out.println("===================");
	}
	
}

public class PersonHandling {
	
	public PersonHandling() {}
	public static void main(String[] args) {
		// 클래스명 객체명 = new 생성자명(); -> class명 = 생성자명은 같기 때문
		Person p1 = new Person(); // 객체 p1을 만들면서 기본생성자 호출
		p1.print();
		p1.setName("김길동");
		p1.setAge(24);
		p1.print();
		
		// Person클래스의 p2객체를 생성하면서 인수 1개 짜리 문자열처리 생성자 호출
		Person p2 = new Person("테스트");
		p2.print();
		
		// Person클래스의 p3객체를 생성하면서 인수 1개 짜리 정수형처리 생성자 호출
		Person p3 = new Person(23);
		p3.print();
		
		// Person클래스의 p4객체를 생성하면서 매개변수 2개 짜리 생성자 호출
		Person p4 = new Person("임시", 24);
		p4.print();
	}
}