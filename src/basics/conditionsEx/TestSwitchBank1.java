package basics.conditionsEx;

import java.util.Scanner;

public class TestSwitchBank1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Bank Name");
		String bank = sc.next();

		if (bank.equals("HDFC")) {
			System.out.println("HDFC rate of Intrest is 11%");
		} else if (bank.equals("ICICI")) {
			System.out.println("Rate of Intrest 12%");
		} else if (bank.equals("SBI")) {
			System.out.println("Rate of Intrest 13%");
		} else {
			System.out.println("Invalid Bank");
		}
	}
}
