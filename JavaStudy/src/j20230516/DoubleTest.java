package j20230516;

public class DoubleTest {

	public static void main(String[] args) {

		System.out.println("2차원배열을 생성 및 가변배열");

		// 형식) 배열의 자료형 배열명[][] = new 자료형[행수][열수]
		int c[][] = new int[3][3];

		// 형식2) 배열의 자료형 배열명[][] = {{값1, 값2, 값3}, {}, {}, {}}
		// 고정배열
		// int b[][] = {{10, 20, 30,}, {40, 50, 60,}, {70, 80, 90}};
		//                  ↓                 ↓             ↓
		//                b[0][1]            b[1][2]        b[2][2]

		// 가변배열 : 행은 정해져 있는데 열은 그때마다 바뀌는 경우
		int b[][] = { { 10, 20, 30, }, { 40, 50 }, { 60, 70, 80, 90 } };

		for (int i = 0; i < b.length; i++) { // 행의값(열의 데이터 주소값 출력)
			//System.out.println("b[" + i + "] : " + b[i]);
			for (int j = 0; j < b[i].length; j++) {
				System.out.println("b[" + i + "][" + j + "] : " + b[i][j]);
			}
		}
		
		/*		for(2차원배열의 자료형 배열명[][]:3차원배열명) // 절대로 [][][] 표시(X)
		 * 형식) for(1차원배열의 자료형 배열명[]:2차원배열명) // 절대로 [][] 표시(X)
		 *       	for(1차원배열의 자료형 출력변수명:1차원배열명) // 절대로 [] 표시(X)
		 *       
		 */
		int sum = 0;
		for (int temp[]:b) { // 2차원배열(b)에서 1차원배열의 값을 하나씩 꺼내서 temp에 저장
			for (int su:temp) {
				System.out.println(su + "\t");
				sum += su;
			}
			System.out.println(); // 행이 바뀔때마다 줄바꿈
		}
		System.out.println("sum : " + sum);
	}
}