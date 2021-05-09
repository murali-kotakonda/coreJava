package basics.loopsEx;

import java.util.Scanner;

/**
  1.take the input for a number
  2.print all the numbers from '1' til the input.
  
 */

public class Loop3 {
public static void main(String[] args) {
	//take THE input
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter number : ");
	int num = sc.nextInt();
	
	//run the for loop for 'num' times
	for(int i=1; i<= num; i++) {
		System.out.println(i);
	}
}
	
}

