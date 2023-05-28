package j20230524;

// 입출력
import java.io.*; // 파일의 내용을 메모리에 로딩
import java.util.Properties;

/*
 * Properties : Hashtable계열(key, value) -> 파일로 저장된 내용을 메모리에 불러다 사용(환경설정)
 *                                           접속ip, 접속계정명, 암호(보한때문에) load() 를 사용
 *                                           ~.properties파일
 */

public class Protest{

	public static void main(String[] args) {
		
		// 1. 파일을 읽어들이기
		Properties pro = new Properties();
		
		// 2. FileInputStream
		try {
			FileInputStream fis = new FileInputStream("C:\\webtest\\3.java\\sou\\JavaStudy\\src\\j20230524\\ex1.properties");
			pro.load(fis); // 파일의 내용을 메모리에 로딩
		} catch (IOException e) {
			System.out.println("파일 불러오기 오류 : " + e);
		}
		
		// 3. 저장된 속성값을 불러오기 <-> getProperty("key명");
		//                             <-> setProperty("key명, 저장할 값");
		String value = pro.getProperty("a");
		System.out.println("a키값의 속성값 : " + value);
		
		System.out.println("pro.getProperty(b) : " + pro.getProperty("b"));
		
		// 4. 저장된 속성명의 속성값을 변경
		pro.setProperty("b", "imsitest");
		System.out.println("pro.getProperty(b) : " + pro.getProperty("b")); // 사실상 메모리에만 저장된거라 실제 값은 변경이 안됨
	
		// 5. 파일의 내용을 -> 메모리에 로딩(b = imsitest) -> 메모리만 변경된 상태
		// 실제 파일에도 변경 -> store(동기화 (파일의 내용 == 메모리 내용))
		try {        // 1. 경로포함해서 출력할 파일명(FileOutputStream)
			         // 2. 주석유무 -> null(주석작성X)
			pro.store(new FileOutputStream("C:\\webtest\\3.java\\sou\\JavaStudy\\src\\j20230524\\ex1.properties"), "imsitest");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}