package inherit.runtimepoly2;

import java.util.Scanner;

public class TestWithoutRuntimepoly {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your sal bank:");
		String salBank = sc.next();

		if (salBank.equals("hdfc")) {
			Hdfc h = new Hdfc();
			h.createAccount();
			h.processLoan();
		} else if (salBank.equals("sbi")) {
			SBI s = new SBI();
			s.createAccount();
			s.processLoan();
		} else if (salBank.equals("icici")) {
			Icici i = new Icici();
			i.createAccount();
			i.processLoan();
		} else {
			System.out.println("invald bank");
		}

	}

}
