package inherit.runtime;

import java.util.Scanner;

public class TestRun2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String bankName = sc.next();
	
	if(bankName.equals("sbi")){
		SBI s = new SBI();
		s.createAcc();
		s.processLoan();
	}else if(bankName.equals("hdfc")){
		Hdfc h = new Hdfc();
		h.createAcc();
		h.processLoan();
	}else if(bankName.equals("icici")){
		Icici i = new Icici();
		i.createAcc();
		i.processLoan();
	}
	
}
}
