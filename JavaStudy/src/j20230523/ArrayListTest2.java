package j20230523;

import java.util.*; // ArrayList...
import java.io.Serializable; // 직렬화 하기위해서 필요 (데이터전송)

// class Person implements Serializable {}
class Person { // DTO (Data Tranfer Object) 데이터를 전송할수 있는 객체

	private String name;
	private int age;

	public Person() {
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

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

}

// 회원가입 -> 회원로그인 -> 관리자만 회원리스트 목록을 볼 수 있도록 구성
public class ArrayListTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("회원명 입력 : ");
		String name = sc.next();

		System.out.println("나이 입력 : ");
		int age = sc.nextInt();

		Person p = new Person(); // new Person(name, age)
		p.setName(name); // input box때문에
		p.setAge(age);

		Person p2 = new Person(); // new Person(name, age)
		p2.setName("임시"); // input box때문에
		p2.setAge(32);

		Person p3 = new Person(); // new Person(name, age)
		p3.setName("테스트김"); // input box때문에
		p3.setAge(25);

		// ArrayList을 이용해서 저장
		ArrayList<Person> list = new ArrayList<Person>();

		list.add(p);
		list.add(p2);
		list.add(p3);

		// 출력
		ArrayListTest2 alt = new ArrayListTest2(); // 메소드 호출(데이터 저장용)
		alt.setPersonList(list);
		
		sc.close();
	}

	// ArrayList<Person>매개변수로 전달 받아서 출력 -> html
	// html 이 지금은 없기 때문에 console에 출력
	public void setPersonList(ArrayList<Person> list) {
		/*
		for (int i = 0; i < list.size(); i++) {
			// <td><% = st.getName() %></td>
			Person st = list.get(i); 
			System.out.println("이름 : " + st.getName());
			System.out.println("나이 : " + st.getAge());
		}
		*/
		// for (꺼낸 객체의 자료형 객체명 : 배열 또는 컬렉션객체)
		for (Person st:list) {
			System.out.println("이름 : " + st.getName());
			System.out.println("나이 : " + st.getAge());
		}
	}

	// 웹에 출력시켜주는 메소드를 작성(DB에 저장된 데이터를 찾아서 담아서 출력)
	// <td> <% = p.getName() %> </td>
	// <td> <% = p.getAge() %> </td>
	public ArrayList<Person> getPersonList() {

		// DB에 접속해서 데이터를 가져온다는 경우(JDBC)
		ArrayList<Person> list2 = new ArrayList<Person>();

		list2.add(new Person("hong", 23)); // 익명객체형태로
		list2.add(new Person("kim", 25));
		list2.add(new Person("park", 28));

		return list2;
	}

}