package inherit.interfaceEx1;

import java.util.Scanner;

public class TetInherit2 {
	public static void main(String[] args) {
		RBIBank r = new Hdfc();
		r.createAccount();
		r.createPPF();
		r.getKYC();

		}

}
