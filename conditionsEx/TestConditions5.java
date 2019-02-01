package conditionsEx;

import java.util.Scanner;

public class TestConditions5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id:");
		int id = sc.nextInt();

		System.out.println("enter age:");
		int age = sc.nextInt();

		// if id is invalid
		if (id <= 0) {
			System.out.println("Invalid id!");
		} else if (age < 18) {
			// id is valid //invalid age
			System.out.println("Invalid age");
		} else {
			// valid age and valid id
			System.out.println("Id= " + id);
			System.out.println("age=" + age);
		}
	}
}
