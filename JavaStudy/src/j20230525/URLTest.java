package j20230525;

// 네트워크와 입출력 연결
import java.io.*;

//특정사이트에 접속 해서 정보를 가져오기 -> URL, URLConnection
import java.net.URL;

import java.util.*;

public class URLTest {

	public URLTest(String s) throws Exception {
		URL url = new URL(s);
		System.out.println("url : " + url);
		InputStream in = url.openStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		
		String ss; // 읽어들여서 임시로 저장할 변수
		
		while((ss = br.readLine()) != null) { // 불러올 데이터가 존재하는 한
			System.out.println(ss);
			
		}
		in.close();
	}
	
	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("접속할 사이트 도메인 이름 입력(https://도메인이름)");
		String domain = sc.next();
		new URLTest(domain);
		
	}
}