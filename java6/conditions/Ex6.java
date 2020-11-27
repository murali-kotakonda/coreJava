package conditions;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter bank name");
		String bankName = sc.next();
		
		// switch --> one variable comparing with multiple values.
		switch(bankName) {
		
		case "sbi":  System.out.println("10%"); break;
		case "hdfc":  System.out.println("11%"); break;
		case "icici":  System.out.println("12%"); break;
		case "citi":  System.out.println("13%"); break;
		default : System.out.println("invalid bank"); break;
		
		}
		
 	}
}
