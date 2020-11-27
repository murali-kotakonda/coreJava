package conditions;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// take bank name  as input
		// if bank name is "sbi"  print 10%
		// if bank name is "hdfc"  print 11%
		// if bank name is "icici"  print 12%
		// if bank name is "citi"  print 13%
        // if not print invalid bank
		
		// take bank name  as input
		System.out.println("enter bank name");
		String bankName = sc.next();
		
		if(bankName.equals("sbi")) {
			System.out.println("10%");
		}
		else if (bankName.equals("hdfc")) {
			System.out.println("11%");
		}
		else if (bankName.equals("icici")) {
			System.out.println("12%");
		}
		else if (bankName.equals("citi")) {
			System.out.println("13%");
		}
		else {
			System.out.println("invalid bank");
		}
		
 	}
}
