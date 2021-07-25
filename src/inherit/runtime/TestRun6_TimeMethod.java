package inherit.runtime;

import java.util.Scanner;

public class TestRunTimeMethod {
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
			RBI r = new RBI();
			execute(r);
		}
	}

	//if method is expecting parent obj then method can be called by passing parent obj or child obj 
	//if method is expecting child  obj then method cannot  be called by passing child obj 
	private static void execute(RBI r) {
		r.createAcc();
		r.processLoan(); 
	}
}
