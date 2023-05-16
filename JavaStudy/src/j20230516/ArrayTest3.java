package j20230516;

import java.util.Scanner; // Ctrl + Shift + O

// 사용자로부터 연속적으로 5과목의 점수를 입력 받아서 총점, 평균값 구하기
public class ArrayTest3 {

	public static void main(String[] args) {
		
		int jumsu[] = new int[5]; // 0 ~ 4
		int sum = 0; // 합계
		double avg = 0.0; // 평균
		
		Scanner sc = new Scanner(System.in); // System.in(키보드)
		System.out.println("5과목의 점수를 입력하세요");
		
		// jumsu[0] = sc.nextInt(); // 숫자 -> nextInt(),  문자 -> next(), 소수점 -> nextDouble
		// sum += jumsu[0]; // sum = sum(0) + jumsu(0)
		
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = sc.nextInt();
			sum += jumsu[i];
		}
		// 최종합계, 평균
		avg = (double)sum/jumsu.length;
		System.out.println("총 점수는 : " + sum);
		System.out.println("평균 점수는 : " + avg);
		
		
		/*- 내가한거
		for (int i = 0; i <= 4; i++) {
			System.out.println("5과목 점수를 입력하세요 : ");
			jumsu[i] = sc.nextInt();
			sum += jumsu[i];
		}
		avg = sum/5;
		System.out.println("총 점수는 : " + sum);
		System.out.println("평균 점수는 : " + avg);
		*/
	}
}