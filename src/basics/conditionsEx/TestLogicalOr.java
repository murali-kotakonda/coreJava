package basics.conditionsEx;

import java.util.Scanner;

public class TestLogicalOr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter city");
		String citi = sc.next();

		if (citi.equals("hyderabad")) {
			System.out.println("Service can be Provided");
		} else if (citi.equals("bangalore")) {
			System.out.println("Service can be Provided");
		} else if (citi.equals("chennai")) {
			System.out.println("Service can be Provided");
		} else if (citi.equals("mumbai")) {
			System.out.println("Service can be Provided");
		} else {
			System.out.println("service cannot be provided");
		}
	}
}
