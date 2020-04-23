package exceptions;

public class TestException223 {
	public static void main(String[] args) {
		String name = "";
		int num1 = 20;
		int num2 = 1;
		int nums[] = new int[5];
		String data = "";
		try {
			// possibility of exception due to divide by zero
			int x = num1 / num2;
			System.out.println(x);

      //possobility for numberformat execpion
			int z = Integer.parseInt(data);
			
      // java.lang.NullPointerException occurs if obj is not created
			System.out.println(name.length());

			// error due to invalid index array index out of bound
			System.out.println(nums[9]);
      
		} catch (Exception ex) {
      //this catch block can handle any exception that occurs in try block
      //this is a global exception handling block in case if we are not sure of which  exception occurs.
			// ex.printStackTrace();
			System.out.println("Generic exception occured...." + ex.getMessage());
    }finally {
			System.out.println("Program ends");
		}
	}

}
