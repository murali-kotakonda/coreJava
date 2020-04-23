package inherit.interfaceEx2MultiWithAbstract3;

import java.util.Scanner;

public class TetInherit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your sal bank:");
		String salBank = sc.next();

		 MyBank b =null;
		if (salBank.equals("hdfc")) {
			b = new Hdfc();
		} else if (salBank.equals("sbi")) {
			b = new SBI();
		} else if (salBank.equals("icici")) {
			b = new Icici();
		}  
		b.createAccount();// logic from child
		b.processLoan();
	}

}
