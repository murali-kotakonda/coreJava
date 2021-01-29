package exceptions;

import java.util.Scanner;

public class TestException1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age::");
		String age = sc.next();

		// convert str to int
		try {
			int ageInt = Integer.parseInt(age);
			System.out.println("after conversion age int :: " + ageInt);
		} catch (NumberFormatException ex) {
			System.out.println("invalid input ::" + age + ". " + "please try again");
		} finally {
			System.out.println("finally completed");
		}
		System.out.println("exit");
	}

}
