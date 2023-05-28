package j20230523;

import java.util.*;

// Set, Map -> 공통으로 사용하는 검색
public class EnumTest {

	public static void main(String[] args) {
		
		System.out.println("Set(중복을 허용X, 데이터의 저장순서X)");
		HashSet<String> hs = new HashSet();
		hs.add("abc");
		hs.add("abc2");
		hs.add("abc3");
		
		System.out.println("hs : " + hs);
		
		hs.remove("abc"); // abc 객체 삭제
		System.out.println("hs : " + hs);
		
		hs.clear(); // 삭제할 데이터가 1개 이상 일때 clear를 통해서 전체삭제
		System.out.println("hs : " + hs);
		System.out.println("hs의 개수 : " + hs.size());
		System.out.println("저장 유무 확인 : " + hs.isEmpty()); // true = 비어있음
	
		System.out.println("========================================");
		// 검색 때문에
		Vector<String> v = new Vector();
		v.add("test1");
		v.add("test2");
		v.add("test3");
		
		//Map <E>, <K, V> -> 표 형태로 저장 -> 세션처리(회원로그인 할 때 사용)
		Hashtable<Integer, String> h = new Hashtable();
		// Hashtable은 add 대신 put을 사용함
		h.put(1, "홍길동");
		h.put(2, "테스트");
		h.put(3, "010-1234-1234");
		h.put(4, "23");
		h.put(5, "서울시 강남구");
		
		// 값을 꺼낼때
		// get(키명) -> 키를 알고 있으면 검색속도 제일 빠름
		String tel = h.get(3); // = h.put(3, "010-1234-1234");
		System.out.println("tel : " + tel);
		System.out.println("============================================");
		
		// 검색에 대한 인터페이스 -> Enumeration, Iterator
		// 1. Enumeration : 저장된 순서 그대로 가져오길 원할때
		Enumeration<String> eu = v.elements(); // 메소드 반환형
		
		// 데이터구조가 다르다 할지라도 공통된 검색방법을 쓰고 싶다.
		while(eu.hasMoreElements() == true) { // 검색할 데이터가 존재한다면
			System.out.println(eu.nextElement());
		}
		
		// 2. Iterator : 도서관의 책꽂이에 들어가 있는 여러권의 책을 꺼내올 때
		//             -> 출력할 때 저장된 순서대로 출력X
		Collection<String> c = h.values();
		Iterator<String> ih = c.iterator();
		
		while (ih.hasNext() == true) { // 검색할 데이터가 있다면
			System.out.println(ih.next()); // 있으면 꺼내와라(= nextElement())
		}
	}

}
