package j20230515;

import java.security.DrbgParameters.NextBytes;
// 외부의 패키지에 불러올때 import ----> 최상위패키지명.하위패키지명...불러올클래스명;
import java.util.Scanner;

// 성적처리 프로그램 -> 국, 영, 수 -> 합계 -> 평균 -> 등급 -> 모든 정보 한번에 출력
public class MethodEx {
	
	// 요구분석에 따라서 필요로 하는 메소드를 생각
	/*
	 *  메소드를 작성할때 매개변수를 주고, 안주는 경우(구분)
	 *  1. 멤버변수로 선언 -> 매개변수가 없는 메소드를 작성O
	 *  2. 멤버변수로 선언X -> 지역변수로 선언
	 *  						매개변수가 있는 메소드를 작성O
	 *  3. 반환값O -> caller가 처리
	 *     반환값X -> 호출한 메소드가 처리
	 */
	
	// int kor, eng, math, total;
	// double avg
	// orarg raed
	
	// static 메소드 작성 -> 메소드 내부에서는 멤버변수가 있으면 안된다. this.멤버변수
	// 1. 총점(합계)
	static int calcTotal(int kor, int eng, int math) {
	// int calcSum() {
		int total = kor + eng + math;
		return total;
	}
	
	// 2. 평균(총점 / 과목 수)
	static double calcAvg(int total) {
		return (double)(total / 3);
	}
	// 매소드 오버로딩 : 비슷한 기능을 가진 메소드명은 하나의 메소드로 통합
	static double calcAvg(int total, int sum) {
		return (double)(total/sum);
	}
	
	// 3. 등급(학점 -> 평균 점수에 A ~ F 까지)
	char calcGrade(double avg) {
		if (avg <= 100 && avg >= 90) return 'A';
		else if ( avg < 89 && avg >= 80) return 'B';
		else if ( avg < 79 && avg >= 70) return 'C';
		else if ( avg < 69 && avg >= 60) return 'D';
		else return 'F';
	}
	
	// 4. 총점, 평균, 등급 한번에 출력 -> 단순, 반복 -> 매개변수X 반환값X
	// 멤버변수가 없기 때문에 매개변수는 있어야됨
	void display(int total, double avg, char grade) {
		System.out.println("합계는(total) : " + total);
		System.out.println("평균은(avg) : " + avg);
		System.out.println("등급은(grade) : " + grade);
	}
	
	
	// 외부에서 호출이 가능하며, 객체생성 없이도 호출이 가능한 정적메소드
	public static void main(String[] args) {
		// 맴버변수가 없기 때문에
		// 객체생성
		MethodEx me = new MethodEx();
		
		// 지역변수 : 메소드 내부에서만 사용이 가능 -> 다른 매소드에서 불러서 사용X
		// scanner : 사용자로부터 값을 입력받아 처리
		// nextInt() 정수, next() 문자
		// Ctrl + Shift + O : 자동 import 기능
		Scanner sc = new Scanner(System.in); //키보드
		System.out.println("1. 국어점수를 입력해주세요.");
		int kor = sc.nextInt(); // 소수점 : sc.nextDouble();
		System.out.println("2. 영어점수를 입력해주세요.");
		int eng = sc.nextInt();
		System.out.println("3. 수학점수를 입력해주세요.");
		int math = sc.nextInt();
		
		// 1. 총점
		// 정적메소드 부르는 방법 : 클래스명.정적메소드명
		int total = MethodEx.calcTotal(kor, eng, math);
		// System.out.println("총점수 : " + total);
		
		// 2. 평균
		// 정적메소드 부르는 방법 : 앞의 클래스명 생략 가능
		// 주의 : 자기클래스의 메소드를 호출하는 경우에만 생략 가능
		double avg = me.calcAvg(total);
		
		// 3. 등급
		char grade = me.calcGrade(avg);
		
		// 4. 한번에 출력
		me.display(total, avg, grade);
	}
}