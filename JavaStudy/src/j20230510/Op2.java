package j20230510;

public class Op2 {

	public static void main(String[] args) {
		byte b1 = 5;
		short s = -4;
		int i = 8;
		System.out.println("b1 = " + b1);

		// () : 연산자 우선순위
		System.out.println("-s = " + (-s));
		System.out.println("i = " + i);
		// i = i+1 -> i = 8+1 -> i = 9
		System.out.println("++i = " + (++i));
		// System.out.println(i) = 9;
		// i = i+1 -> i = 9+1 -> i = 10
		System.out.println("i++ = " + (i++));
		
		System.out.println("중간 i = " + i);
		// i = i-1 -> i = 10-1 = 9
		// System.out.println(i)
		System.out.println("--i = " + (--i));

		System.out.println("i-- = " + (i--));

		System.out.println("최종 i = " + i );
		
		int a = 4;
		int b = --a;
		System.out.println(b + ", " + a);
		int c = b--;
		System.out.println(c + ", " + b);
		int d = c;
		System.out.println(a + ", " + b + ", " + c + ", " + d);
	}

}
