package conditions;
 
/**
  take bankname(string) as input ,
  
  if bankname value is "sbi"  o/p => ROI = 10%
  
  if bankname value is "icici"  o/p => ROI = 11%  
  
  if bankname value is "hdfc"  o/p => ROI = 12%  
  
  if bankname value is "citi"  o/p => ROI = 13%  
  
  other than this o/p => invalid bank
  
  
  solution:
  ---------------
  - use switch statement when one variable is compared with different values 
  - at a time only one condition is satisfied.
  - there is a dependency between conditions
  - switch  is just supports the readability
  
  - for every value write the case statement + logic + break;
 */
import java.util.Scanner;

public class Ex9 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter bank name in lower case:");
	String bankName = sc.next();
	
		switch (bankName) {
		case "sbi":
			System.out.println(" ROI = 10%");
			break;
		case "icici":
			System.out.println(" ROI = 11%");
			break;
		case "hdfc":
			System.out.println(" ROI = 12%");
			break;
		case "citi":
			System.out.println(" ROI = 13%");
			break;
		default:
			System.out.println(" Invalid bank .");
			break;
		}
	
}
}
