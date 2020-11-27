package StringOper;

import java.util.Scanner;

public class StringMethods3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two strings");
		String input1= sc.next();
		String input2= sc.next();
		
		// compare two string by ingnoring the case ex:: comparing user name
		System.out.println("compare with equalsIgnoreCase  ::" + input1.equalsIgnoreCase(input2));

		// compare two string with exact match ex:: comparing password
		System.out.println("compare with equals::" + input1.equals(input2));
	}
}