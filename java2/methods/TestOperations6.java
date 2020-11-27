package methods;

public class TestOperations6 {

	// call the method of 1st class from the 2nd class
	public static void main(String[] args) {
		// call the big() method inside the Opeartions
		//step 1 : create the Object for Opeartions
		Operations op = new Operations();
		
		//step2 : call the method using the object
		int b1= op.big(34, 23);
		System.out.println(b1);
		
		int b2= op.big(341, 123);
		System.out.println(b2);
		
		int b3= op.big(314, 2131);
		System.out.println(b3);
	}
}



