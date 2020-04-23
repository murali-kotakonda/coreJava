package exceptions;

public class TestException222 {
	public static void main(String[] args) {
		String name = "";
		System.out.println("enter two numbers");
		int num1 = 20;
		int num2 = 1;
		int nums[] = new int[5];
		String data = "";
		try {
			// possibility of exception due to divide by zero
			int x = num1 / num2;
			System.out.println(x);

			int z = Integer.parseInt(data);
			// java.lang.NullPointerException occurs if obj is not created
			System.out.println(name.length());

			// error due to invalid index array index out of bound
			System.out.println(nums[9]);
		} catch (ArithmeticException ex) {
			// ex.printStackTrace();
			System.out.println("invalid arithmetic operation" + ex.getMessage());
		} catch (NullPointerException ex) {
			// ex.printStackTrace();
			System.out.println("obj is null:" + ex.getMessage());
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("invalid array acess:" + ex.getMessage());
		} catch (NumberFormatException ex) {
			System.out.println("invalid array acess:" + ex.getMessage());
		} finally {
			System.out.println("Program ends");
		}
	}
}
