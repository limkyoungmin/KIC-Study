package j20230525;

import java.io.*;

public class ReverseTest {

	public static void main(String[] args) throws Exception {

		ReverseTest rt = new ReverseTest();

		rt.setBuffer(rt.getBuffer());

	}

	public BufferedReader getBuffer() {

		System.out.println("원하는 문자열 입력하면 뒤집어서 보여줍니다.");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		return br;

	}

	public void setBuffer(BufferedReader br) {

		try {

			StringBuilder sb = new StringBuilder(br.readLine());

			System.out.println(sb.reverse());

		} catch (IOException e) {

			System.out.println("실패");

		}

	}

}