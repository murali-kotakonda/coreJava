package enums;

public class TestColorType {
	public static void main(String[] args) {
		//get obj for black
		ColorType c = ColorType.BLACK;
		System.out.println(c);
		
		//get all objs
		ColorType[] objs = ColorType.values();
		for(ColorType obj :objs) {
			System.out.println(obj);
		}
		
		

	}
}
