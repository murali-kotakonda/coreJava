package conditions;

import java.util.Scanner;

/**
  take bankname(string) as input ,
  
  if bankname value is "sbi"  o/p => ROI = 10%
  
  if bankname value is "icici"  o/p => ROI = 11%  
  
  if bankname value is "hdfc"  o/p => ROI = 12%  
  
  if bankname value is "citi"  o/p => ROI = 13%  
  
  other than this o/p => invalid bank
  
  solution:
  1. nested if and else
  2. if and else_if
  3. 
  
 */
public class Ex81 {
public static void main(String[] args) {
	//take bankname(string) as input ,
	Scanner  sc = new Scanner(System.in);
	
	System.out.println("enter bank name:");
	String bankName = sc.next();
	
	if(bankName.equals("sbi")) {
		System.out.println("ROI = 10%");
	}
	else {
		if(bankName.equals("icici")) {
			System.out.println("ROI = 11%");
		}else {
			
			if(bankName.equals("hdfc")) {
				System.out.println("ROI = 12%");
			}
			else {
				
				if(bankName.equals("citi")) {
					System.out.println("ROI = 13%");
				}
				else {
					System.out.println("invalid bank");
				}
			}
		}
	}
}
}
