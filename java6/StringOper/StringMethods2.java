package StringOper;

import java.util.Scanner;

public class StringMethods2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any string");
		String input= sc.next();
		
		//check if the string starts with hi
		boolean check2 = input.startsWith("Hi");
		System.out.println("String starting  with Hi:: " + check2);
		
		//check if the string ends with bye
		boolean check1 = input.endsWith("bye");
		System.out.println("String ending with bye:: "+check1);
	}
}