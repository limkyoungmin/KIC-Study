package j20230515;


public class Rect1 {
	
	private int su;
	
	public void setSu(int x, int y) {
		if((x > 0) && (y > 0)) {
			su = x;
			su = y;
		} else {
			System.out.println("둘 중 하나라도 음수면 안됨");
			System.out.println("=============");
		}
		
	}
	
	public int getSu() {
		return su;
	}
}
