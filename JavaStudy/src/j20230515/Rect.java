package j20230515;

public class Rect {
	
	private int x;
	private int y;
	
	public void setX(int x) {
		if(x >= 0) {
			System.out.println("x 의 값 : " + x);
			x = x;
		} else {
			System.out.println("X의 값이 음수 이므로 안됩니다.");
		}
		
	}
	
	public void setY(int y) {
		if(y >= 0) {
			System.out.println("y 의 값 : " + y);
			y = y;
		} else {
			System.out.println("y의 값이 음수 이므로 안됩니다.");
		}
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
}
