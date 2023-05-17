package j20230517;

// 부서의 팀장정보 저장 -> 중복코딩이 필요(업무상)
// 형식) class 자식클래스명 extends 부모클래스명
class Manager extends Employee {

	// 부모한테 물려받은 멤버변수
	/*-
	String name;
	int age;
	String sung;
	String address;
	long salary;
	*/

	// 부서명 -> 개발팀
	String department;

	// 객체배열 : 객체만 저장이 되는 배열(직원의 정보만)
	Employee sub[]; // new Employee[3]; int sub[] 직원만 저장

	public Manager() {
	}

	public Manager(String name, int age, String sung, long salary, String address, String department) {
		
		//super(); // Employe의 기본생성자를 호출(super는 원래 생략됨)
		super(name, age, sung, address, salary);
		/*
			1. 중복코딩이 생기면 부모의 생성자가 대신 저장시켜주는것으로 처리(재사용성)
		this.name = name;
		this.age = age;
		this.sung = sung;
		this.salary = salary;
		this.address = address;
		*/
		this.department = department;
	}
	
	// 오버라이딩 : 자식의 입장에서 맞게 내용을 다시 수정해주는 행위
	double bonus() {
		return salary * 3.0;
	}
	
	//------------추가----------------
	void display() {
		
		/* 중복코딩을 제거(부모코딩을 빌려와서 사용)
		System.out.println("====== 직원의 정보 ======");
		System.out.println("이름 : " + name); // this.getName()
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + sung);
		System.out.println("주소 : " + address);
		System.out.println("급여 : " + salary);
		System.out.println("보너스 : " + this.bonus());
		*/
		super.display();
		
		// 추가
		System.out.println("담당부서명 : " + department);
		System.out.println("부하 직원의 수 : " + sub.length);
	}

}

public class Company {

	public static void main(String[] args) {

		// 1. 신입사원 3명 배정
		Employee e1 = new Employee("홍길동", 23, "남", "서울시 논현구", 1500);
		Employee e2 = new Employee("임꺽정", 35, "남", "대전시 중구", 1700);
		Employee e3 = new Employee("초선", 30, "여", "부산시", 1800);

		// 2. 부서배치(개발부)
		Manager m1 = new Manager("임시테스트", 42, "남", 3500, "서울시 강남구", "개발 1과");

		m1.sub = new Employee[3]; // Employee 데이터 저장공간 3개 생성
		m1.sub[0] = e1; // 홍길동의 정보가 들어감
		m1.sub[1] = e2;
		m1.sub[2] = e3;
		
		// 3. 부하직원의 정보, 팀장 출력
		for (int i = 0; i < m1.sub.length; i++) {
			System.out.println("직원명 : " + m1.sub[i].name);
			System.out.println("직원의 나이 : " + m1.sub[i].age);
			System.out.println("================================");
			m1.sub[i].display();
		}
		m1.display();
	}
}