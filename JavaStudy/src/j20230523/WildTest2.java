package j20230523;

import java.util.*;
/*
 * 2. < ? extends T > : 상속관계로 이루어진 클래스만 메소드의 매개변수로 받겠다는 뜻
 *                  ? : 자식클래스 (Man, Woman)
 *                  T : 부모클래스 (Person2, Test)
 *                  부모클래스뿐만 아니라 자식클래스만 임의의 자료형으로 매개변수를 전달받겠다는 표시
 */

class Test extends Object { // 부모클래스로 사용 할 예정
	
	String name;
	
}

class Person2 extends Object { // 부모클래스로 사용 할 예정
	
	String name;
	
}

// 자식클래스 Man
class Man extends Test {
	
	// String name
	Man(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}


// 자식클래스 Woman
class Woman extends Test {
	
	// String name
	Woman(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}

public class WildTest2 {

	public static void main(String[] args) {
		// 1. Man
		List<Man> list = new ArrayList<>();
		
		/*
		 * Man m = new Man("임시");
		 * list.add(m);
		 */
		
		list.add(new Man("테스트1"));
		list.add(new Man("test2"));
		
		printDate(list);
		System.out.println("===========================");
		
		// 2. Woman
		List<Woman> list2 = new ArrayList<Woman>();
		list2.add(new Woman("임시2"));
		list2.add(new Woman("임시3"));
		
		printDate(list2);
		System.out.println("===========================");
		
		/*
		// 3. Person
		List<Person2> list3 = new ArrayList<>();
		list3.add(new Person2());
		
		printDate(list3);
		System.out.println("===========================");
		*/
		
		// 4. Test
		List<Test> list4 = new ArrayList<>();
		list4.add(new Test());
		printDate(list4);
	}
	
	// 오버로딩의 단점은 메소드의 개수를 줄이질 못한다.
	// 제너릭을 이용해 한개의 메소드로 통합
	// <?> : 매개변수를 전달 받을때 그때 그때 마다 자료형을 바꿔서 전달함
	// 모든 클래스 OK
	/*
	 * public static void printDate(List<?> list) {
	 * 
	 * for (Object obj:list) { System.out.println(obj); } }
	 */
	// ?(자식) 대신에 자식클래스명 적으면 안됨
	public static void printDate(List<? extends Test> list) { // 부모상속을 물려받는 자식클래스인 Man, Woman만 가능

		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}