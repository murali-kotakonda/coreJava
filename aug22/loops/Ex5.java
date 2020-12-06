package loops;

import java.util.Scanner;

/**
  Req: 
  Take size as input
  find the factorial 
  
  i/P : 5
  o/P : 120  [ 1*2*3*4*5 ]
   
 */
public class Ex5 {
public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the size");
	int num = sc.nextInt();
	
	int fact =1;
	
	for( int i =1; i<=num ; i++) {
		fact = fact * i;
	}
	
	System.out.println(fact);
}
}
