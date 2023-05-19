package j20230519;

/*
 * 객체형변환(자동, 명시적인 형변환)
 * 장점 : 메소드의 개수를 줄일 수 있고, 오버라이딩 개수 줄일수 있다.
 *        -> 코딩줄을 줄일 수 있다. -> 개발시간이 단축 -> 프로그램의 효율성 극대화
 */

class Employee { // 일반직원
	
	// 세금율 계산
	// Employee or Manager or Engineer
	// 메소드 통일 = 오버로딩
	public void taxRate(Employee e) {
		
		// 내부에서 부모, 자식 구분 -> 각각 구분
		if (e instanceof Manager) { // manager.taxRate(manager)
			Manager m = (Manager) e;
			System.out.println("Manager에 맞게 세금계산(1.0)" + m);
		} else if (e instanceof Engineer) {
			Engineer eng = (Engineer)e;
			System.out.println("Engineer에 맞게 세금계산(0.5)" + eng);
		} else if (e instanceof Employee) {
			System.out.println("Employee에 맞게 세금계산(0.3)" + e);
		}
		
	} // tax 0.3
	// public void taxRate(Manager m) {} // tax 1.5
	// public void taxRate(Engineer eg) {} // tax 0.5
}

// 팀장 : 팀장의 역활 + 일반직원(Employee)의 역활
class Manager extends Employee {
	
}

// 엔지니어 : 엔지니어의 역활 + 일반직원(Employee)의 역활
class Engineer extends Employee {
	
}

public class CastTest {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		Manager manager = new Manager();
		Engineer engin = new Engineer();
		
		// taxRate() 메소드를 하나로 통합함
		// 자식들도 부모의 메소드를 사용할 수 있음
		emp.taxRate(emp); // 부모
		manager.taxRate(manager); // 자식 -> 부모로 자동 형변환
		engin.taxRate(engin); // 자식 -> 부모로 자동 형변환
		
	}
}