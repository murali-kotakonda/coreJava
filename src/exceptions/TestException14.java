package exceptions;

public class TestException14 {
	public static void main(String[] args) {
		int num1 = 20;
		int num2 = 0;
		int x = 0;
		try {

			x = num1 / num2;

		} catch (ArithmeticException ex) {
			System.out.println("exception due to divison by zero");
			x = -1;
		}
		System.out.println(x);
		System.out.println("Program ends");

	}
}
