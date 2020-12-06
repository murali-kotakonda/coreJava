package conditions;

import java.util.Scanner;

/**
 take bank as input.
 
 if bank value is "sbi" , print "ROI is 10%"
 if bank value is "icici" , print "ROI is 11%"
 if bank value is "hdfc" , print "ROI is 12%"
 if bank value is "citi" , print "ROI is 13%"
 for any other value ,print "invalid bank"
 
 solution : if and else if

 */
public class Ex7 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);// sc is a variable/object
	//take id, userType , age as input
	
	System.out.println("Enter bank name");
	String bank = sc.next();
	
	if(bank.equals("sbi")) {
		System.out.println("ROI is 10%");
	}
	else if(bank.equals("icici")) {
		System.out.println("ROI is 11%");
	}
	else if(bank.equals("hdfc")) {
		System.out.println("ROI is 12%");
	}
	else if(bank.equals("citi")) {
		System.out.println("ROI is 13%");
	}else {
		System.out.println("invalid bank");
	}
	
}
}
