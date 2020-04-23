package enums;

public enum ColorType {

	BLUE,
	RED,
	BLACK,
	GREEN,
	WHITE,
	BROWN;
	
	public static boolean isValidColor(String input) {
		ColorType[] objs = ColorType.values();
		boolean found= false;
		for(ColorType obj :objs) {
			if(input.equals(obj.toString())) {
				found= true;
				break;
			}
		}
		return found;
	}
	
}
