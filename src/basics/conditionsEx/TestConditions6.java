package basics.conditionsEx;

import java.util.Scanner;

public class TestConditions6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id:");
		int id = sc.nextInt();

		System.out.println("enter age:");
		int age = sc.nextInt();

		System.out.println("enter userType:");
		String userType = sc.next();


		if (id <= 0) {
			// if id is invalid
			System.out.println("Invalid id!");
		} else if (age < 18) {
			// id is valid //invalid age
			System.out.println("Invalid age");
		} else if (!userType.equals("admin")) {
			//id is valid, age is valid but usertype is invalid
			System.out.println("Invalid user");
		} else {
			//all are valid
			System.out.println("valid");
			System.out.println("Id= " + id);
			System.out.println("age=" + age);
			System.out.println("usertype=" + userType);
		}

		System.out.println("exit");
	}
}
