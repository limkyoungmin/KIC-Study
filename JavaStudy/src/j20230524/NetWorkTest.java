package j20230524;

// InetAddress, Socket, ServerSocket(채팅)
import java.net.*;
// checked Exception계열 -> 반드시 예외처리 해야한다.
// 입출력, DB연동, 네트워크통신, 쓰레드...

public class NetWorkTest {

	public static void main(String[] args) throws Exception {
		InetAddress ia = null; // ip주소정보 에 대한 객체
		InetAddress ia2[]; // 컴퓨터가 한 대 이상일 경우
		
		// www.naver.com(도메인이름) -> ip
		ia = InetAddress.getByName("www.naver.com");
		System.out.println("서버주소 :" + ia.getHostAddress());
		
		// 서버가 한 대 이상 -> getAllByName
		ia2 = InetAddress.getAllByName("www.naver.com");
		
		// 확장 for문
		for (InetAddress aa:ia2) {
			System.out.println("서버들 주소 : " + aa.getHostAddress());
		}
		System.out.println("====자기 컴퓨터의 정보====");
		InetAddress host = InetAddress.getLocalHost();
		System.out.println("컴퓨터 명 : " + host.getHostName());
		System.out.println("ip주소 : " + host.getHostAddress());
			
		
	}
}