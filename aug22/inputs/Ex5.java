package inputs;

import java.util.Scanner;

/**
 Take the two STRINGS[words] as input and print 
 
 Steps:
 1. create the scanner object;
 scanner helps to read input from console.
 
 for this import is required.
 import java.util.Scanner;
 Scanner sc = new Scanner(System.in);
 
 2. using scanner obj call the next() method for taking the input
 */
public class Ex5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);// sc is a variable/object
		
		//create the scanner object
		System.out.println("enter text1");
		String n1 = sc.next(); // store the value from console inside n1
		
		System.out.println("enter text2");
		String n2 = sc.next();// store the value from console inside n2

		System.out.println(n1);
		System.out.println(n2);
	}
}
