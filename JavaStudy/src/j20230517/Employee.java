package j20230517;

// 신입사원에 대한 정보를 저장할 목적(추상화)(공기업)
public class Employee {

	// 멤버변수
	String name; // 이름
	int age; // 나이
	String sung; // 성별
	String address; // 주소
	long salary; // 급여 -> 공기업(보너스) -> 직원(150%), 팀장(300%)반영
	
	// source -> generate getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSung() {
		return sung;
	}

	public void setSung(String sung) {
		this.sung = sung;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	// 2. 생성자 오버로딩 -> generate constructor using fields
	public Employee() {}
	public Employee(String name, int age, String sung, String address, long salary) {
		super();
		this.name = name;
		this.age = age;
		this.sung = sung;
		this.address = address;
		this.salary = salary;
	}
	
	// 보너스를 구해주는 메소드 -> 급여 * 1.5, 팀장급여 * 3.0
	double bonus() {
		return salary * 1.5;
	}
	
	// 3. 멤버변수의 값 출력
	// 하나의 클래스 내부에서 일반메소드에서 다른 일반메소드 호출O
	//                                           객체명.일반메소드명(~)
	void display() {
		System.out.println("====== 직원의 정보 ======");
		System.out.println("이름 : " + name); // this.getName()
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + sung);
		System.out.println("주소 : " + address);
		System.out.println("급여 : " + salary);
		System.out.println("보너스 : " + this.bonus());
	}
	
}
