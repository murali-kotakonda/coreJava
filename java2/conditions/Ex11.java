package conditions;

import java.util.Scanner;
/**
 * @author I335484 take bankname(string) as input , if bankname value is "sbi"
 *         o/p => ROI = 10% if bankname value is "icici" o/p => ROI = 11% if
 *         bankname value is "hdfc" o/p => ROI = 12% if bankname value is "citi"
 *         o/p => ROI = 13% other than this o/p => invalid bank
 */
public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// sc is point of contact for console

		System.out.println("enter bank name");
		String bankname = sc.next();

		if (bankname.equals("sbi")) {
			System.out.println("10%");
		} else if (bankname.equals("icici")) {
			System.out.println("11%");
		} else if (bankname.equals("hdfc")) {
			System.out.println("12%");
		} else if (bankname.equals("citi")) {
			System.out.println("13%");
		} else {
			System.out.println("invaid bank");
		}
	}

}
