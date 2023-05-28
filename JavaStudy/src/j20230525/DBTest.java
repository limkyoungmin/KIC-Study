package j20230525;

// DB에 관련된 클래스, 인터페이스
import java.sql.*; 

public class DBTest {

	public static void main(String[] args) {
		
		// 1. DB에 접속을 성공 했는지 안했는지 확인 -> con객체를 얻어왔다고 표현
		Connection con = null;
		
		// 2. 접속하고자 하는 컴퓨터 위치                  1521   orcl
		// 형식) jdbc:oracle:thin:@원격ip주소(=localhost):포트번호:sid
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		
		try {
			// 1. 접속할 드라이버를 메모리에 올리기
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. 접속하기 위해서 getConnection(1. 접속위치 2. 계정명 3. 암호)
			con = DriverManager.getConnection(url, "scott", "tiger");
			
			System.out.println("connection : " + con);
		} catch (Exception e) {
			System.out.println("DB연결 실패 : " + e);
		}
	}
}