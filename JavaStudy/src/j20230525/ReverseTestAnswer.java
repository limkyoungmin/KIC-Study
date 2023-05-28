package j20230525;

import java.io.*;

public class ReverseTestAnswer {

	public static void main(String[] args) throws Exception {
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		char ch;
		System.out.println("문자열을 입력?");
		str = br.readLine();
		System.out.println(str);
		
		for (int i = str.length()-1; i >= 0; i--  ) {
			ch = str.charAt(i);
			System.out.println(ch);
			
		}*/
		
		ReverseTestAnswer rt = new ReverseTestAnswer();
		BufferedReader br = rt.getBuffer();
		rt.setBuffer(br);
	}
	
	// 1. getBuffer()
	public BufferedReader getBuffer( ) {
		
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		return br;
		*/
		// 익명함수도 가능함
		return new BufferedReader(new InputStreamReader(System.in));
		
	}
	
	// 2. setBuffer()
	public void setBuffer(BufferedReader br) throws IOException { 
		
		String str;
		char ch;
		System.out.println("문자열을 입력?");
		str = br.readLine();
		System.out.println(str);
		
		for (int i = str.length()-1; i >= 0; i--  ) {
			ch = str.charAt(i);
			System.out.println(ch);
			
		}
		
		
	}

}
