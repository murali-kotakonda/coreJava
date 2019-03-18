package inherit.runTimeValidate;

import java.util.Scanner;

public class TestValidation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Customer or User or Employee:");
		String str=sc.next();
		
		Customer c=null;
		CustomerValidation cv=null;
		
		if(str.equals("Customer")) {
			c=new Customer();
			cv=new CustomerValidation();
		}
		else if(str.equals("User")) {
			c=new User();
			cv=new UserValidation();
		}
		else if(str.equals("Employee")) {
			c=new Employee();
			cv=new EmployeeValidation();
		}
		cv.input(c);
		boolean result=cv.validation(c);
		if(result) {
			cv.save(c);
		}
		else {
		    System.out.println("registration for customer is not successful");
		}
	}
}
