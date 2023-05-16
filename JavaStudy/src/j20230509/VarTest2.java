package j20230509;

public class VarTest2 {

	public static void main(String[] args) {
		// 실수를 저장하는 자료형 2가지 : float, double(단답형)
		System.out.println("실수를 저장하는 자료형 2가지 : float, double(단답형)");
		// byte f; int f; : 자료형과 상관없이 동일한 변수명은 사용 불가능
		float f = 5.3f; // 실수는 무조건 double형으로 인식 하기 때문에 에러 발생
						// float형에 맞게 저장해야됨(실수 뒤에 f)를 표시
		double f2 = 5.3;
		System.out.println("f : " + f + "\n" + "f2 : " + f2);

		// float 와 double 의 차이
		System.out.println("float 와 double의 차이점");
		float m_float = 123456.789123f; // 소수점 둘째자리 까지 저장
		double m_double = 123456.789123; // float 이상의 정말한 값을 저장
		System.out.println("m_float = " + m_float);
		System.out.println("m_double = " + m_double);

	}

}
