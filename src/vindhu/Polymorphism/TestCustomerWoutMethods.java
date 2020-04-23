package vindhu.Polymorphism;

public class TestCustomerWoutMethods {
	public static void main(String[] args) {
		
		Customer c=new Customer();
		CustomerInput ci=new CustomerInput();
		CustomerValidation cv=new CustomerValidation();
		CustomerSave cs=new CustomerSave();
		ci.input(c);
		boolean result=cv.validation(c);
		if(result) {
			cs.save(c);
		}
		else {
			System.out.println("registration for customer is not successful");
		}
	}
}
