package j20230523;

import java.util.*;

// 1. < ? > 와일드 카드를 이용한 제너릭 방법 -> 메소드 호출시 매개변수를 전달할 때

public class WildTest {

	public static void main(String[] args) {
		// 1. 문자열
		List<String> list = new ArrayList<String>();
		
		list.add("test1");
		list.add("test2");
		list.add("test3");
		list.add("test4");
		
		printDate(list);
		System.out.println("===========================");
		
		// 2. 정수형
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(new Integer(1));
		list2.add(2);
		list2.add(3);
		list2.add(4);
		
		printDate(list2);
		System.out.println("===========================");
		
		// 3. 소수점
		List<Double> list3 = new ArrayList<Double>();
		list3.add(1.1);
		list3.add(2.2);
		list3.add(3.3);
		list3.add(4.4);
		
		printDate(list3);
		
	}
	
	// 오버로딩의 단점은 메소드의 개수를 줄이질 못한다.
	// 제너릭을 이용해 한개의 메소드로 통합
	// <?> : 매개변수를 전달 받을때 그때 그때 마다 자료형을 바꿔서 전달함
	public static void printDate(List<?> list) {
		
		for (Object obj:list) {
			System.out.println(obj);
		}
	}
	
	/*
	public static void printDate2(List<Integer> list) {

		for (Integer obj : list) {
			System.out.println(obj);
		}
	}
	
	public static void printDate3(List<Double> list) {

		for (Double obj : list) {
			System.out.println(obj);
		}
	}
	*/
}