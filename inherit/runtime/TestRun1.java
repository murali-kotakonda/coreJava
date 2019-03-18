package inherit.runtime;

import java.util.Scanner;

public class TestRun1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String bankName = sc.next();
	
	
	RBI r = null;
	if(bankName.equals("sbi")){
		r = new SBI();
	}else if(bankName.equals("hdfc")){
		r = new Hdfc();
	}else if(bankName.equals("icici")){
		r = new Icici();
	}
	
	r.createAcc();
	r.processLoan();
	
}
}
