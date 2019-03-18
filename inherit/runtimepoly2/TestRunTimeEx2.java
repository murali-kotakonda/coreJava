package inherit.runtimepoly2;

import java.util.Scanner;

import inherit.overrideEx.RBI;

public class TestRunTimeEx2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your sal bank:");
		String salBank = sc.next();

		if (salBank.equals("hdfc")) {
			Hdfc h = new Hdfc();
			process(h);
		} else if (salBank.equals("sbi")) {
			SBI s = new SBI();
			process(s);
		} else if (salBank.equals("icici")) {
			Icici i = new Icici();
			process(i);
		} else {
			RBIBank r = new RBIBank();
			process(r);
		}
	}

	private static void process(RBIBank r) {
		r.createAccount();
		r.processLoan(); 
	}
 	
}
