package j20230516;

// 1차원배열의 문제
public class ArrayTest2 {

	public static void main(String[] args) {
		int b[] = {58, 38, 12, 36, 41, 27, 26, 32, 59, 16, 18, 28, 21, 17};
		int count = 0;
		// 10대 ~ 50대 -> 20대(20 ~ 29) 몇명?
		
		for(int i = 0; i < b.length; i++) {
			if(b[i] >= 20 && b[i] < 30) {
				count++;
				System.out.println("b[" + i + "] : " + b[i]);
			}
		} System.out.println("20대 인원수(count) = " + count);
		
		
		
		/*for (int i = 0; i < 14; i++) {
			if((b[i] > 20) && (b[i] < 30) ) {
				System.out.println(b[i]);
			}
		}*/
	}
}