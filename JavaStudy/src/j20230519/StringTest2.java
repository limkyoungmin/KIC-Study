package j20230519;

// 문자열 객체를 만드는 방법 2가지
public class StringTest2 {

	public static void main(String[] args) {
		
		// 1. String 문자열객체명 = "저장할 문자열";
		String str = "abc";
		
		// 저장할 문자열 존재확인O -> 새로운 공간에 안만들고 서로 연결시켜줌(주소값이 같음)
		String str2 = "abc"; // 내용, 주소 동일(같다)
		
		System.out.println("str 의 주소 : " + System.identityHashCode(str));
		System.out.println("str2 의 주소 : " + System.identityHashCode(str2));
		System.out.println("================================");
		
		// 2. new String("저장할 문자열")
		String str3 = new String("abc"); // 무조건 새로운 공간O
		String str4 = new String("abc"); // 주소는 다르지만 내용은 같다.
		
		System.out.println("str3 의 주소 : " + System.identityHashCode(str3));
		System.out.println("str4 의 주소 : " + System.identityHashCode(str4));
		System.out.println("================================");
		
		String str5 = new String("abcd");
		String str6 = new String("abcef"); // 내용이 다르면 주소값도 다름
		
		System.out.println("str5 의 주소 : " + System.identityHashCode(str5));
		System.out.println("str6 의 주소 : " + System.identityHashCode(str6));
		System.out.println("================================");
		
		// String (불변문자열) StringBuffer(가변문자열)
		// ex) String str = "abc" + "def" + "hij";
		//     String str = "abcdefhij"; -> String -> StringBuffer -> String
		//     String str = new StringBuffer("abc").append("def").append("hif").toString()
		
		// 객체 == 객체2 (주소비교)
		// 변수 == 변수 (내용비교)
		if (str == str2) {
			System.out.println("str1 과 str2는 주소가 서로 같다");
		} else {
			System.out.println("str1 과 str2는 주소가 서로 다르다");
		}
		
		if (str3 == str4) {
			System.out.println("str3 와 str4는 주소가 서로 같다");
		} else {
			System.out.println("str3 와 str4는 주소가 서로 다르다");
		}
		
		// 내용이 같은지 equals(), 대, 소문자를 구분해서 사용O
		//            contentEquals()도 가능(최신)
		
		if (str3.contentEquals(str4)) {
			System.out.println("str 3와 str4 의 내용은 같습니다.");
		} else {
			System.out.println("str 3와 str4 의 내용은 다릅니다.");
		}
	}
}