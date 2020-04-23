package inherit.runtimepoly2;

import java.util.Scanner;

public class TestRunTimeEx2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your sal bank:");
		String salBank = sc.next();

		if (salBank.equals("hdfc")) {
			Hdfc h = new Hdfc();
			execute(h);
		} else if (salBank.equals("sbi")) {
			SBI s = new SBI();
			execute(s);
		} else if (salBank.equals("icici")) {
			Icici i = new Icici();
			execute(i);
		} else {
			RBIBank r = new RBIBank();
			execute(r);
		}
	}

	private static void execute(RBIBank r) {
		r.createAccount();
		r.processLoan(); 
	}
}
