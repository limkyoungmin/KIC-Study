package j20230510;

public class Op3 {

	public static void main(String[] args) {
		// 관계연산자(=대소 비교연산자) : >, <, >=, <=, !=(같지않다), ==(컴퓨터언어2개)
		// 논리연산자(=참, 거짓 판별(boolean)) : &&, ||, ^(XOR)
		System.out.println("관계, 논리연산자");
		
		int t1 = 3, t2 = 5, t3 = 7;
		int t4;
		// 변수는(b1,b2,b3)는 선언되어 있지만 아직 값이 저장 안됨 = 초기화 X
		boolean b1, b2, b3;
		// b4 = 초기화 O
		boolean b4 = true;
		
		System.out.println("(t1 > t2) : " + (t1 > t2)); // false
		System.out.println("(t2 < t3) : " + (t2 < t3)); // true
		
		// 관계연산자 와 논리연산자 의 혼합
		// && and 조건평가
		b1 = (t1 > t2) && (t2 < t3);	// false + true = false
		System.out.println(b1);
		
		// || or 조건평가
		b2 = (t1 > t2) || (t2 < t3);	// false + true = true
		System.out.println(b2);
		
		// 변수앞에 ! 붙어 있으면 NOT (T -> F, F -> T)
		b3 = !b4;
		System.out.println(b3);	// b4 = true -> false
		
		// | or 모두평가
		b2 = (t1 > t2) | (t2 < t3);	//
		System.out.println(b2);
		
		// ^ T+T = F, F+F = F, T+F = T, F+T = T
		b3 = (t1 > t2) ^ (t2 < t3);	// false + true = true;
		System.out.println(b3);
	}
}
