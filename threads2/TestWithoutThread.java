package threads2;

import java.util.Scanner;

public class TestWithoutThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 2 nums");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		System.out.println("add=" + num1 + num2);
		System.out.println("sub =" + (num1 - num2));
		System.out.println("mul=" + num1 * num2);
		System.out.println("div=" + num1 / num2);
	}
}