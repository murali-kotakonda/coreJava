package inherit.runtimepoly2;

import java.util.Scanner;

public class TestUpcast {
	public static void main(String[] args) {
		RBIBank r = new Icici();// Upcasting
		
		
		r.createAccount();
		r.processLoan();
		
		
		if(r instanceof Icici) {
			Icici i = (Icici)r;//type casting or down casting 
			i.hi();
			i.createPPF();
			
		}
		
		if(r instanceof SBI) {
			SBI S = (SBI)r;//type casting or down casting 
			S.hi();
		}
	}

}
