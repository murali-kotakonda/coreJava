package inherit.interfaceEx2Multiple;

import java.util.Scanner;

public class TetInherit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your sal bank:");
		String salBank = sc.next();

		
		RBIBank rbi = null;
		WorldBank worldBank = null;
		if (salBank.equals("hdfc")) {
			Hdfc h = new Hdfc();
			worldBank = h;
			rbi= h;
		} else if (salBank.equals("sbi")) {
			rbi = new SBI();
			worldBank= (SBI) rbi;
		} else if (salBank.equals("icici")) {
			rbi = new Icici();
			worldBank= (Icici) rbi;
		}  
		rbi.createAccount();// logic from child
		worldBank.processLoan();
	}

}
