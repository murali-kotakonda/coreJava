package inputs;

import java.util.Scanner;

/**
 Take the two double as input and print 
 
 Steps:
 1. create the scanner object;
 scanner helps to read input from console.
 
 for this import is required.
 import java.util.Scanner;
 Scanner sc = new Scanner(System.in);
 
 2. using scanner obj call the nextDouble() method for taking the input
 */
public class Ex4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);// sc is a variable/object
		
		//create the scanner object
		System.out.println("enter num1");
		double n1 = sc.nextDouble(); // store the value from console inside n1
		
		System.out.println("enter num2");
		double n2 = sc.nextDouble();// store the value from console inside n2

		System.out.println(n1);
		System.out.println(n2);
	}
}
