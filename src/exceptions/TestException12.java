package exceptions;

public class TestException12 {
	public static void main(String[] args) {
		//input two nums
		int num1 = 20;
		int num2 = 0;

		try {
			// possibility of exception due to divide by zero
			int x = num1 / num2;
			System.out.println(x);
		} catch (ArithmeticException ex) {
			// ex.printStackTrace();
			System.out.println("invalid arithmetic operation"
					+ ex.getMessage());
		} 
		finally {
			System.out.println("Program ends");
		}
	}
}
