package inherit.runtimepolyEx3;

import java.util.Scanner;

public class TetInheritOld {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your sal bank:");
		String salBank = sc.next();

		if (salBank.equals("hdfc")) {
			Hdfc r = new Hdfc();
			r.createAccount();
			r.processLoan(); 
		} else if (salBank.equals("sbi")) {
			SBI r = new SBI();
			r.createAccount();
			r.processLoan();
		} else if (salBank.equals("icici")) {
			Icici r = new Icici();
			r.createAccount();
			r.processLoan();
		}  
		}
	
	
	
}
