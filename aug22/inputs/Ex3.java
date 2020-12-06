package inputs;

import java.util.Scanner;

/**
 Take the two float as input and print 
 
 Steps:
 1. create the scanner object;
 scanner helps to read input from console.
 
 for this import is required.
 import java.util.Scanner;
 Scanner sc = new Scanner(System.in);
 
 2. using scanner obj call the nextFloat() method for taking the input
 */
public class Ex3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);// sc is a variable/object
		
		//create the scanner object
		System.out.println("enter num1");
		float n1 = sc.nextFloat(); // store the value from console inside n1
		
		System.out.println("enter num2");
		float n2 = sc.nextFloat();// store the value from console inside n2

		System.out.println(n1);
		System.out.println(n2);
	}
}
