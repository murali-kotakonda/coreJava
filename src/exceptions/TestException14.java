package exceptions;

public class TestException14 {
	public static void main(String[] args) {
		String name = null;
		try {
			System.out.println(name.length());
		} 
		catch (NullPointerException ex) {
			System.out.println("obj is null: please create obj "
					+ ex.getMessage());
		} 
	}
}
