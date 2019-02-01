package conditionsEx;

import java.util.Scanner;

public class TestLogicalAnd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id:");
		int id = sc.nextInt();

		System.out.println("enter age:");
		int age = sc.nextInt();

		
		
		if (id > 0  &&  age > 18) {
			System.out.println("succes:: Id=" + id + " , age=" + age);
		} else {
			System.out.println("Invalid id/age..");
		}
		
		
		
		
		
		if (id < 0  ||  age < 18) {
			System.out.println("Invalid id/age..");
		} else {
			System.out.println("succes:: Id=" + id + " , age=" + age);
		}
	}
}
