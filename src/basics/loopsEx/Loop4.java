package basics.loopsEx;

import java.util.Scanner;

/**
  1.take the input for a number
  2.print sum of all the numbers from '1' till the input.
  i/p: 10
  o/p: 5 ( 1+ 2+ 3+ 4+5)
  
  i/p: 10
  o/p: 55 ( 1+ 2+ 3+ 4+5 +... +10)
  
 */

public class Loop4 {
public static void main(String[] args) {
	//take THE input
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number : ");
	int num = sc.nextInt();
	
	
	//process
	int sum =0 ;
	for(int i=1; i<= num ; i++) {
		sum = sum + i;
	}
	
	
	//print the output
	System.out.println("sum = "+ sum);
}
	
}

