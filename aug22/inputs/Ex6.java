package inputs;

import java.util.Scanner;

/**
 Take the a STRING[sentence] as input and print 
 
 Steps:
 1. create the scanner object;
 scanner helps to read input from console.
 
 for this import is required.
 import java.util.Scanner;
 Scanner sc = new Scanner(System.in);
 
 2. using scanner obj call the nextLine() method for taking the input
 
 next() -> for taking word as input
 nextLine() -> for taking sentence as input
 */
public class Ex6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);// sc is a variable/object
		
		//create the scanner object
		System.out.println("enter text1");
		String n1 = sc.nextLine(); // store the value from console inside n1
		
		System.out.println("enter text2");
		String n2 = sc.nextLine();// store the value from console inside n2

		System.out.println(n1);
		System.out.println(n2);
	}
}
