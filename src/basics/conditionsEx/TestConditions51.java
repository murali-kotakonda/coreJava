package basics.conditionsEx;

import java.util.Scanner;

public class TestConditions51 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id:");
		int id = sc.nextInt();

		System.out.println("enter age:");
		int age = sc.nextInt();

		System.out.println("enter userType:");
		String userType = sc.next();

		// if id is invalid
		if (id > 0) {
			if (age > 18) {
				if (userType.equals("admin")) {
					System.out.println("valid data");
				} else {
					System.out.println("invalid userType");
				}
			} else {
				System.out.println("invalid age");
			}
		} else {
			System.out.println("invalid id");
		}
		System.out.println("exit");
	}
}
