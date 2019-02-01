package conditionsEx;

import java.util.Scanner;

public class TestConditions3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age:");
		int age = sc.nextInt();

		if (age > 18) {
			System.out.println("Valid age!!Proceed");
			System.out.println("enter id");
			int id = sc.nextInt();
			if (id < 0) {
				System.out.println("Invalid Id!!");
			} else {
				System.out.println("valid Id!!");
			}
		} else{
			System.out.println("Age should be greater than 18");
		}
	}
}
