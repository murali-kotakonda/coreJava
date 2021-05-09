package conditions;


/**
 - execute the code only if the condition is satisfied.
 - conditional statements in java:
		 1. if
		 2. if and else
		 3. if and else if
		 4. switch
		 5. ternary

		int/float/double/long:
		------------------------
		==
		!=
		>
		<
		>=
		<=
		
		
		String:
		-------------
		==
		!=
		equals()
		 
 */

import java.util.Scanner;
/**
	Take two numbers as input and check if the two numbers are equal or not
 */
public class Ex1 {
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter num1: ");
	int a = sc.nextInt();
	
	System.out.println("Enter num2: ");
	int b = sc.nextInt();
	
	
	if( a == b) {
		System.out.println("numbers are equal");
	}else {
		System.out.println("numbers are not equal");
	}
}
}





