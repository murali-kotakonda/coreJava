package vindhu.Polymorphism;

public class TestTwoCustomers {
	public static void main(String[] args) {
		
		Customer c1=new Customer();
		Customer c2=new Customer();
		CustomerInput ci=new CustomerInput();
		CustomerValidation cv=new CustomerValidation();
		CustomerSave cs=new CustomerSave();
		ci.input(c1);
		boolean result=cv.validation(c1);
		if(result) {
			cs.save(c1);
		}
		else {
			System.out.println("registration for customer1 is not successful");
		}
		ci.input(c2);
		boolean result2=cv.validation(c2);
		if(result2) {
			cs.save(c2);
		}
		else {
			System.out.println("registration for customer2 is not successful");
		}
	}
}

