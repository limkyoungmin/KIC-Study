package j20230523;

import java.util.*;

// 동적배열(ArrayList구조) : 리스트 내부에 배열이 들어가 있는 구조 
public class ArrayListTest {

	public static void main(String[] args) {
		
		// ArrayList<String> list = new ArrayList<String>();
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("포도"); // index = 0;
		list.add("딸기"); // index = 1;
		list.add("복숭아"); // index = 2; -> 3
		
		// 중간에 값이 들어갈 경우
		// add(1. 삽입할 위치, 2. 저장할 객체명)
		list.add(2, "키위"); // index = 2;

		// 중간검사
		System.out.println("list 의 size() : " + list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println("list 의 순서 " + i + "번째 : " + list.get(i));
		}
		System.out.println("=====================================");
		
		// 중간에 값을 수정할 경우
		// set(1. 수정할 인덱스번호, 2. 수정할 값);
		list.set(0, "오렌지"); // 포도 -> 오렌지
		
		// 중간에 값을 삭제할 경우
		// 1. remove(삭제할 데이터명) = 만약 동명이인이 있을경우 해당 이름 전부 삭제됨
		// 2. remove(인덱스번호) = 중복된 데이터를 구분해서 삭제
		list.remove("키위"); // = list.remove(2);
		
		// 값을 조회 하는 경우
		// get(인덱스번호)
		System.out.println("list 의 size() : " + list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println("list 의 순서 " + i + "번째 : " + list.get(i));
		}
	}
}