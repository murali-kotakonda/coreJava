package inherit.interfaceEx2Multiple;

import java.util.Scanner;

public class TetInherit2 {
	public static void main(String[] args) {
		Hdfc h = new Hdfc();
		h.createAccount();// logic from child
		h.processLoan();
	}
}
