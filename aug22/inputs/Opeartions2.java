package inputs;

import java.util.Scanner;

/**
 1.Take input for two integers
 
 2.Perform add, mul , sub , div , remainder for two integers
 3.print output in same line
 
 solution:
 Steps:
 1. create the scanner object;
 scanner helps to read input from console.
 
 for this import is required.
 import java.util.Scanner;
 Scanner sc = new Scanner(System.in);
 
 2. using scanner obj call the nextInt() method for taking the input
 */
public class Opeartions2 {

	public static void main(String[] args) {
		//create the scanner object
		Scanner sc = new Scanner(System.in);
		
		//call the nextInt() 
		System.out.println("enter num1");
		int n1= sc.nextInt();
		
		System.out.println("enter num2");
		int n2 = sc.nextInt();

		int sumValue = n1 + n2; //add
		int sub= n1- n2;  // sub
		int div = n1/n2; // quotient 
		int mul = n1* n2; // mul
		int rem = n1%n2; // remainder 
		
		// use '+' for joining multiple values
		System.out.println("addition result = " + sumValue +
						    " sub result = " + sub +
						    " div result = " + div +
						    " mul result = " +mul +
		                    " rem result = " + rem );
	}
}




