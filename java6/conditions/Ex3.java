package conditions;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		//1. take id, usertype , age as input
		//2. if id is valid then only validate usertype..
		//3.if  usertype is valid then only validate age
		
		//1. take id, usertype , age as input
		Scanner sc = new Scanner(System.in);

		System.out.println("enyer id");
		int id = sc.nextInt();

		System.out.println("enter usertype");
		String ut = sc.next();

		System.out.println("enter age");
		int age = sc.nextInt();

		// using if and else if
		//when should i use if and else if???
		/*
		  1. at a time  only one condition is satisfied.
		  2. dependency between the conditions 
		  3.  else if simplifies the nested if.
		 */
		
		if (id < 0) {
			System.out.println("invalid id ");
		} else if (!ut.equals("admin")) {
			System.out.println("invalid user type");
		} else if (age < 18) {
			System.out.println("invalid age");
		} else {
			System.out.println("all are valid");
		}

	}
	
}
