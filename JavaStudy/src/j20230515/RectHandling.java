package j20230515;

public class RectHandling {
	public static void main(String[] args) {
		Rect1 rt = new Rect1();
		
		rt.setSu(3, 1);
		System.out.println(rt.getSu());
		
		rt.setSu(3, -1);
		rt.setSu(-1, 3);
	}
}
