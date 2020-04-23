package inherit.interfaceEx4Multi5;

import java.util.Scanner;

public class TetInherit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your sal bank:");
		String salBank = sc.next();
		
		if(salBank.equals("sbi")) {
			SBI sbi = new SBI();;
			sbi.demat();// logic from parent
			sbi.processLoan();
			sbi.createAccount();
		} else if (salBank.equals("icici")) {
			Hdfc icici = new Hdfc();
			icici.demat();// logic from parent
			icici.processLoan();
			icici.createAccount();
		}  

	}

}
