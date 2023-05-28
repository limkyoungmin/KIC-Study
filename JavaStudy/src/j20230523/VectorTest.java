package j20230523;

import java.util.*; // * = util에 관련된 전부
					// Scanner, Vector, ArrayList

public class VectorTest {

	public static void main(String[] args) {
		
		Vector v = new Vector(); // new Vector(1, 1) // (1, 1) = (생성개수, 증가분) = default값
		
		v.add("테스트"); // 자동으로 index 번호 0 부여
		v.addElement("임시테스트2"); // 구버전(옛날버전), index 번호 1 부여
		v.add("테스트2"); // index 번호 2 부여
		// v.add(100); // 숫자는 객체가 아니기 때문에 자동으로 변환됨 (v.add(new Integer(100));
		System.out.println("v 의 크기 : " + v.size());
		
		// 값 출력
		for(int i = 0; i < v.size(); i++) {
			// 저장할때 Object형으로 저장 했기 때문에 값을 꺼내올때 다시 변환 시켜줘야됨
			String temp = (String) v.elementAt(i);
			System.out.println("v에든 내용 " + i + "번째 : " + temp);
		}
		
		/* 
		 * 컬렉션의 장점이자 단점은 모든 '객체'가 저장이 가능하기 때문에 원치않는 타입의 객체를 넣을 수 있기 때문에
		 * 그 단점을 보안해주기 위한게 '제너릭'이다.
		 * 제너릭을 사용하면 원하는 타입만 들어가기 때문에 형변환 없이 바로 꺼내올 수 있다.
		 * 형식) Vector <원하는 타입>
		 */
		Vector<String> v3 = new Vector<String>(); // new Vector(1, 1) // (1, 1) = (생성개수, 증가분) = default값

		v3.add("테스트44"); 
		v3.addElement("임시테스트244"); 
		v3.add("테스트245");
		// v.add(100); // String으로 정했기 때문에 다른타입은 못들어옴
		System.out.println("v 의 크기 : " + v.size());

		// 값 출력
		for (int i = 0; i < v.size(); i++) {
			/*// 저장할때 Object형으로 저장 했기 때문에 값을 꺼내올때 다시 변환 시켜줘야됨
			String temp = (String) v.elementAt(i);*/
			System.out.println("v에든 내용 " + i + "번째 : " + v3.elementAt(i));
		}
		
		// 다양한 값 저장
		Vector v2 = new Vector();
		/*
		 * Character c = new Character('a');
		 * v2.add(c)
		 */
		v2.add('a'); // v2.add(new Character('a'));
		
		// 만약에 100자리에 3.14 넣고 싶을때 = 1번인덱스 값을 다른걸로 바꾸고 싶을때
		// 1. 기존에 100을 삭제하고 3.14 값을 집어넣는다
		// 2. 혹은 'a' 와 100 사이에 생성을 해야됨
		// insertElement(1. 저장할객체명, 2. 삽입할 인덱스번호)
		v2.add(100); // v2.add(new Integer(100));
		v2.insertElementAt(3.14, 1);
		System.out.println("v2 의 크기 : " + v2.size());
		
		// 수정
		// setElementAt(1. 수정할데이터명, 2. 수정할 인덱스번호)
		v2.setElementAt("사과", 2); // 2번의 인덱스 번호인 100의 값을 "사과"로 변경
		
		// 내부적인 값의 타입들이 다 다를때
		// 꺼내면서 내부적으로 자동형변환
		for (int i = 0; i < v2.size(); i++) {
			System.out.println("v2에든 내용 " + i + "번째 : " + v2.elementAt(i));
		}
	}
}