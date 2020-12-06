package loops;

import java.util.Scanner;

/**
  Req: 
  Take size as input
  print sum of numbers from 1 till the input.
  
  #1
  i/p: 5
  o/P: 15   [ 1+ 2+ 3+ 4+ 5 ]
  
  #2
  i/p: 6
  o/P: 21   [ 1+ 2+ 3+ 4+ 5 + 6 ]
  
 */
public class Ex4 {
public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the size");
	int num = sc.nextInt();
	
	int sum =0;
	
	for( int i =1; i<=num ; i++) {
		sum = sum +i;
	}
	
	System.out.println(sum);
	
}
}
