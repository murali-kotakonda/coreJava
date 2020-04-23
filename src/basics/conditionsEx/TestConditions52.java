package basics.conditionsEx;

import java.util.Scanner;

public class TestConditions52 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id:");
		int id = sc.nextInt();

		System.out.println("enter age:");
		int age = sc.nextInt();

		System.out.println("enter userType:");
		String userType = sc.next();

		// if id is invalid
		if (id <= 0) {
			System.out.println("Invalid id!");
		} else if (age < 18) {
			// id is valid //invalid age
			System.out.println("Invalid age");
		}else if (!userType.equals("agent")) {
			// id is valid + age is valid
			System.out.println("Invalid userType");
		}  
		else {
			System.out.println("valid data");
		}

		System.out.println("exit");
	}
}
