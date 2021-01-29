package exceptions;

/**
/**
	 
	
can we write try with multiple catch blockes?
Yes

at a time only one cathc block is executed.

try{
	
}
catch(ArithmeticException ex){
	
	
}
catch(NullPointerException ex){
	
}
catch(ArrayIndexOutOfBoundsException ex ){
	
}

solution: try with multiple catches
 at a time only one exception is created.
  solution: try with multiple catches
		at a time only one exception is created.
		at a time only one catch block is executed.
		
		
*/

public class TestException15TryWithMultipleCatches {
	public static void main(String[] args) {
		String name = null;
		int num1= 20;
		int num2 = 1;
		int nums[] = new int[5];
		try {
			//can fail due to number format
			int num = Integer.parseInt("123");
			System.out.println(" after conversion ::"+num);
			
			// possibility of exception due to divide by zero
			int x = num1 / num2;
			System.out.println(x);

			// java.lang.NullPointerException occurs if obj is not created
			System.out.println(name.length());

			// error due to invalid index array index out of bound
			System.out.println(nums[9]);
		} catch (ArithmeticException ex) {
			System.out.println("ArithmeticException created. invalid arithmetic operation" + ex.getMessage());
		
		} catch (NullPointerException ex) {
			System.out.println("NullPointerException created.obj is null:" + ex.getMessage());
		
		
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("ArrayIndexOutOfBoundsException created .invalid array acess:" + ex.getMessage());
		
		} catch (NumberFormatException ex) {
			System.out.println("NumberFormatException created .str convertion failed :" + ex.getMessage());
		}  
		
		System.out.println("Program ends");
	}
}
