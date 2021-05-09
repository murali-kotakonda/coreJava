package basics.loopsEx;

import java.util.Scanner;

/**
  1.take the input for a number
  2.print the factorial of a number
  i/p: 5
  o/p: 120 ( 1 * 2 * 3 * 4 *5)
  
 */

public class Loop6 {
public static void main(String[] args) {
	//take THE input
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number : ");
	int num = sc.nextInt();
	
	//process
	int fact = 1;
	
	for(int i=1; i<= num ; i++) {
		fact =fact * i;
	}
	
	//print the output
	System.out.println("factorial = "+ fact);
}
	
}

