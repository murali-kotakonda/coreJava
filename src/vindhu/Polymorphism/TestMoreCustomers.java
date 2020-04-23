package vindhu.Polymorphism;

import java.util.Scanner;

public class TestMoreCustomers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the customers:");
		int size = sc.nextInt();

		CustomerInput ci = new CustomerInput();
		CustomerValidation cv = new CustomerValidation();
		CustomerSave cs = new CustomerSave();

		for (int i = 1; i <= size; i++) {
			Customer c = new Customer();

			ci.input(c);
			boolean result = cv.validation(c);
			if (result) {
				cs.save(c);
			} else {
				System.out.println("registration for customer" + i + " is not successful");
			}
		}
	}
}
