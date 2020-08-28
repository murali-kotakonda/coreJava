package hasA;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TestEmpWithAddrInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of emps");
		int empSize = sc.nextInt();

		if (empSize <= 0) {
			System.out.println("invalid no! try again");
			return;
		}

		List<Employee> emps = new LinkedList<>();

		for (int i = 1; i <= empSize; i++) {
			System.out.println(" ENTER DETAILS FOR EMP "+i); 
			Employee e = input(sc);
			emps.add(e);
		}

		System.out.println("*************** SHOW ALL EMPS ***********");
		int i=1;
		for (Employee e : emps) {
			System.out.println("*********** Showing for emp "+(i++) + "***********");
			e.show1();
		}

	}

	private static Address inputAddress(Scanner sc) {
		System.out.println("enter streetNo");
		String streetNo = sc.next();

		System.out.println("enter state");
		String state = sc.next();

		System.out.println("enter country");
		String country = sc.next();

		System.out.println("enter city");
		String city = sc.next();

		System.out.println("enter pin");
		String pin = sc.next();
		return new Address(streetNo, city, state, country, pin);
	}

	private static Employee input(Scanner sc) {
		System.out.println("enter id");
		int id = sc.nextInt();

		System.out.println("enter name");
		String name = sc.next();

		System.out.println("enter age");
		int age = sc.nextInt();

		System.out.println("enter sal");
		float sal = sc.nextInt();

		Employee e = new Employee(id, age, name, sal);
		System.out.println("how many addresses??");
		int addrCount = sc.nextInt();

		if (addrCount > 0) {
			for (int j = 1; j <= addrCount; j++) {
				e.getAddresses().add(inputAddress(sc));
			}
		}
		return e;
	}
}
