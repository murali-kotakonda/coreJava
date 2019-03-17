package exceptions;

public class TestThrow {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 0;

		try {
			int output = getDivisionResult(num1, num2);
			System.out.println("output = " + output);
		} catch (ArithmeticException ex) {
			ex.printStackTrace();
			System.out.println(ex.getMessage());
		}

	}

	private static int getDivisionResult(int num1, int num2) {
		if (num2 == 0) {
			ArithmeticException ex =
					new ArithmeticException("num2 cannot be 0");
			throw ex;
		}
		return num1 / num2;
	}
}
