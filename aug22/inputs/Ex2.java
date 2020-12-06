package inputs;

import java.util.Scanner;

/**
 Take the two long as input and print 
 
 Steps:
 1. create the scanner object;
 scanner helps to read input from console.
 
 for this import is required.
 import java.util.Scanner;
 Scanner sc = new Scanner(System.in);
 
 2. using scanner obj call the nextLong() method for taking the input
 */
public class Ex2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);// sc is a variable/object
		
		//create the scanner object
		System.out.println("enter num1");
		long n1 = sc.nextLong(); // store the value from console inside n1
		
		System.out.println("enter num2");
		long n2 = sc.nextLong();// store the value from console inside n2

		System.out.println(n1);
		System.out.println(n2);
	}
}
