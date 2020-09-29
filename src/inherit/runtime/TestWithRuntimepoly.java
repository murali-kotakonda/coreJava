package inherit.runtime;

import java.util.Scanner;

/**
  RBI : parent class
        - createAcc
        - processLoan
  HDFC, ICICI , SBI are child classes for RBI
  
  HDFC, ICICI , SBI  : overriding the processLoan() method
  
  Take Bank name as input
  if Bank name is "hdfc" then create obj for hdfc class and call createAcc() and processLoan() methods. 
  if Bank name is "sbi" then create obj for SBI Class and call createAcc() and processLoan() methods. 
  if Bank name is "icici" then create obj for ICICI and call createAcc() and processLoan() methods. 
 
 */
public class TestWithRuntimepoly {
	public static void main(String[] args) {
	
	//Take Bank name as input
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your salary bankname:");
		String salBank = sc.next();
		
		RBI r = null; // Creating the RBI variable , without obj
		
		// r can refer to either hdfc obj or sbi obj or icici obj.

		if (salBank.equals("hdfc")) {
			r = new Hdfc(); //create obj for HDFC and refer by RBI
		} else if (salBank.equals("sbi")) {
			r = new SBI();//create obj for SBI and refer by RBI
		} else if (salBank.equals("icici")) {
			r = new Icici();//create obj for Icici and refer by RBI
		} 
		
		r.createAcc();
		r.processLoan();
		
	}

}
