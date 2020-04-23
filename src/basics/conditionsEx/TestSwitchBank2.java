package basics.conditionsEx;

import java.util.Scanner;

public class TestSwitchBank2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Bank Name");
		String bank = sc.next();

		switch (bank) {
		case "icici":
			System.out.println("11%");
			break;

		case "hdfc":
			System.out.println("12%");
			break;

		case "sbi":
			System.out.println("13%");
			break;

		case "citi":
			System.out.println("14%");
			break;

		default:
			System.out.println("invalid bank");
			break;

		}
	}
}
