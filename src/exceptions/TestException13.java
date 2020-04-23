package exceptions;

public class TestException13 {
	public static void main(String[] args) {
		String name = null;
		try {
			System.out.println(name.length());
		} 
		catch (NullPointerException ex) {
			// ex.printStackTrace();
			System.out.println("obj is null:"
					+ ex.getMessage());
		} 
		finally {
			System.out.println("Program ends");
		}
	}
}
