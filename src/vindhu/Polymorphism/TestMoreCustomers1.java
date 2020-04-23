package vindhu.Polymorphism;

import java.util.Scanner;

public class TestMoreCustomers1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the customers:");
		int size = sc.nextInt();

		CustomerInput1 ci = new CustomerInput1();
		CustomerValidation1 cv = new CustomerValidation1();
		CustomerSave1 cs = new CustomerSave1();

		for (int i = 1; i <= size; i++) {
			Customer1 c1 = new Customer1();

			ci.input(c1);
			boolean result = cv.validation(c1);
			if (result) {
				cs.save(c1);
			} else {
				System.out.println("registration for customer" + i + " is not successful");
			}
		}
	}
}
