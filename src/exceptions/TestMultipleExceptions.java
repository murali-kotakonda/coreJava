package exceptions;

import java.util.Scanner;

public class TestMultipleExceptions {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = "";
		System.out.println("enter two numbers");
		int num1 = 20;
		int num2 = 1;
		int nums[] = new int[5];

		try {
			// possibility of exception due to divide by zero
			int x = num1 / num2;
			System.out.println(x);

			// java.lang.NullPointerException occurs if obj is not created
			System.out.println(name.length());

			// error due to invalid index array index out of bound
			System.out.println(nums[9]);
		} catch (ArithmeticException ex) {
			// ex.printStackTrace();
			System.out.println("ArithmeticException error occured due to :"
					+ ex.getMessage());
		} 
		catch (NullPointerException ex) {
			// ex.printStackTrace();
			System.out.println("NullPointerException error occured due to string is null:"
					+ ex.getMessage());
		} catch (Exception ex) {
			 ex.printStackTrace();
			System.out.println("Exception error occured due to :"
					+ ex.getMessage());
		} finally {
			System.out.println("Program ends");
		}
	}
}
