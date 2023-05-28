package j20230524;

import java.util.*;
/*
 * 3. < ? super T > : T(자식클래스)를 고정
 *                   자식클래스와 연관이 있는 모든 부모클래스는 누구나 적용이 되게 하겠다.(매개변수로 전달 받았을때) 
 */

class Person extends Object { // 부모클래스로 사용 할 예정
	
	String name;
	
	//생성자 오버로딩
	Person() {}
	Person(String name) {
		this.name = name;
	}
	
	@Override
		public String toString() {
			
			return this.name;
		}
	
}

// 자식클래스 Man
class Man extends Person {
	
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
class Woman extends Person {
	
	// String name
	Woman(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}

public class WildSuper {

	public static void main(String[] args) {
		// 1. Man
		List<Man> list = new ArrayList<>();
		
		list.add(new Man("테스트1"));
		list.add(new Man("test2"));
		
		printDate(list);
		System.out.println("===========================");
		
		/*
		// 2. Woman
		List<Woman> list2 = new ArrayList<Woman>();
		list2.add(new Woman("임시2"));
		list2.add(new Woman("임시3"));
		
		printDate(list2);
		System.out.println("===========================");
		
		
		// 3. Person
		List<Person> list3 = new ArrayList<>();
		list3.add(new Person("사장님"));
		list3.add(new Person("이사님"));
		
		printDate(list3);
		System.out.println("===========================");
		
		
		// 4. Double
		List<Double> list4 = new ArrayList<Double>();
		list4.add(12.6);
		list4.add(45.6);
		printDate(list4);
		*/
	}

	// <?> : 매개변수를 전달 받을때 그때 그때 마다 자료형을 바꿔서 전달함
	// 상속관계와 상관없이 모든 클래스가 다 적용이 된다.
	
	// 1. public static void printDate(List<?> list) { // 상속관계 상관없이 모든 클래스 OK
	// <? extends T> Person O man, Woman O Double X
	// 2. public static void printDate(List<? extends Person> list) {
	// 3. ? super T = ?(부모) super T(자식)
	//    ? super Man (?(부모 인 Person 도 가능) (Man은 자식이라 가능 Woman 은 X)
	//    ? super Woman (?(부모 인 Person 도 가능) (Woman은 자식이라 가능, Man 은 X)
	public static void printDate(List<? super Man> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
	 
	// ?(자식) 대신에 자식클래스명 적으면 안됨
	/*
	public static void printDate(List<? super Person> list) { // 부모상속을 물려받는 자식클래스인 Man, Woman만 가능

		for (Object obj : list) {
			System.out.println(obj);
		}
	}
	*/
}