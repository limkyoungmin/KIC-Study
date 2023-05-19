package j20230519;

public class ExceptionTotal {

	public static void main(String[] args) {
		System.out.println("매개변수 2개 전달해서 계산(동적배열)");
		try {
			// 숫자로 변환하는 이유 : 계산하기 위해서
			int a = Integer.parseInt(args[0]); // "9" -> 9
			int b = Integer.parseInt(args[1]); // "3" -> 9
			System.out.println("a : " + a + ", b : " + b);
			System.out.println("a를 b로 나눈 몫 : " + a / b);
		} catch (Exception e) { // 위의 처리하는 3개의 예외처리외의 다른 예외가 발생 했을때
			System.out.println(e);
			System.out.println("위의 예외처리외의 나머지를 처리해줍니다.");
		}/* catch (ArithmeticException e) {
			System.out.println(e); // e.toString()
			System.out.println("어떤 수 를 0으로 나눌수가 없음");
		} catch (IndexOutOfBoundsException | NumberFormatException e) {
			System.out.println(e);
			System.out.println("반드시 2개를 입력하거나 숫자만 입력가능함");
		} catch (NumberFormatException e) { // 숫자 대신에 문자를 입력할 경우
			System.out.println(e);
			System.out.println("반드시 숫자를 입력해야 합니다.");
		} catch (Exception e) { // 위의 처리하는 3개의 예외처리외의 다른 예외가 발생 했을때
								// Exception를 맨 앞에 적기가 가능하지만 나머지 기능은 사용이 안됨
			System.out.println(e);
			System.out.println("위의 예외처리외의 나머지를 처리해줍니다.");
		// 메모리에 저장된 데이터를 파일로 저장종료(DB연결해제)
		}*/ finally { 
			System.out.println("예외처리 발생유무 관계 없이 무조건 반드시 처리하겠음");
		}
	}
}