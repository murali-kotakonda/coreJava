package conditionsEx;

import java.util.Scanner;

public class TestSwitch {
	public static void main(String[] args) {
		System.out.println("enter bank");
		Scanner sc = new Scanner(System.in);
		String bank =sc.next();

		switch (bank) {
		case "icici":
			System.out.println("10%");
			break;

		case "hdfc":
			System.out.println("11%");
			break;

		case "sbi":
			System.out.println("12%");
			break;

		case "citi":
			System.out.println("13%");
			break;

		default:
			System.out.println("invalid bank");
			break;

		}
	}
}
