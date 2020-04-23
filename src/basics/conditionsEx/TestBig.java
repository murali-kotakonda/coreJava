package basics.conditionsEx;

import java.util.Scanner;

public class TestBig {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("To display the maximum number of 4 given numbers...\n Enter first number: ");
		int first = sc.nextInt();

		System.out.println("Enter second number: ");
		int second = sc.nextInt();

		System.out.println("Enter third number: ");
		int third = sc.nextInt();

		System.out.println("Enter fourth number: ");
		int fourth = sc.nextInt();

		int max = first;

		if (second > max)
			max = second;
		if (third > max)
			max = third;
		if (fourth > max)
			max = fourth;

		System.out.println("The largest of four numbers is " + max);
	}
}