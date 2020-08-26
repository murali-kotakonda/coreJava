package inherit.interfaceEx2MultiLevel;

import java.util.Scanner;



public class TetInherit {
	public static void main(String[] args) {
	 	RBIBank r = new  Icici();
	 	r.createAccount(); // Icici
	 	r.processLoan();   // Icici
	}

}