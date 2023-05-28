package j20230523;

// List -> ArrayList, Vector, Random....
import java.util.*;

public class ArrayListLotto extends Object {
	
	Integer bonus; // 숫자객체
				   // int(X)
	List<Integer> lotto = new ArrayList<Integer>();
	// 부모가 가져오지 못해서 자식클래스의 객체를 통해서 인터페이스객체를 얻어올 수 있다.
	
	// 6개의 번호를 랜덤으로 출력
	public void setUp() { // 난수 0 ~ 0.999....
		
		/* 
		 * 난수를 발생 시킬수 있는 방법
		 * 1. Math.random() : 난수를 만들어주는 메소드
		 *             단점 : 중복된 숫자가 나옴
		 *                    seed값(섞어주는값 고정) -> 중복 높음
		 */
		Random random = new Random(); // 내부값이 변경될 때 마다 seed값이 변경됨 -> 중복X
		while (bonus == null) { // 보너스 번호가 설정 안되어 있을때
			
			// nextInt(숫자범위) = 숫자범위내의 임의의수를 출력
			int num = random.nextInt(45)+1; // 1이 안나오기 때문에 +1을 해줘야됨
			// System.out.println("num : " + num);
			
			// 번호를 하나 뽑을때마다 lotto 배열의 내용을 비교 (중복비교)
			if (!lotto.contains(num)) { // 중복된 숫자가 아니라면
				if (lotto.size() < 6) { // 중복되지않음 + lotto 배열에 6개의 숫자가 다 안찼을 경우
					lotto.add(num); // 뽑은 숫자를 lotto에 저장
				} else { // lotto 배열이 꽉 찬 경우 lotto.size() >= 6
					bonus = num; // 6개의 수가 꽉 차고 중복되지 않으면 나머지 보너스
				} // else
			} // outer if
		} // while
		Collections.sort(lotto); // 랜덤으로 뽑은 숫자를 오름차순으로 정렬
		System.out.println(lotto.size());
	}
	
	@Override
	public String toString() {
		return "당첨번호 : " + lotto + ", 보너스 번호 : " + bonus;
	}
	
	public static void main(String[] args) {
		
		ArrayListLotto lotto = new ArrayListLotto();
		
		lotto.setUp(); // 6개의 번호를 구함
		System.out.println(lotto); // 주소값 출력 -> lotto.toString()
	}
}