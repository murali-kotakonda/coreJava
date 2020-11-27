package conditions;

import java.util.Scanner;

public class Prog3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// take input
		System.out.println("enter age:");
		int age = sc.nextInt();

		System.out.println("enter id");
		int id = sc.nextInt();

		System.out.println("enter usertype");
		String userType = sc.next();

		// id should be positive , age should be greater than 18 , usertype should be
		// "admin"

		// every condition result is a boolean

		boolean v = id > 0; // true/false
		if (v) { // if (id > 0)
			System.out.println(" id is valid");
		} else {
			System.out.println("id is invalid");
		}

		boolean v1 = age > 18;
		if (v1) {
			System.out.println(" valid age");
		} else {
			System.out.println("invalid age");
		}

		boolean v2 = userType.equals("admin");
		if (v2) {
			System.out.println("valid usertype");
		} else {
			System.out.println("invalid usertype");
		}

	}
}
